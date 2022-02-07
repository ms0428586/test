-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:8889
-- 產生時間： 2022 年 02 月 05 日 08:37
-- 伺服器版本： 5.7.34
-- PHP 版本： 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫： `restaurant`
--

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
(1, '港式', '廚窗港點 士林官邸店', '臺北市士林區福林路190跟188號', '均消$660', '0228806565', '11:30-14:30\r\n17:30-21:00', '台北市', '/img/RestaurantLogoImg/台北-廚窗港點.jpg', 'https://reurl.cc/44dDyj', 'https://reurl.cc/OpraX3'),
(2, '台式', '款待 手路菜', '臺北市中山區中山北路一段53巷32號', '均消$1100', '0225676097', '11:30-14:00\r\n17:30-21:30', '台北市', '/img/RestaurantLogoImg/台北-款待台菜.jpeg', 'https://reurl.cc/7edAry', 'https://reurl.cc/2DjArE'),
(3, '日式\r\n燒肉\r\n火鍋', '金洹苑 KIN KAN EN', '臺北市大安區延吉街131巷31號', '均消$1100', '0287720109', '11:30-14:30\r\n17:30-22:00', '台北市', '/img/RestaurantLogoImg/台北-金洹苑.jpeg', 'https://reurl.cc/jky48m', 'https://reurl.cc/3j4Aa9'),
(4, '台式\r\n麵包\r\n糕點', '和泰興', '新北市板橋區陽明街3號', '均消$60', '0222582562', '08:00-22:30', '新北市', '/img/RestaurantLogoImg/台北-和泰興.jpeg', 'https://reurl.cc/l9yb5d', 'https://reurl.cc/5GdL2M'),
(5, '泰式', '水上米 泰式料理餐廳', '新北市新莊區幸福路821號', '均消$250', '0287899789', '11:00-14:00\r\n16:30-21:00', '新北市', '/img/RestaurantLogoImg/台北-水上米.jpeg', 'https://reurl.cc/3j4A59', 'https://reurl.cc/WkNYXe'),
(6, '韓式\r\n燒肉', '咚豬咚豬。韓國烤肉吃到飽（台中公益大墩店）', '臺中市南屯區大墩路696號', '均消$399', '0423272227', '11:30-16:00\r\n17:00-22:30', '台中市', '/img/RestaurantLogoImg/台中-咚豬咚豬.jpeg', 'https://reurl.cc/jky451', 'https://reurl.cc/ZrVd7p'),
(7, '火鍋', '宮秸火鍋', '臺中市南屯區益豐路四段500號', '均消$698', '0423829589', '11:30-01:00', '台中市', '/img/RestaurantLogoImg/台中-宮秸火鍋.png', 'https://reurl.cc/Y9qAWx', 'https://reurl.cc/Ep69n1'),
(8, '義式\r\n美式', '眺高 STAY WITH MOUNTAIN', '臺中市北屯區部子路700巷11弄36號', '均消$500', '0424390886', '一～五 16:00-00:00\r\n六日 11:30-00:00', '台中市', '/img/RestaurantLogoImg/台中-眺高.jpeg', 'https://reurl.cc/9O3K4v', 'https://reurl.cc/xOvr7N'),
(9, '台式', '千田屋（草悟店）', '臺中市西區公正路130之1號', '均消$150', '0423028911', '11:30-14:30\r\n17:00-20:30\r\n週二公休', '台中市', '/img/RestaurantLogoImg/台中-千田屋.jpeg', 'https://reurl.cc/9O3K6j', 'https://reurl.cc/VjMdY5'),
(10, '台式', '叁食初', '臺中市北區西屯路一段492巷54弄4號', '均消$300', '0422085272', '11:00-01:00', '台中市', '/img/RestaurantLogoImg/台中-叁食初.jpeg', 'https://reurl.cc/2Djnvv', 'https://reurl.cc/Ddl085');

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`restaurant_id`);

--
-- 在傾印的資料表使用自動遞增(AUTO_INCREMENT)
--

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `restaurant`
--
ALTER TABLE `restaurant`
  MODIFY `restaurant_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
