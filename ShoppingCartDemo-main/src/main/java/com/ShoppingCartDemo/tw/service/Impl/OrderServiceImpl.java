package com.ShoppingCartDemo.tw.service.Impl;

import com.ShoppingCartDemo.tw.model.entity.Order;
import com.ShoppingCartDemo.tw.model.entity.Product;
import com.ShoppingCartDemo.tw.model.entity.User;
import com.ShoppingCartDemo.tw.model.response.OrderSelectResponse;
import com.ShoppingCartDemo.tw.repository.OrderRepository;
import com.ShoppingCartDemo.tw.repository.ProductRepository;
import com.ShoppingCartDemo.tw.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;
    ProductRepository productRepository;

    @Override
    public void addOrder(Order order, List<Product> orderProductList, Integer totalPrice, User user) {
        order.setProducts(orderProductList);
        order.setOrdertime(new Date());
        order.setStatus("待出貨");
        order.setTotalprice(totalPrice);
        order.setUser(user);
        orderRepository.save(order);
    }

    @Override
    public void showOrder(Model model, HttpSession session, Integer pageIndex, Integer pageSize) {
        PageRequest page = PageRequest.of(pageIndex, pageSize, Sort.Direction.ASC, "oid");
        Page<OrderSelectResponse> allByPage = orderRepository.findAllByUname(((String) session.getAttribute("uname")), page);
        if (session.getAttribute("uname") != null) model.addAttribute("OrderList", allByPage);
    }


//    @Override
//    public List<ProductSelectResponse> addCar(Integer pid, Integer needQuantitiy) {
//        Product oldProduct = productRepository.findById(pid).get();
//        Integer oldPquantity = oldProduct.getPquantity();
//        if(needQuantitiy<=oldPquantity){
//            Integer newPquantity=(oldPquantity-needQuantitiy);
////            oldProduct.setPquantity(newPquantity);
//        }
//
//        return null;
//    }
}
