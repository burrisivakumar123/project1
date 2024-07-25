/*
MySQL Data Transfer
Source Host: localhost
Source Database: proj10
Target Host: localhost
Target Database: proj10
Date: 29-Jan-20 3:48:10 PM
*/


create database proj10;

use proj10;


SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for attacker
-- ----------------------------
DROP TABLE IF EXISTS `attacker`;
CREATE TABLE `attacker` (
  `name` text,
  `node` text,
  `energy` text,
  `ip` text,
  `dt` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for ids
-- ----------------------------
DROP TABLE IF EXISTS `ids`;
CREATE TABLE `ids` (
  `nname` text,
  `energy` text,
  `dt` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for network1
-- ----------------------------
DROP TABLE IF EXISTS `network1`;
CREATE TABLE `network1` (
  `name` text,
  `energy` text,
  `dist` text,
  `attack` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for network2
-- ----------------------------
DROP TABLE IF EXISTS `network2`;
CREATE TABLE `network2` (
  `name` text,
  `energy` text,
  `dist` text,
  `attack` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for network3
-- ----------------------------
DROP TABLE IF EXISTS `network3`;
CREATE TABLE `network3` (
  `name` text,
  `energy` text,
  `dist` text,
  `attack` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for network4
-- ----------------------------
DROP TABLE IF EXISTS `network4`;
CREATE TABLE `network4` (
  `name` text,
  `energy` text,
  `dist` text,
  `attack` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for results
-- ----------------------------
DROP TABLE IF EXISTS `results`;
CREATE TABLE `results` (
  `fname` text,
  `tdelay` text,
  `tpt` text,
  `ro` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for timedelay
-- ----------------------------
DROP TABLE IF EXISTS `timedelay`;
CREATE TABLE `timedelay` (
  `fname` text,
  `dest` text,
  `delay` text,
  `path` text,
  `dt` text,
  `energy` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `attacker` VALUES ('Attacker', 'Node11', '0', '192.168.1.3', '10/12/20 5:06 PM');
INSERT INTO `attacker` VALUES ('Attacker', 'Node21', '0', '192.168.1.3', '10/12/20 5:13 PM');
INSERT INTO `attacker` VALUES ('Attacker', 'Node20', '0', '192.168.1.3', '10/12/20 5:13 PM');
INSERT INTO `attacker` VALUES ('Attacker', 'Node11', '0', '192.168.1.3', '10/12/20 6:31 PM');
INSERT INTO `attacker` VALUES ('Attacker', 'Node22', '0', '192.168.1.3', '10/12/20 6:32 PM');
INSERT INTO `ids` VALUES ('Node11', '0', '10/12/20 5:09 PM');
INSERT INTO `ids` VALUES ('Node11', '0', '10/12/20 6:33 PM');
INSERT INTO `ids` VALUES ('Node11', '0', '10/12/20 6:35 PM');
INSERT INTO `network1` VALUES ('Node1', '10000', '0', 'No');
INSERT INTO `network1` VALUES ('Node2', '10000', '4', 'No');
INSERT INTO `network1` VALUES ('Node3', '10000', '3', 'No');
INSERT INTO `network1` VALUES ('Node4', '200000', '7', 'No');
INSERT INTO `network1` VALUES ('Node5', '10000', '2', 'No');
INSERT INTO `network1` VALUES ('Node6', '10000', '5', 'No');
INSERT INTO `network1` VALUES ('Node7', '10000', '6', 'No');
INSERT INTO `network2` VALUES ('Node8', '10000', '6', 'No');
INSERT INTO `network2` VALUES ('Node9', '10000', '4', 'No');
INSERT INTO `network2` VALUES ('Node10', '10000', '9', 'No');
INSERT INTO `network2` VALUES ('Node11', '0', '13', 'No');
INSERT INTO `network2` VALUES ('Node12', '10000', '17', 'No');
INSERT INTO `network2` VALUES ('Node13', '10000', '13', 'No');
INSERT INTO `network2` VALUES ('Node14', '10000', '11', 'No');
INSERT INTO `network3` VALUES ('Node15', '10000', '11', 'No');
INSERT INTO `network3` VALUES ('Node16', '10000', '15', 'No');
INSERT INTO `network3` VALUES ('Node17', '10000', '10', 'No');
INSERT INTO `network3` VALUES ('Node18', '10000', '1', 'No');
INSERT INTO `network3` VALUES ('Node19', '10000', '16', 'No');
INSERT INTO `network3` VALUES ('Node20', '200000', '18', 'No');
INSERT INTO `network3` VALUES ('Node21', '200000', '16', 'No');
INSERT INTO `network4` VALUES ('Node22', '0', '16', 'No');
INSERT INTO `network4` VALUES ('Node23', '10000', '14', 'No');
INSERT INTO `network4` VALUES ('Node24', '10000', '12', 'No');
INSERT INTO `network4` VALUES ('Node25', '10000', '10', 'No');
INSERT INTO `network4` VALUES ('Node26', '10000', '18', 'No');
INSERT INTO `network4` VALUES ('Node27', '10000', '20', 'No');
INSERT INTO `network4` VALUES ('Node28', '10000', '2', 'No');
INSERT INTO `results` VALUES ('Dbcon.java', '43461', '80000', '3300');
INSERT INTO `results` VALUES ('DestnationA.java', '43287', '8000', '30700');
INSERT INTO `results` VALUES ('DestinationB.java', '65381', '14000', '28600');
INSERT INTO `results` VALUES ('ViewNetwork.java', '46497', '15000', '18400');
INSERT INTO `results` VALUES ('RManager.java', '68147', '9000', '47300');
INSERT INTO `results` VALUES ('ViewDetails.java', '69074', '9000', '47300');
INSERT INTO `timedelay` VALUES ('Dbcon.java', 'Dest A', '53437.0', 'Node1->Node3->Node5->Node6->Node8->Node9->Node10->Node11->Node13->Node15->Node17->Node18->Node19->Node21->Node22->Node24->Node25->Node26->Node28->', '10/12/20 4:37 PM', '101332.38518518518');
INSERT INTO `timedelay` VALUES ('DestnationA.java', 'Dest B', '53266.0', 'Node1->Node3->Node5->Node6->Node8->Node9->Node10->Node11->Node13->Node15->Node17->Node18->Node19->Node21->Node22->Node24->Node25->Node26->Node28->', '10/12/20 5:06 PM', '11104.312703583062');
INSERT INTO `timedelay` VALUES ('DestinationB.java', 'Dest C', '75350.0', 'Node1->Node3->Node5->Node6->Node8->Node9->Node10->Node11->Node12->Node13->Node14->Node15->Node17->Node18->Node19->Node21->Node22->Node24->Node25->Node26->Node28->', '10/12/20 5:10 PM', '16832.111692844675');
INSERT INTO `timedelay` VALUES ('ViewNetwork.java', 'Dest A', '56463.0', 'Node1->Node3->Node5->Node6->Node8->Node9->Node10->Node11->Node13->Node15->Node17->Node18->Node19->Node21->Node22->Node24->Node25->Node26->Node28->', '10/12/20 6:30 PM', '19559.577807848444');
INSERT INTO `timedelay` VALUES ('RManager.java', 'Dest B', '78114.0', 'Node1->Node3->Node5->Node6->Node8->Node9->Node10->Node11->Node12->Node13->Node14->Node15->Node17->Node18->Node19->Node21->Node22->Node24->Node25->Node26->Node28->', '10/12/20 6:34 PM', '10569.336152219874');
INSERT INTO `timedelay` VALUES ('ViewDetails.java', 'Dest C', '79003.0', 'Node1->Node3->Node5->Node6->Node8->Node9->Node10->Node11->Node12->Node13->Node14->Node15->Node17->Node18->Node19->Node21->Node22->Node24->Node25->Node26->Node28->', '10/12/20 6:36 PM', '10689.623678646934');
