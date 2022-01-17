function addfoodrecord() {

    document.getElementById("add_foodrecord_content").innerHTML = `  <div class="row" >
    <div class="mytask__foodrecord__img col-2 " style="text-align: center;">
        <img src=" img/logo_2.png " class="img-fluid rounded-start " alt="... ">
    </div>
    <div class="col-8 ">
        <div class="cardbody ">
            <div class=" ">
                <h6>店家:</h6>
                <h6>餐點:</h6>
                <h6>評分:</h6>
                <h6>心得:</h6>
                <h6>編號:</h6>
                <h6>任務方式:</h6>
                <h6>日期:</h6>
            </div>

        </div>
    </div>
    <div class="col-2 ">
        <!-- Button trigger modal -->
        <div class="edit_btn_row ">
            <a class="edit_btn btnt" type="button" data-bs-toggle="modal" data-bs-target="#modifyinformation ">修改內容</a>
        </div>

    </div>
</div>`
}