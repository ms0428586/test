package org.LKMS.SpringBootJDBC.Repository;

import org.LKMS.SpringBootJDBC.Entity.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentCreateRepository extends CrudRepository<Comment, Integer>{

}
