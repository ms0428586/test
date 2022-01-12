// var alldata =
//     "linkweb,sharejs,csdn,google,baidu,msn,qq,cctv,microsoft,adobe"
// var alldataarr = alldata.split(",");
var randomImage = new Array();

//insert the URL of images in array  
randomImage[0] = "img/mytask_drawcard/a1.jpg";
randomImage[1] = "img/mytask_drawcard/a2.jpg";
randomImage[2] = "img/mytask_drawcard/a3.jpg";
randomImage[3] = "img/mytask_drawcard/a4.jpg";
randomImage[4] = "img/mytask_drawcard/a5.jpg";
randomImage[5] = "img/mytask_drawcard/a6.jpg";
randomImage[6] = "img/mytask_drawcard/a7.jpg";
randomImage[7] = "img/mytask_drawcard/a8.jpg";
randomImage[8] = "img/mytask_drawcard/a9.jpg";
randomImage[9] = "img/mytask_drawcard/a10.jpg";
var num = randomImage.length;
var timer

function change() {
    document.getElementById("oknum").innerHTML = '<img src="' + randomImage[GetRnd(0, num)] + '" style="width: 400px; height: 400px;">';
}

function start() {
    clearInterval(timer);
    timer = setInterval('change()', 10);
}

function ok() {
    clearInterval(timer);
    document.getElementById("showresult").value = document.getElementById("oknum").innerText;
}

function GetRnd(min, max) {
    return Math.floor(Math.random() * randomImage.length);
}