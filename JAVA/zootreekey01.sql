-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:3306
-- 產生時間： 2022-02-07 12:03:19
-- 伺服器版本： 5.7.24
-- PHP 版本： 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫： `zootreekey01`
--

-- --------------------------------------------------------

--
-- 資料表結構 `comment`
--

CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL,
  `member_id` bigint(20) NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `content` varchar(255) NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `comment`
--

INSERT INTO `comment` (`id`, `member_id`, `restaurant_id`, `content`, `create_date`) VALUES
(1, 1, 1, '好吃', '2022-01-29 14:25:40'),
(2, 1, 2, '好吃到爆', '2022-01-29 14:26:25'),
(3, 2, 1, '我是老五', '2022-01-29 14:26:51'),
(4, 3, 3, '好吃一直吃', '2022-01-29 14:27:07'),
(5, 3, 1, '服務超好', '2022-02-07 02:10:48');

-- --------------------------------------------------------

--
-- 資料表結構 `memberinfo`
--

CREATE TABLE `memberinfo` (
  `id` bigint(20) NOT NULL,
  `account` varchar(225) NOT NULL,
  `name` varchar(225) NOT NULL,
  `password` varchar(225) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` int(225) NOT NULL,
  `photo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 傾印資料表的資料 `memberinfo`
--

INSERT INTO `memberinfo` (`id`, `account`, `name`, `password`, `email`, `phone`, `photo`) VALUES
(1, 'zootreekey', '帥哥', 'qweasd', '123456@yahoo.com.tw', 98778778, '/img/image_preview.jpg'),
(2, 'zootreekey1', '老七', 'qweasd', 'qq170010pp@yahoo.com.tw', 979178176, '/img/UserPhoto01.png'),
(3, 'zootreekey2', '紅心A', 'qweasd', '878@gmail.com', 987000000, '/img/UserPhoto02.png'),
(4, 'zootreekey3', '黑桃7', 'qweasd', '123@gmail.com', 979178176, '/img/UserPhoto03.png'),
(5, 'zootreekey4', '紅心5', 'asdasd', '321@gmail.com', 979178176, '/img/UserPhoto04.png');

-- --------------------------------------------------------

--
-- 資料表結構 `restaurant`
--

CREATE TABLE `restaurant` (
  `restaurant_id` bigint(20) NOT NULL,
  `restaurant_category` varchar(255) NOT NULL,
  `restaurant_name` varchar(255) NOT NULL,
  `restaurant_address` varchar(255) DEFAULT NULL,
  `restaurant_price` varchar(255) NOT NULL,
  `restaurant_phone` varchar(255) NOT NULL,
  `business_hours` varchar(255) NOT NULL,
  `restaurant_city` varchar(255) NOT NULL,
  `restaurant_img` varchar(255) DEFAULT NULL,
  `restaurant_web` varchar(255) DEFAULT NULL,
  `restaurant_map` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `restaurant`
--

INSERT INTO `restaurant` (`restaurant_id`, `restaurant_category`, `restaurant_name`, `restaurant_address`, `restaurant_price`, `restaurant_phone`, `business_hours`, `restaurant_city`, `restaurant_img`, `restaurant_web`, `restaurant_map`) VALUES
(1, '速食店', '麥當勞-台中公益二店', '台中市南屯區公益路二段128號', '$$', '+886423285051', '00:00-24:00', '台中市', '/img/RestaurantLogoImg/McDonald.jpg', 'https://www.mcdonalds.com/tw/zh-tw.html', 'https://goo.gl/maps/dv9kGjYfHagRuWie9'),
(2, '速食店', '肯德基KFC-台中公益餐廳', '台中市西區公益路163號', '$$', '+886423027066', '11:00-23:00', '', '/img/RestaurantLogoImg/KFC.png', 'https://www.facebook.com/kfctaiwan/', 'https://goo.gl/maps/B7uP7PJ7sqLAUs8K9'),
(3, '速食店', '漢堡王Burger King台中公益店', '台中市西區公益路152-5號', '$$', '+886423200922', '10:00-22:00', '台中市', '/img/RestaurantLogoImg/BurgerKing.jpg', 'https://www.burgerking.com.tw/branchweb', 'https://goo.gl/maps/7i3enNzZ85FkH14EA'),
(6, '港式', '廚窗港點 士林官邸店', '臺北市士林區福林路190跟188號', '均消$660', '0228806565', '11:30-14:30\r\n17:30-21:00', '台北市', '/img/RestaurantLogoImg/台北-廚窗港點.jpg', 'https://reurl.cc/44dDyj', 'https://reurl.cc/OpraX3'),
(7, '台式', '款待 手路菜', '臺北市中山區中山北路一段53巷32號', '均消$1100', '0225676097', '11:30-14:00\r\n17:30-21:30', '台北市', '/img/RestaurantLogoImg/台北-款待台菜.jpeg', 'https://reurl.cc/7edAry', 'https://reurl.cc/2DjArE'),
(8, '日式\r\n燒肉\r\n火鍋', '金洹苑 KIN KAN EN', '臺北市大安區延吉街131巷31號', '均消$1100', '0287720109', '11:30-14:30\r\n17:30-22:00', '台北市', '/img/RestaurantLogoImg/台北-金洹苑.jpeg', 'https://reurl.cc/jky48m', 'https://reurl.cc/3j4Aa9'),
(9, '台式\r\n麵包\r\n糕點', '和泰興', '新北市板橋區陽明街3號', '均消$60', '0222582562', '08:00-22:30', '新北市', '/img/RestaurantLogoImg/台北-和泰興.jpeg', 'https://reurl.cc/l9yb5d', 'https://reurl.cc/5GdL2M'),
(10, '泰式', '水上米 泰式料理餐廳', '新北市新莊區幸福路821號', '均消$250', '0287899789', '11:00-14:00\r\n16:30-21:00', '新北市', '/img/RestaurantLogoImg/台北-水上米.jpeg', 'https://reurl.cc/3j4A59', 'https://reurl.cc/WkNYXe'),
(11, '韓式\r\n燒肉', '咚豬咚豬。韓國烤肉吃到飽（台中公益大墩店）', '臺中市南屯區大墩路696號', '均消$399', '0423272227', '11:30-16:00\r\n17:00-22:30', '台中市', '/img/RestaurantLogoImg/台中-咚豬咚豬.jpeg', 'https://reurl.cc/jky451', 'https://reurl.cc/ZrVd7p'),
(12, '火鍋', '宮秸火鍋', '臺中市南屯區益豐路四段500號', '均消$698', '0423829589', '11:30-01:00', '台中市', '/img/RestaurantLogoImg/台中-宮秸火鍋.png', 'https://reurl.cc/Y9qAWx', 'https://reurl.cc/Ep69n1'),
(13, '義式\r\n美式', '眺高 STAY WITH MOUNTAIN', '臺中市北屯區部子路700巷11弄36號', '均消$500', '0424390886', '一～五 16:00-00:00\r\n六日 11:30-00:00', '台中市', '/img/RestaurantLogoImg/台中-眺高.jpeg', 'https://reurl.cc/9O3K4v', 'https://reurl.cc/xOvr7N'),
(14, '台式', '千田屋（草悟店）', '臺中市西區公正路130之1號', '均消$150', '0423028911', '11:30-14:30\r\n17:00-20:30\r\n週二公休', '台中市', '/img/RestaurantLogoImg/台中-千田屋.jpeg', 'https://reurl.cc/9O3K6j', 'https://reurl.cc/VjMdY5'),
(15, '台式', '叁食初', '臺中市北區西屯路一段492巷54弄4號', '均消$300', '0422085272', '11:00-01:00', '台中市', '/img/RestaurantLogoImg/台中-叁食初.jpeg', 'https://reurl.cc/2Djnvv', 'https://reurl.cc/Ddl085');

-- --------------------------------------------------------

--
-- 資料表結構 `restaurantphotolist`
--

CREATE TABLE `restaurantphotolist` (
  `id` bigint(20) NOT NULL,
  `Restaurant_Id` varchar(255) NOT NULL,
  `Restaurant_Photo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `restaurantphotolist`
--

INSERT INTO `restaurantphotolist` (`id`, `Restaurant_Id`, `Restaurant_Photo`) VALUES
(3, '11', '/img/Taichung/台中-咚豬咚豬/271243250_255529140023979_9106061032416141015_n.jpeg'),
(4, '11', '/img/Taichung/台中-咚豬咚豬/271556278_255528946690665_28174361469228778_n.jpeg'),
(5, '11', '/img/Taichung/台中-咚豬咚豬/271593030_255529366690623_3035157339762853859_n.jpeg'),
(6, '11', '/img/Taichung/台中-咚豬咚豬/271596050_255528873357339_2362975046235639858_n.jpeg'),
(7, '11', '/img/Taichung/台中-咚豬咚豬/271724379_255529423357284_5202644642743413062_n.jpeg'),
(8, '11', '/img/Taichung/台中-咚豬咚豬/271729794_255529190023974_7872967343448511328_n.jpeg'),
(9, '11', '/img/Taichung/台中-咚豬咚豬/51689737022_808d230e10_c.jpeg'),
(10, '11', '/img/Taichung/台中-咚豬咚豬/51690531361_eba4906602_c.jpeg'),
(11, '11', '/img/Taichung/台中-咚豬咚豬/51690797648_19b18199d7_c.jpeg'),
(12, '11', '/img/Taichung/台中-咚豬咚豬/51691209289_c31597af3c_c.jpeg'),
(13, '11', '/img/Taichung/台中-咚豬咚豬/51691421200_354b453998_c.jpeg');

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id`);

--
-- 資料表索引 `memberinfo`
--
ALTER TABLE `memberinfo`
  ADD PRIMARY KEY (`id`);

--
-- 資料表索引 `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`restaurant_id`);

--
-- 資料表索引 `restaurantphotolist`
--
ALTER TABLE `restaurantphotolist`
  ADD PRIMARY KEY (`id`);

--
-- 在傾印的資料表使用自動遞增(AUTO_INCREMENT)
--

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `comment`
--
ALTER TABLE `comment`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `memberinfo`
--
ALTER TABLE `memberinfo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `restaurant`
--
ALTER TABLE `restaurant`
  MODIFY `restaurant_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `restaurantphotolist`
--
ALTER TABLE `restaurantphotolist`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
