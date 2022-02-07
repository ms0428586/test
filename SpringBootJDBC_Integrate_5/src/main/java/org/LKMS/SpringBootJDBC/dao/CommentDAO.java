package org.LKMS.SpringBootJDBC.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.LKMS.SpringBootJDBC.model.CommentInfo;
import org.LKMS.SpringBootJDBC.model.CommentRecordInfo;
import org.LKMS.SpringBootJDBC.model.MemberInfo;
import org.LKMS.SpringBootJDBC.model.RestaurantInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.LKMS.SpringBootJDBC.Entity.Comment;
import org.LKMS.SpringBootJDBC.Entity.MemberEntity;
import org.LKMS.SpringBootJDBC.Entity.Restaurant;
import org.LKMS.SpringBootJDBC.Repository.CommentCreateRepository;

@Repository
public class CommentDAO {
	@Autowired
	private EntityManager entityManager;
	
	private CommentInfo commentInfo;
	@Autowired
	private CommentCreateRepository commentCreateRepository;

	public CommentDAO() {

	}
	public List<CommentInfo> listCommentInfo(Long restaurantId) {
		
//		SELECT comment.content, memberinfo.name
//		FROM comment
//		INNER JOIN memberinfo
//		ON comment.member_id=memberinfo.id;
		String sql = "Select new " + CommentInfo.class.getName() + "(C.Content,C.CreateDate,MB.name,MB.photo)"
				+ " from " + Comment.class.getName() + " C "
				+ " INNER JOIN " + MemberEntity.class.getName() + " MB "
				+" ON C.memberId=MB.Id"+" WHERE restaurant_id=" + restaurantId;
		Query query = entityManager.createQuery(sql, CommentInfo.class);
		return query.getResultList();
	}
	
public List<CommentRecordInfo> FindCommentRecordInfo(Long userID) {
		System.out.println("CommentRecordInfo");
		String sql = "Select new " 
				+ CommentRecordInfo.class.getName() 
				+ "(MB.photo,MB.name,C.Content,C.CreateDate,R.restaurantName,R.restaurantCategory,R.restaurantImg,R.restaurantId)"
				+" from " + Comment.class.getName() + " C "
				+" INNER JOIN " + MemberEntity.class.getName() + " MB "
				+" ON C.memberId=MB.Id "
				+" INNER JOIN " + Restaurant.class.getName()+ " R "
				+" ON C.restaurantId=R.restaurantId "
				+" WHERE member_id=" + userID;
		System.out.println("CommentRecordInfo--SQL OK");
		Query query = entityManager.createQuery(sql, CommentRecordInfo.class);
		System.out.println("CommentRecordInfo--createQuery OK");
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

@Transactional
public int deleteComment(Long id,Long mid) {
	String sql = "DELETE "
			+" from " + Comment.class.getName() + " C "
			+"WHERE restaurantId="+id
			+" AND memberId="+mid;
	Query query = entityManager.createQuery(sql);
	System.out.println(query);

	int count =query.executeUpdate();
	System.out.println("deleteComment OK");
	return count;
}
}
