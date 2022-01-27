-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:3306
-- 產生時間： 2022-01-27 10:13:01
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
-- 資料庫： `shoppingcart`
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
  `restaurant_web` varchar(255) DEFAULT NULL,
  `restaurant_city` varchar(255) NOT NULL,
  `restaurant_img` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `restaurant`
--

INSERT INTO `restaurant` (`restaurant_id`, `restaurant_category`, `restaurant_name`, `restaurant_address`, `restaurant_price`, `restaurant_phone`, `business_hours`, `restaurant_web`, `restaurant_city`, `restaurant_img`) VALUES
(1, '速食店', '麥當勞-台中公益二店', '台中市南屯區公益路二段128號', '$$', '+886423285051', '00:00-24:00', 'https://www.mcdonalds.com/tw/zh-tw.html', '台中市', NULL),
(2, '速食店', '肯德基KFC-台中公益餐廳', '台中市西區公益路163號', '$$', '+886423027066', '11:00-23:00', 'https://www.facebook.com/kfctaiwan/', '', NULL),
(3, '速食店', '漢堡王Burger King台中公益店', '台中市西區公益路152-5號', '$$', '+886423200922', '10:00-22:00', 'https://www.burgerking.com.tw/branchweb', '台中市', NULL),
(4, '韓式料理', '咕咕家韓式炸雞Pizza吃到飽 公益店', '臺中市南屯區公益路二段95號1樓', '$$$', '+886423208284', '11:00-22:00', 'https://www.facebook.com/ChickenPlusGongYi/', '台中市', NULL),
(5, '火鍋', '和牛涮 日式鍋物放題 台北羅斯福店', '台北市大安區羅斯福路二段27號', '$$$$', '+886223910269', '11:30-23:30', 'https://www.wagyushabu.com.tw/', '台北市', NULL);

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
  MODIFY `restaurant_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
