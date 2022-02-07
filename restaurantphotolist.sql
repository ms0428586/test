-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:8889
-- 產生時間： 2022 年 02 月 07 日 04:04
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
(1, '1', '/img/Taipei/台北-廚窗港點（士林店）/1639295241-2346169841-g_l.jpeg'),
(2, '1', '/img/Taipei/台北-廚窗港點（士林店）/1639295241-1892713309-g_l.jpeg'),
(3, '1', '/img/Taipei/台北-廚窗港點（士林店）/1639295243-1012543879-g_l.jpeg'),
(4, '1', '/img/Taipei/台北-廚窗港點（士林店）/1639295243-1685554311-g_l.jpeg'),
(5, '1', '/img/Taipei/台北-廚窗港點（士林店）/1639295246-3220204072-g_l.jpeg'),
(6, '2', '/img/Taipei/台北-款待台菜/DSC04985.jpeg'),
(7, '2', '/img/Taipei/台北-款待台菜/DSC04996.jpeg'),
(8, '2', '/img/Taipei/台北-款待台菜/DSC05000.jpeg'),
(9, '2', '/img/Taipei/台北-款待台菜/DSC05006.jpeg'),
(10, '2', '/img/Taipei/台北-款待台菜/DSC05020.jpeg'),
(11, '3', '/img/Taipei/台北-金洹苑/20211121024734_37.jpeg'),
(12, '3', '/img/Taipei/台北-金洹苑/20211121024809_73.jpeg'),
(13, '3', '/img/Taipei/台北-金洹苑/20211121024753_1.jpeg'),
(14, '3', '/img/Taipei/台北-金洹苑/20211121024750_42.jpeg'),
(15, '3', '/img/Taipei/台北-金洹苑/20211121024802_43.jpeg'),
(16, '4', '/img/Taipei/台北-和泰興/cake01-005.png'),
(17, '4', '/img/Taipei/台北-和泰興/cake01-001.png'),
(18, '4', '/img/Taipei/台北-和泰興/cake06-001.png'),
(19, '4', '/img/Taipei/台北-和泰興/cake06-002.png'),
(20, '4', '/img/Taipei/台北-和泰興/cake06-009.png'),
(21, '5', '/img/Taipei/台北-水上米/272200435_260804126192184_301645705629277142_n.jpeg'),
(22, '5', '/img/Taipei/台北-水上米/272385905_260804046192192_4877648097885912300_n.jpeg'),
(23, '5', '/img/Taipei/台北-水上米/272319954_260803949525535_4112935531772570758_n.jpeg'),
(24, '5', '/img/Taipei/台北-水上米/272156864_260803889525541_1367743178556668222_n.jpeg'),
(25, '5', '/img/Taipei/台北-水上米/270238935_246384910967439_4045283753812862280_n.jpeg'),
(26, '6', '/img/Taichung/台中-咚豬咚豬/271596050_255528873357339_2362975046235639858_n.jpeg'),
(27, '6', '/img/Taichung/台中-咚豬咚豬/271729794_255529190023974_7872967343448511328_n.jpeg'),
(28, '6', '/img/Taichung/台中-咚豬咚豬/271243250_255529140023979_9106061032416141015_n.jpeg'),
(29, '6', '/img/Taichung/台中-咚豬咚豬/51691421200_354b453998_c.jpeg'),
(30, '6', '/img/Taichung/台中-咚豬咚豬/51691209289_c31597af3c_c.jpeg'),
(31, '7', '/img/Taichung/台中-宮秸火鍋/20211215234817_94.jpeg'),
(32, '7', '/img/Taichung/台中-宮秸火鍋/20211215234918_83.jpeg'),
(33, '7', '/img/Taichung/台中-宮秸火鍋/20211215234936_43.jpeg'),
(34, '7', '/img/Taichung/台中-宮秸火鍋/20211215234938_43.jpeg'),
(35, '7', '/img/Taichung/台中-宮秸火鍋/20211215234940_40.jpeg'),
(36, '8', '/img/Taichung/台中-眺高/23167983_838122563036949_6336674800533496498_n.jpeg'),
(37, '8', '/img/Taichung/台中-眺高/23755517_846441745538364_6822004130291653497_n.jpeg'),
(38, '8', '/img/Taichung/台中-眺高/24231730_851380505044488_6586871055913729015_n.jpeg'),
(39, '8', '/img/Taichung/台中-眺高/55557081_1166619596853909_2280404785502879744_n.jpeg'),
(40, '8', '/img/Taichung/台中-眺高/32235722_938543466328191_3924770909272932352_n.jpeg'),
(41, '9', '/img/Taichung/台中-千田屋/1639371764-e984b5287e0eabd6ef36730fa6c4d04e.jpeg'),
(42, '9', '/img/Taichung/台中-千田屋/1639371769-b263d2fc683740541619288ebbc25639.jpeg'),
(43, '9', '/img/Taichung/台中-千田屋/1639371784-5aeb41a27431197b1601e91749ac6a83.jpeg'),
(44, '9', '/img/Taichung/台中-千田屋/1639371776-a628b59e9440732fb7787dedf335d753.jpeg'),
(45, '9', '/img/Taichung/台中-千田屋/1639371790-fa9bb0cb0069835e9aaa0da1e573c9e9.jpeg'),
(46, '10', '/img/Taichung/台中-叁食初/250541149_123851866712070_7875991973530842630_n.jpeg'),
(47, '10', '/img/Taichung/台中-叁食初/250727887_123851876712069_4664442493458790499_n.jpeg'),
(48, '10', '/img/Taichung/台中-叁食初/252577064_123851886712068_3911946708837800050_n.jpeg'),
(49, '10', '/img/Taichung/台中-叁食初/257224144_127027929727797_2671518670809236265_n.jpeg'),
(50, '10', '/img/Taichung/台中-叁食初/258373522_127227706374486_8347995549835406693_n.jpeg'),
(51, '11', '/img/麥當勞/191023_Mcdonalds_00_1024.jpeg'),
(52, '11', '/img/麥當勞/MS190506_EVM_M-12.png'),
(53, '11', '/img/麥當勞/201411271547430_l.jpeg'),
(54, '11', '/img/麥當勞/9387384_orig.png'),
(55, '11', '/img/麥當勞/1972769_orig.png'),
(56, '12', '/img/肯德基/金海派富貴起司雞XL餐$19520220120-pc.jpeg'),
(57, '12', '/img/肯德基/吮指雙雞XL套餐-20220119-pc.jpeg'),
(58, '12', '/img/肯德基/咔啦雞腿堡XL套餐-20220119-pc.jpeg'),
(59, '12', '/img/肯德基/台酒花雕紙包雞 XL餐185-20220119-pc.jpeg'),
(60, '12', '/img/肯德基/紐奧良烤雞腿堡XL套餐-210726-pc.jpeg'),
(61, '13', '/img/漢堡王/bf1a73d7-2791-4f94-920d-7f0bcbd7919f.png'),
(62, '13', '/img/漢堡王/7b7d4a79-67e7-4b73-a8b9-54b0f65844c2.png'),
(63, '13', '/img/漢堡王/b6826844-827a-4986-aa35-8436fec0c8f3.png'),
(64, '13', '/img/漢堡王/fdf6e539-4246-49c6-bdf0-a2f543c8bb27.png'),
(65, '13', '/img/漢堡王/b6edd4ae-070b-4cdb-9a8b-045068293a4c.png');

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
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
