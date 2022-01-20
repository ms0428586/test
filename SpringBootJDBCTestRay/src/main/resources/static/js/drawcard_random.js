/**
 * 
 */

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

function random_change() {
    document.getElementById("random_img").innerHTML = '<img src="' + randomImage[GetRnd(0, num)] + '"style="width: 100px; height: 100px;" class="img-fluid">';
}

function random_start() {
    clearInterval(timer);
    timer = setInterval('random_change()', 10);
}

function random_ok() {
    clearInterval(timer);
    document.getElementById("showresult").value = document.getElementById("oknum").innerText;
}

function GetRnd(min, max) {
    return Math.floor(Math.random() * randomImage.length);
}
// discount

function discount_change() {
    document.getElementById("discount_img").innerHTML = '<img src="' + randomImage[GetRnd(0, num)] + '"style="width: 100px; height: 100px;" class="img-fluid">';
}

function discount_start() {
    clearInterval(timer);
    timer = setInterval('discount_change()', 10);
}

function discount_ok() {
    clearInterval(timer);
    document.getElementById("showresult").value = document.getElementById("oknum").innerText;
}

// promotions
var promotions_fruits = []
if (promotions_fruits.length <= 0) {
    promotions_fruits = [
        "01", "02", "03", "04",
        "05", "06", "07", "08", "09"
    ];

}



function promotions_change(chcc) {
    // document.getElementById(`promotions_fruits${chcc}`).innerHTML = ' <figure id="figure"><span><img src="' + randomImage[GetRnd(0, num)] + '" style="width: 210px; height: 200px;" class="img-fluid"></span><figcaption class="figure-caption"></figcaption></figure>';
    document.getElementById(`promotions_fruits${chcc}`).innerHTML = `<figure id="figure"><span> <img src=${randomImage[GetRnd(0, num)]} style="width: 100px; height: 100px;"class="img-fluid"> </span><figcaption class="figure-caption"></figcaption></figure>`;
}


function promotions_start() {
    var chc = Math.floor(Math.random() * 9 + 1)
    var i = 0;
    if (promotions_fruits.length > 0) {
        var r = Math.floor(Math.random() * promotions_fruits.length);
        var n = promotions_fruits[r];

        for (i = 0; i < promotions_fruits.length; i++) {
            if (promotions_fruits[i] == n) {
                promotions_fruits.splice(i, 1);
                i--;
            }
        }

        clearInterval(timer);
        timer = setInterval(`promotions_change("${n}")`, 10);
    }

}

function promotions_ok() {
    clearInterval(timer);
    document.getElementById().value = document.getElementById("figure").innerText;
}

// function promotions_reset() {
//     document.getElementById(`promotions_card`).innerHTML =
// }

// foodcard
var foodcard_fruits = [
    "01", "02", "03", "04",
    "05", "06", "07", "08", "09"
];

function foodcard_change(chcc) {
    document.getElementById(`foodcard_fruits${chcc}`).innerHTML = `<figure id="figure"><span> <img src=${randomImage[GetRnd(0, num)]} style="width: 100px; height: 100px;"class="img-fluid"> </span><figcaption class="figure-caption"></figcaption></figure>`;
}

function get_foodcard() {
    if (foodcard_fruits.length <= 0) {
        document.getElementById(`foodcard`).innerHTML = '<span><img src="/img/map.png" style="width: 210px; height: 200px;"></span>';
    };
}

function foodcard_start() {
    var chc = Math.floor(Math.random() * 9 + 1)
    var i = 0;
    if (foodcard_fruits.length > 0) {
        var r = Math.floor(Math.random() * foodcard_fruits.length);
        var n = foodcard_fruits[r];

        for (i = 0; i < foodcard_fruits.length; i++) {
            if (foodcard_fruits[i] == n) {
                foodcard_fruits.splice(i, 1);
                i--;
            }
        }

        clearInterval(timer);
        timer = setInterval(`foodcard_change("${n}")`, 10);
    }

}

function foodcard_ok() {
    clearInterval(timer);
    document.getElementById().value = document.getElementById("figure").innerText;
}