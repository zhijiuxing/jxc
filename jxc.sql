/*
Navicat MySQL Data Transfer

Source Server         : jdbc1
Source Server Version : 80023
Source Host           : localhost:3306
Source Database       : jxc

Target Server Type    : MYSQL
Target Server Version : 80023
File Encoding         : 65001

Date: 2023-04-24 17:41:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `administrators`
-- ----------------------------
DROP TABLE IF EXISTS `administrators`;
CREATE TABLE `administrators` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of administrators
-- ----------------------------
INSERT INTO `administrators` VALUES ('1', 'itcast', '123456');
INSERT INTO `administrators` VALUES ('2', 'hui', '123456');

-- ----------------------------
-- Table structure for `commodity`
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tradename` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `price` double DEFAULT NULL,
  `sell` int DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `stock` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('101', '短袖', '10', '0', '2022-03-02', '20000');
INSERT INTO `commodity` VALUES ('102', '外套', '40', '0', '2022-03-03', '10000');
INSERT INTO `commodity` VALUES ('103', '牛仔裤', '30', '0', '2022-03-03', '8000');
INSERT INTO `commodity` VALUES ('104', '短裤', '20', '1', '2022-03-03', '20000');

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `age` int DEFAULT NULL,
  `telephone` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `frequency` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1005 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1001', '张三', '30', '14994445351', '14994445351@qq.com', '3');
INSERT INTO `customer` VALUES ('1002', '李四', '44', '14994445352', '14994445352@qq.com', '3');
INSERT INTO `customer` VALUES ('1003', '王五', '47', '14994445353', '14994445353@qq.com', '4');
INSERT INTO `customer` VALUES ('1004', '赵六', '25', '14994445354', '14994445354@qq.com', '4');

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int NOT NULL,
  `departmentName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1001', '财务部');
INSERT INTO `department` VALUES ('1002', '市场部');
INSERT INTO `department` VALUES ('1003', '研发部');
INSERT INTO `department` VALUES ('1004', '运营部');
INSERT INTO `department` VALUES ('1005', '后勤部');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `lastName` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` int DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `department_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `department_id` (`department_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1017 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1001', 'aa', 'a34234@qq.com', '1', '2022-03-24', '1001');
INSERT INTO `employee` VALUES ('1002', 'bb', 'b34234@qq.com', '1', '2022-03-16', '1002');
INSERT INTO `employee` VALUES ('1003', 'cc', 'cc34234@qq.com', '0', '2022-03-15', '1001');
INSERT INTO `employee` VALUES ('1004', 'dd', 'dd34234@qq.com', '1', '2022-03-03', '1003');
INSERT INTO `employee` VALUES ('1005', 'ee', 'ee34234@qq.com', '1', '2022-03-08', '1001');
INSERT INTO `employee` VALUES ('1010', 'ff', 'ff34234@qq.com', '0', '2022-02-18', '1002');
INSERT INTO `employee` VALUES ('1011', 'gg', 'gg34234@qq.com', '1', '2022-02-11', '1002');
INSERT INTO `employee` VALUES ('1012', 'hh', 'hh34234@qq.com', '0', '2022-02-03', '1002');
INSERT INTO `employee` VALUES ('1013', 'ii', 'ii34234@qq.com', '1', '2022-02-05', '1002');
INSERT INTO `employee` VALUES ('1014', 'jj', 'jj34234@qq.com', '1', '2022-02-06', '1004');
INSERT INTO `employee` VALUES ('1015', 'kk', 'kk34234@qq.com', '0', '2022-02-06', '1001');
INSERT INTO `employee` VALUES ('1016', 'll', 'll34234@qq.com', '0', '2022-02-06', '1003');

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ordernumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `tradename` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `number` int DEFAULT NULL,
  `money` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `time` date DEFAULT NULL,
  `state` int DEFAULT NULL,
  `employee_id` int DEFAULT NULL,
  `commodity_id` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `employee_id` (`employee_id`),
  KEY `commodity_id` (`commodity_id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `commodity_id` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`id`),
  CONSTRAINT `customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `employee_id` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10015 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('10001', '11212121101', '短袖', '10000', '100000', '2022-03-10', '1', '1002', '101', '1001');
INSERT INTO `orders` VALUES ('10002', '11212121102', '外套', '5000', '200000', '2022-03-12', '1', '1002', '102', '1001');
INSERT INTO `orders` VALUES ('10003', '11212121103', '短裤', '5000', '100000', '2022-03-13', '1', '1002', '104', '1001');
INSERT INTO `orders` VALUES ('10004', '11212121104', '短袖', '8000', '80000', '2022-02-10', '1', '1010', '101', '1002');
INSERT INTO `orders` VALUES ('10005', '11212121105', '外套', '8000', '320000', '2022-03-19', '1', '1010', '104', '1002');
INSERT INTO `orders` VALUES ('10006', '11212121106', '短裤', '8000', '160000', '2022-02-10', '1', '1010', '104', '1002');
INSERT INTO `orders` VALUES ('10007', '11212121107', '短袖', '9000', '90000', '2022-03-19', '1', '1011', '101', '1003');
INSERT INTO `orders` VALUES ('10008', '11212121108', '短袖', '9000', '90000', '2022-03-20', '1', '1011', '102', '1003');
INSERT INTO `orders` VALUES ('10009', '11212121109', '外套', '9000', '360000', '2022-02-18', '1', '1011', '102', '1003');
INSERT INTO `orders` VALUES ('10010', '11212121110', '短裤', '10000', '200000', '2022-04-14', '1', '1012', '104', '1003');
INSERT INTO `orders` VALUES ('10011', '11212121111', '短裤', '5000', '10000', '2022-04-28', '1', '1012', '104', '1004');
INSERT INTO `orders` VALUES ('10012', '11212121112', '牛仔裤', '5000', '15000', '2022-02-19', '0', '1013', '103', '1004');
INSERT INTO `orders` VALUES ('10013', '11212121113', '短袖', '10000', '10000', '2022-05-27', '2', '1013', '101', '1004');
INSERT INTO `orders` VALUES ('10014', '11212121122', '短袖', '5000', '50000', '2022-05-22', '1', '1013', '101', '1004');

-- ----------------------------
-- Table structure for `report`
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `txt` varchar(400) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `reporttime` date DEFAULT NULL,
  `classification` int DEFAULT NULL,
  `reportemployee_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `reportemployee_id` (`reportemployee_id`),
  CONSTRAINT `reportemployee_id` FOREIGN KEY (`reportemployee_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1007 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of report
-- ----------------------------
INSERT INTO `report` VALUES ('1001', '报告', '临近夏季建议提高夏装库存', '2022-03-11', '3', '1002');
INSERT INTO `report` VALUES ('1002', '印花T恤', '可以多出点不同款式的印花体恤吗太好看了', '2022-03-16', '1', null);
INSERT INTO `report` VALUES ('1003', '印花T恤自定义图案', '可以自定义图案吗，短袖材质非常舒服', '2022-03-11', '1', null);
INSERT INTO `report` VALUES ('1004', '优惠活动', '五一将至，建议对购买5次以上的用户给出95折优惠，8次9折优惠', '2022-04-24', '2', '1011');
INSERT INTO `report` VALUES ('1005', '报告分析', '发生发撒上帝发誓', '2022-04-02', '2', null);
INSERT INTO `report` VALUES ('1006', '报告分析', 'aaaa', '2022-04-02', '3', null);
