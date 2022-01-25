package com.ShoppingCartDemo.tw.repository;

import com.ShoppingCartDemo.tw.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {
    User findByUname(String uname);
}
