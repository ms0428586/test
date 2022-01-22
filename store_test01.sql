-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:3306
-- 產生時間： 2022-01-22 14:59:08
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
-- 資料表結構 `store_test01`
--

CREATE TABLE `store_test01` (
  `STORE_ID` varchar(255) NOT NULL,
  `STORE_CATEGORYS` varchar(255) NOT NULL,
  `STORE_NAMES` varchar(255) NOT NULL,
  `STORE_ADDRESS` varchar(255) NOT NULL,
  `STORE_PHONE` varchar(255) NOT NULL,
  `STORE_HOURS` varchar(255) DEFAULT NULL,
  `PRODUCTS_IMG` longblob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `store_test01`
--

INSERT INTO `store_test01` (`STORE_ID`, `STORE_CATEGORYS`, `STORE_NAMES`, `STORE_ADDRESS`, `STORE_PHONE`, `STORE_HOURS`, `PRODUCTS_IMG`) VALUES
('1', '燒烤', 'NikuNiku 肉肉燒肉五權西店', '408台中市南屯區五權西路二段223號', '0424721166', '11:30to22:00', NULL),
('2', '火鍋', '八豆食府壽喜燒專門店', '408台中市南屯區大光街162號', '0423263322', '11:30to24:00', NULL),
('3', '燒烤', '屋馬燒肉文心店', '408台中市南屯區文心路一段436號', '0423106699', '11:00to22:30', NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
