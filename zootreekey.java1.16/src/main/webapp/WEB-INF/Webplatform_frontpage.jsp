<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <link rel=stylesheet type="text/css" href="css/main.css">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous"> -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8"
            crossorigin="anonymous"></script>
    </head>

    <body>
        <script src="js/main.js"></script>
           <div id="bannerImage">
               <div class="container">
                   <center>
                   <div id="bannerContent">
                       <h1>平台名稱</h1>
                       <a href="mytask_instruction.html" class="btn btn-danger">我的任務</a>
                       <a href="Webplatform_choosestore.html" class="btn btn-danger">美食雷達</a>
                       <a href="products.php" class="btn btn-danger">我是店家</a>
                   </div>
                    <div class="container">
                    <div id="bannerContent">
                        <h5>請輸入你的地址</h5>
                            <input type="search" id="site-search" aria-label="Search through site content">
                            <button class="btn btn-danger">搜尋</button>
                    </div>
                    </div>
                   </center>
               </div>
           </div>
                    
           <div class="container">
               <div class="row">
                   <div class="col-xs-4">
                       <div  class="thumbnail">
                           <a href="products.php">
                                <img src="img/台北市.jpeg" alt="Camera">
                           </a>
                           <center>
                                <div class="caption">
                                    <p id="autoResize">台北市</p>
                                </div>
                           </center>
                       </div>
                   </div>
                   <div class="col-xs-4">
                       <div class="thumbnail">
                           <a href="products.php">
                               <img src="img/台中市.jpeg" alt="Watch">
                           </a>
                           <center>
                                <div class="caption">
                                    <p id="autoResize">台中市</p>
                                </div>
                           </center>
                       </div>
                   </div>
                   <div class="col-xs-4">
                       <div class="thumbnail">
                           <a href="products.php">
                               <img src="img/高雄市.jpeg" alt="Shirt">
                           </a>
                           <center>
                               <div class="caption">
                                   <p id="autoResize">高雄市</p>
                               </div>
                           </center>
                       </div>
                   </div>
               </div>
           </div>

    <div id="bannerImage">
        <div class="container">
            <center>
                <div id="bannerContent">
                    <h1>抽卡決定你的下一餐！</h1>
                    <a href="products.php" class="btn btn-danger">??????????</a>
                </div>
            </center>
        </div>
    </div>

    <br><br> <br><br><br><br>

           <footer class="footer"> 
               <div class="container">
               <center>
                   <p>This website is developed by 期末專題EEIT36</p>
               </center>
               </div>
           </footer>

           <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
    </body>
</html>