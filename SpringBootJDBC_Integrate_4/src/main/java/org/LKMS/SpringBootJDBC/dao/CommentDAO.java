package org.LKMS.SpringBootJDBC.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.LKMS.SpringBootJDBC.model.CommentInfo;
import org.LKMS.SpringBootJDBC.model.MemberInfo;
import org.LKMS.SpringBootJDBC.model.RestaurantInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.LKMS.SpringBootJDBC.Entity.Comment;
import org.LKMS.SpringBootJDBC.Entity.MemberEntity;
import org.LKMS.SpringBootJDBC.Repository.CommentCreateRepository;

@Repository
public class CommentDAO {
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private CommentCreateRepository commentCreateRepository;
	
	private CommentInfo commentInfo;

	public CommentDAO() {

	}
	public List<CommentInfo> listCommentInfo(Long restaurantId) {
		
//		SELECT comment.content, memberinfo.name
//		FROM comment
//		INNER JOIN memberinfo
//		ON comment.member_id=memberinfo.id;
		String sql = "Select new " + CommentInfo.class.getName() + "(C.Content,C.CreateDate,MB.name)"
				+ " from " + Comment.class.getName() + " C "
				+ " INNER JOIN " + MemberEntity.class.getName() + " MB "
				+" ON C.memberId=MB.Id"+" WHERE restaurant_id=" + restaurantId;
		Query query = entityManager.createQuery(sql, CommentInfo.class);
		return query.getResultList();
	}
	
	public void addComment(String newComment) {
	    Comment comment = new Comment();
	    comment.setMemberId(1);
	    comment.setRestaurantId(1);
	    comment.setCreateDate(null);
	    comment.setContent(newComment);
	    Comment res = commentCreateRepository.save(comment);
	    System.out.println("after insert res: "+ res);
	}
}

