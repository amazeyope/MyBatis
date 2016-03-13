/*
Navicat MySQL Data Transfer

Source Server         : localMysql
Source Server Version : 50166
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50166
File Encoding         : 65001

Date: 2016-03-13 12:50:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `ID` varchar(50) NOT NULL COMMENT '主键ID',
  `NAME` varchar(50) DEFAULT NULL COMMENT '姓名',
  `AGE` varchar(50) DEFAULT NULL COMMENT '年龄',
  `ADDRESS` varchar(100) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
