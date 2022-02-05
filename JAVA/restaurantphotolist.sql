-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:3306
-- 產生時間： 2022-02-05 23:53:05
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
-- 資料表索引 `restaurantphotolist`
--
ALTER TABLE `restaurantphotolist`
  ADD PRIMARY KEY (`id`);

--
-- 在傾印的資料表使用自動遞增(AUTO_INCREMENT)
--

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `restaurantphotolist`
--
ALTER TABLE `restaurantphotolist`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
