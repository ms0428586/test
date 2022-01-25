-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:3306
-- 產生時間： 2022-01-20 14:15:41
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
-- 資料表結構 `menu_test01`
--

CREATE TABLE `menu_test01` (
  `ID` varchar(255) NOT NULL,
  `PRODUCTS_NAME` varchar(255) NOT NULL,
  `PRODUCTS_SIZE` varchar(255) NOT NULL,
  `PRODUCTS_PRICE` double NOT NULL,
  `PRODUCTS_CATEGORY` varchar(255) NOT NULL,
  `PRODUCTS_DESCRIPTION` varchar(255) NOT NULL,
  `PRODUCTS_IMG` longblob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `menu_test01`
--

INSERT INTO `menu_test01` (`ID`, `PRODUCTS_NAME`, `PRODUCTS_SIZE`, `PRODUCTS_PRICE`, `PRODUCTS_CATEGORY`, `PRODUCTS_DESCRIPTION`, `PRODUCTS_IMG`) VALUES
('001', '純喫茶', '小', 20, '飲料', '無糖綠茶', NULL);

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `menu_test01`
--
ALTER TABLE `menu_test01`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
