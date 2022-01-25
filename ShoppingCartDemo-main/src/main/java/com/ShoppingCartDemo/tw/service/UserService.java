package com.ShoppingCartDemo.tw.service;

import com.ShoppingCartDemo.tw.model.entity.User;
import com.ShoppingCartDemo.tw.model.request.UserInsertRequest;
import com.ShoppingCartDemo.tw.model.request.UserLoginRequest;
import com.ShoppingCartDemo.tw.model.response.UserInsertResponse;
import com.ShoppingCartDemo.tw.model.response.UserLoginResponse;

public interface UserService {
    UserLoginResponse login(UserLoginRequest request);
    void setCoin(User user, Integer totalPrice);
    UserInsertResponse addUser(UserInsertRequest userInsertRequest);
}
