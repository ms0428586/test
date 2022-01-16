<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>	 
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8" crossorigin="anonymous"></script>
    <link rel=stylesheet type="text/css" href="css/main.css">
    <style>
        .box1 {
            width: 400px;
            padding: 25px;
            margin: 50px auto;
            color: #0a0a0a;
            background-color: antiquewhite;
        }
        
        img[alt $="logo"] {
            width: 80px;
            height: 80px;
        }
    </style>
</head>
<body>
    <script src="js/main.js"></script>
    <br>
    <br>
    <br>
    <div style="border: solid 5px #6B7A8F;" class="box1">
        <div class="container">
            <h3>隨意吃,登入</h3>
            <form action="<c:url value="/secure/login.controller" />" method="get">
                <div class="mb-3">
                    <label for="useraccount" class="form-label">帳號</label>
                    <input type="account" class="form-control" id="useraccount" placeholder="輸入帳號" value="${param.username}">
                </div>
                <div class="mb-3">
                    <label for="userpasswd" class="form-label">密碼</label>
                    <input type="password" class="form-control" id="userpasswd" placeholder="輸入密碼" value="${param.userpasswd}">
                    <p><a href="(網址)">忘記密碼</a></p>
                </div>
                <button type="submit" class="btn btn-success">登入</button>
                <button type="submit" class="btn btn-primary">註冊</button>
                <hr>
                <h3>用第三方平台登入:</h3>
                <img src="img\facebook.png" alt="fb logo">
                <img src="img\google.png" alt="google logo">
                <img src="img\LINE.png" alt="line logo">
            </form>
        </div>
    </div>
    <script src="js/bootstrap.bundle.min.js"></script>
</body>

</html>