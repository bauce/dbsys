/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : office_sys

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2020-06-06 12:36:33
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `password` char(32) NOT NULL,
  `type` int(11) NOT NULL,
  `manager` varchar(0) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '办公室', '87133876', '1', null, null, null);
INSERT INTO `department` VALUES ('2', '组织部', '2f0c36cd72583c605ce6111195b8033d', '1', null, null, null);

-- ----------------------------
-- Table structure for `leader`
-- ----------------------------
DROP TABLE IF EXISTS `leader`;
CREATE TABLE `leader` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `password` char(32) NOT NULL,
  `type` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leader
-- ----------------------------

-- ----------------------------
-- Table structure for `manage`
-- ----------------------------
DROP TABLE IF EXISTS `manage`;
CREATE TABLE `manage` (
  `lid` int(11) NOT NULL,
  `did` int(11) NOT NULL,
  PRIMARY KEY (`did`),
  KEY `lid` (`lid`),
  CONSTRAINT `manage_ibfk_1` FOREIGN KEY (`lid`) REFERENCES `leader` (`id`),
  CONSTRAINT `manage_ibfk_2` FOREIGN KEY (`did`) REFERENCES `department` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manage
-- ----------------------------

-- ----------------------------
-- Table structure for `work`
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` float(5,0) NOT NULL,
  `content` text,
  `type` int(11) NOT NULL,
  `did` int(11) NOT NULL,
  `duetime` varchar(16) DEFAULT NULL,
  `finished` tinyint(4) DEFAULT NULL,
  `finish_time` varchar(20) DEFAULT NULL,
  `other` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `did` (`did`),
  CONSTRAINT `work_ibfk_1` FOREIGN KEY (`did`) REFERENCES `department` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of work
-- ----------------------------

-- ----------------------------
-- Table structure for `work_info`
-- ----------------------------
DROP TABLE IF EXISTS `work_info`;
CREATE TABLE `work_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `wid` int(11) NOT NULL,
  `info` text,
  `finished` tinyint(2) DEFAULT NULL,
  `pre_finish_time` varchar(0) DEFAULT NULL,
  `lcomment` text,
  `ocomment` text,
  `status` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `archived` tinyint(1) DEFAULT NULL,
  `archived_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `wid` (`wid`),
  CONSTRAINT `work_info_ibfk_1` FOREIGN KEY (`wid`) REFERENCES `work` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of work_info
-- ----------------------------
