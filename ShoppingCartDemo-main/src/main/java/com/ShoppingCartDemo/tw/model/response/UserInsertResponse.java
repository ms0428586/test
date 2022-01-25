package com.ShoppingCartDemo.tw.model.response;

import com.ShoppingCartDemo.tw.model.entity.User;

public class UserInsertResponse {
    private String uname;
    private String ErrMsg;

    public UserInsertResponse(){}
    public UserInsertResponse(String errMsg){
        this.setErrMsg(errMsg);
    }
    public UserInsertResponse(User user, String errMsg){
        this.uname=user.getUname();
        this.ErrMsg=errMsg;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getErrMsg() {
        return ErrMsg;
    }

    public void setErrMsg(String errMsg) {
        ErrMsg = errMsg;
    }
}
