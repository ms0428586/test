var starButton = document.getElementById('startButton');
var cardShow = document.getElementById('cardShow');
var Li = document.getElementById('countArea').getElementsByTagName('li');
var countAready = 0;//定義抽卡次數
var countChange = 0;//定義機會卡
var evilIndex = 0;//定義惡魔值
var meeting = true;//定義一個閥值，遇到淘汰卡為假，沒遇到為真，為後面裁決玩家是否被淘汰的判斷程式碼提供資訊

starButton.onclick = function () {
    // 隨機數決定抽卡的卡號和惡魔值，惡魔值=卡號=i
    i = Math.floor(Math.random() * 10);
    cardShow.style.backgroundImage = 'url(./img/evil' + i + '.jpg)';
    countAready++;//每點選一次就記錄一次抽卡次數
    // 更據隨機數i和是否遇見淘汰卡meeting來決定玩家資料
    if (i == 1) {
        meeting = false;
    }
    else if (i == 5 && meeting != false) {
        countChange++;
        evilIndex += i;
        alert('恭喜獲得機會卡牌');
    } else if (countChange > 0 && meeting == false) {
        countChange--;
        evilIndex -= i;
        meeting = true;
        alert('遺憾的是，這是張淘汰卡;幸運的是因為機會卡的庇佑，你只是失去的惡魔值為' + evilIndex + '，而不會被淘汰');
    } else if (countChange <= 0 && meeting == false) {
        meeting = true;
        alert('很抱歉，你是個悲哀的惡魔，不幸抽中淘汰卡，孤獨的你將面對關閉的地獄大門!最後你獲得的惡魔值為' + evilIndex);
        for (var z = 0; z < Li.length; z++) {
            Li[z].style.visibility = 'hidden';
            starButton.style.visibility = 'hidden';
            cardShow.style.backgroundImage = 'url(./img/gameover.jpg)';
            document.body.style.backgroundColor = 'red';
        }
    } else {
        evilIndex += i;
    }

    //改變玩家資料
    Li[0].innerHTML = '已抽卡次數：' + countAready;
    Li[1].innerHTML = '機會卡：' + countChange;
    Li[2].innerHTML = '惡魔值：' + evilIndex;
}