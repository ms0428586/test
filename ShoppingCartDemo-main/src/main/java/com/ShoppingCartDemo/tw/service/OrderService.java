package com.ShoppingCartDemo.tw.service;

import com.ShoppingCartDemo.tw.model.entity.Order;
import com.ShoppingCartDemo.tw.model.entity.Product;
import com.ShoppingCartDemo.tw.model.entity.User;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface OrderService {
//    public List<ProductSelectResponse> addCar(Integer pid,Integer needQuantitiy);
    void addOrder(Order order, List<Product> orderProductList, Integer totalPrice, User user);
    void showOrder(Model model, HttpSession session,Integer pageIndex, Integer pageSize);
}
