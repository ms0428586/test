-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:3306
-- 產生時間： 2022-02-07 16:16:26
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
(2, '速食店', '肯德基KFC-台中公益餐廳', '台中市西區公益路163號', '$$', '+886423027066', '11:00-23:00', '', '/img/RestaurantLogoImg/KFC.jpg', 'https://www.facebook.com/kfctaiwan/', 'https://goo.gl/maps/B7uP7PJ7sqLAUs8K9'),
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
(1, '6', '/img/Taipei/台北-廚窗港點（士林店）/1639295241-2346169841-g_l.jpeg'),
(2, '6', '/img/Taipei/台北-廚窗港點（士林店）/1639295241-1892713309-g_l.jpeg'),
(3, '6', '/img/Taipei/台北-廚窗港點（士林店）/1639295243-1012543879-g_l.jpeg'),
(4, '6', '/img/Taipei/台北-廚窗港點（士林店）/1639295243-1685554311-g_l.jpeg'),
(5, '6', '/img/Taipei/台北-廚窗港點（士林店）/1639295246-3220204072-g_l.jpeg'),
(6, '7', '/img/Taipei/台北-款待台菜/DSC04985.jpeg'),
(7, '7', '/img/Taipei/台北-款待台菜/DSC04996.jpeg'),
(8, '7', '/img/Taipei/台北-款待台菜/DSC05000.jpeg'),
(9, '7', '/img/Taipei/台北-款待台菜/DSC05006.jpeg'),
(10, '7', '/img/Taipei/台北-款待台菜/DSC05020.jpeg'),
(11, '8', '/img/Taipei/台北-金洹苑/20211121024734_37.jpeg'),
(12, '8', '/img/Taipei/台北-金洹苑/20211121024809_73.jpeg'),
(13, '8', '/img/Taipei/台北-金洹苑/20211121024753_1.jpeg'),
(14, '8', '/img/Taipei/台北-金洹苑/20211121024750_42.jpeg'),
(15, '8', '/img/Taipei/台北-金洹苑/20211121024802_43.jpeg'),
(16, '9', '/img/Taipei/台北-和泰興/cake01-005.png'),
(17, '9', '/img/Taipei/台北-和泰興/cake01-001.png'),
(18, '9', '/img/Taipei/台北-和泰興/cake06-001.png'),
(19, '9', '/img/Taipei/台北-和泰興/cake06-002.png'),
(20, '9', '/img/Taipei/台北-和泰興/cake06-009.png'),
(21, '10', '/img/Taipei/台北-水上米/272200435_260804126192184_301645705629277142_n.jpeg'),
(22, '10', '/img/Taipei/台北-水上米/272385905_260804046192192_4877648097885912300_n.jpeg'),
(23, '10', '/img/Taipei/台北-水上米/272319954_260803949525535_4112935531772570758_n.jpeg'),
(24, '10', '/img/Taipei/台北-水上米/272156864_260803889525541_1367743178556668222_n.jpeg'),
(25, '10', '/img/Taipei/台北-水上米/270238935_246384910967439_4045283753812862280_n.jpeg'),
(26, '11', '/img/Taichung/台中-咚豬咚豬/271596050_255528873357339_2362975046235639858_n.jpeg'),
(27, '11', '/img/Taichung/台中-咚豬咚豬/271729794_255529190023974_7872967343448511328_n.jpeg'),
(28, '11', '/img/Taichung/台中-咚豬咚豬/271243250_255529140023979_9106061032416141015_n.jpeg'),
(29, '11', '/img/Taichung/台中-咚豬咚豬/51691421200_354b453998_c.jpeg'),
(30, '11', '/img/Taichung/台中-咚豬咚豬/51691209289_c31597af3c_c.jpeg'),
(31, '12', '/img/Taichung/台中-宮秸火鍋/20211215234817_94.jpeg'),
(32, '12', '/img/Taichung/台中-宮秸火鍋/20211215234918_83.jpeg'),
(33, '12', '/img/Taichung/台中-宮秸火鍋/20211215234936_43.jpeg'),
(34, '12', '/img/Taichung/台中-宮秸火鍋/20211215234938_43.jpeg'),
(35, '12', '/img/Taichung/台中-宮秸火鍋/20211215234940_40.jpeg'),
(36, '13', '/img/Taichung/台中-眺高/23167983_838122563036949_6336674800533496498_n.jpeg'),
(37, '13', '/img/Taichung/台中-眺高/23755517_846441745538364_6822004130291653497_n.jpeg'),
(38, '13', '/img/Taichung/台中-眺高/24231730_851380505044488_6586871055913729015_n.jpeg'),
(39, '13', '/img/Taichung/台中-眺高/55557081_1166619596853909_2280404785502879744_n.jpeg'),
(40, '13', '/img/Taichung/台中-眺高/32235722_938543466328191_3924770909272932352_n.jpeg'),
(41, '14', '/img/Taichung/台中-千田屋/1639371764-e984b5287e0eabd6ef36730fa6c4d04e.jpeg'),
(42, '14', '/img/Taichung/台中-千田屋/1639371769-b263d2fc683740541619288ebbc25639.jpeg'),
(43, '14', '/img/Taichung/台中-千田屋/1639371784-5aeb41a27431197b1601e91749ac6a83.jpeg'),
(44, '14', '/img/Taichung/台中-千田屋/1639371776-a628b59e9440732fb7787dedf335d753.jpeg'),
(45, '14', '/img/Taichung/台中-千田屋/1639371790-fa9bb0cb0069835e9aaa0da1e573c9e9.jpeg'),
(46, '10', '/img/Taichung/台中-叁食初/250541149_123851866712070_7875991973530842630_n.jpeg'),
(47, '10', '/img/Taichung/台中-叁食初/250727887_123851876712069_4664442493458790499_n.jpeg'),
(48, '10', '/img/Taichung/台中-叁食初/252577064_123851886712068_3911946708837800050_n.jpeg'),
(49, '10', '/img/Taichung/台中-叁食初/257224144_127027929727797_2671518670809236265_n.jpeg'),
(50, '10', '/img/Taichung/台中-叁食初/258373522_127227706374486_8347995549835406693_n.jpeg'),
(51, '1', '/img/麥當勞/191023_Mcdonalds_00_1024.jpeg'),
(52, '1', '/img/麥當勞/MS190506_EVM_M-12.png'),
(53, '1', '/img/麥當勞/201411271547430_l.jpeg'),
(54, '1', '/img/麥當勞/9387384_orig.png'),
(55, '1', '/img/麥當勞/1972769_orig.png'),
(56, '8', '/img/肯德基/金海派富貴起司雞XL餐$19520220120-pc.jpeg'),
(57, '2', '/img/肯德基/吮指雙雞XL套餐-20220119-pc.jpeg'),
(58, '2', '/img/肯德基/咔啦雞腿堡XL套餐-20220119-pc.jpeg'),
(59, '2', '/img/肯德基/台酒花雕紙包雞 XL餐185-20220119-pc.jpeg'),
(60, '2', '/img/肯德基/紐奧良烤雞腿堡XL套餐-210726-pc.jpeg'),
(61, '3', '/img/漢堡王/bf1a73d7-2791-4f94-920d-7f0bcbd7919f.png'),
(62, '3', '/img/漢堡王/7b7d4a79-67e7-4b73-a8b9-54b0f65844c2.png'),
(63, '3', '/img/漢堡王/b6826844-827a-4986-aa35-8436fec0c8f3.png'),
(64, '3', '/img/漢堡王/fdf6e539-4246-49c6-bdf0-a2f543c8bb27.png'),
(65, '3', '/img/漢堡王/b6edd4ae-070b-4cdb-9a8b-045068293a4c.png');

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
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
