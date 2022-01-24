-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- 主機： 127.0.0.1
-- 產生時間： 2022-01-24 06:06:30
-- 伺服器版本： 10.4.22-MariaDB
-- PHP 版本： 8.0.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫: `shoppingcart`
--

-- --------------------------------------------------------

--
-- 資料表結構 `menu`
--

CREATE TABLE `menu` (
  `ID` int(255) NOT NULL,
  `PRODUCTS_CODE` varchar(255) NOT NULL,
  `PRODUCTS_NAME` varchar(255) NOT NULL,
  `PRODUCTS_SIZE` varchar(255) NOT NULL,
  `PRODUCTS_PRICE` int(255) NOT NULL,
  `PRODUCTS_DESCRIPTION` varchar(255) NOT NULL,
  `PRODUCTS_CATEGORY` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 傾印資料表的資料 `menu`
--

INSERT INTO `menu` (`ID`, `PRODUCTS_CODE`, `PRODUCTS_NAME`, `PRODUCTS_SIZE`, `PRODUCTS_PRICE`, `PRODUCTS_DESCRIPTION`, `PRODUCTS_CATEGORY`) VALUES
(1, '001', '純喫茶', '小', 20, '', '飲料'),
(2, '002', '烏龍茶', '中', 30, '', '飲料');

-- --------------------------------------------------------

--
-- 資料表結構 `record`
--

CREATE TABLE `record` (
  `ID` int(255) NOT NULL,
  `STORE` varchar(255) NOT NULL,
  `MEALS` varchar(255) NOT NULL,
  `SCORE` varchar(255) NOT NULL,
  `EXPERIENCE` varchar(255) NOT NULL,
  `TASK` varchar(255) NOT NULL,
  `DATE` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 傾印資料表的資料 `record`
--

INSERT INTO `record` (`ID`, `STORE`, `MEALS`, `SCORE`, `EXPERIENCE`, `TASK`, `DATE`) VALUES
(1, '1', '1', '1', '1', '1', '2022-01-24');

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`ID`);

--
-- 資料表索引 `record`
--
ALTER TABLE `record`
  ADD PRIMARY KEY (`ID`);

--
-- 在傾印的資料表使用自動遞增(AUTO_INCREMENT)
--

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `menu`
--
ALTER TABLE `menu`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `record`
--
ALTER TABLE `record`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
