package org.LKMS.SpringBootJDBC.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.LKMS.SpringBootJDBC.model.CommentInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.LKMS.SpringBootJDBC.Entity.Comment;


@Repository
public class CommentDAO {
	@Autowired
	private EntityManager entityManager;
	
	public CommentDAO(){
		
	}
	public List<CommentInfo> listCommentInfo(Long restaurantId) {
		
		String sql = "Select new " + CommentInfo.class.getName() 
				+ "(C.Id ,C.customerId,C.restaurantId,C.Content)" 
				+ " from " + Comment.class.getName() + " C WHERE restaurantId=" + restaurantId ;
		System.out.println("SQL:" +sql);
		Query query = entityManager.createQuery(sql, CommentInfo.class);
		System.out.println("query");
		System.out.println(query.getResultList().isEmpty());

		return query.getResultList();
	}
	
	
	

}
