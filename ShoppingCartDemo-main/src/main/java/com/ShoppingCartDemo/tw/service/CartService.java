package com.ShoppingCartDemo.tw.service;

import com.ShoppingCartDemo.tw.model.entity.Product;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

public interface CartService {
    void addCart(HttpSession session, Product product, Integer needQuantitiy, Integer allNeedQuantity);
    void removeCar(Model model, HttpSession session,Integer pid);

}