package com.ShoppingCartDemo.tw.service;

import com.ShoppingCartDemo.tw.model.entity.Cart;
import com.ShoppingCartDemo.tw.model.entity.Order;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.Map;

public interface Order_ProductDetailService {
    void addDetail(Map<Integer, Cart> map, Order order);
    void showOrderDetail(Model model, HttpSession session, Integer oid);

}