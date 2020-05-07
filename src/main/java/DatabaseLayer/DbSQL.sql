/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  kavishna
 * Created: May 7, 2020
 */

CREATE DATABASE `StudentManagementSystem`;

CREATE TABLE `StudentManagementSystem`.`undergraduate` (
  `pno` int NOT NULL,
  `pname` varchar(100) DEFAULT NULL,
  `sdate` date DEFAULT NULL,
  `duration` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`pno`),
  UNIQUE KEY `pno` (`pno`)
);

CREATE TABLE `StudentManagementSystem`.`postgraduate` (
  `pno` int NOT NULL,
  `pname` varchar(100) DEFAULT NULL,
  `sdate` date DEFAULT NULL,
  `duration` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`pno`),
  UNIQUE KEY `pno` (`pno`)
);

CREATE TABLE `StudentManagementSystem`.`user` (
  `UserID` int NOT NULL,
  `UserName` varchar(50) DEFAULT NULL,
  `PassWord` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`UserID`)
);

CREATE TABLE `StudentManagementSystem`.`undergraduatestudents` (
  `Id` varchar(50) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Sex` varchar(20) DEFAULT NULL,
  `PhoneNo` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `DegreeName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `StudentManagementSystem`.`postgraduatestudents` (
  `Id` varchar(50) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Sex` varchar(20) DEFAULT NULL,
  `PhoneNo` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `DegreeName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `StudentManagementSystem`.`certificatestudents` (
  `Id` varchar(50) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Sex` varchar(20) DEFAULT NULL,
  `PhoneNo` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `CourseName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
);

INSERT INTO `StudentManagementSystem`.`user` (`UserID`, `UserName`, `PassWord`) VALUES (1, 'admin', 'admin123');
