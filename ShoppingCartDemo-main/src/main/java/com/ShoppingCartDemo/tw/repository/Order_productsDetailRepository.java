package com.ShoppingCartDemo.tw.repository;

import com.ShoppingCartDemo.tw.model.entity.Order_productsDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order_productsDetailRepository extends JpaRepository<Order_productsDetail, Integer> {
}
