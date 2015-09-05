-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.12-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Database structure for database 'techmentro'
--

CREATE DATABASE IF NOT EXISTS `techmentro` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `techmentro`;


--
-- Table structure for table 'empl'
--

CREATE TABLE IF NOT EXISTS 'empl' (
  'id' int(50) NOT NULL DEFAULT 0,
  'name' varchar(100) DEFAULT NULL,
  'job' varchar(100) DEFAULT NULL,
  'salary' int(10) unsigned DEFAULT NULL,
  PRIMARY KEY  ('id')
)ENGINE=MyISAM  DEFAULT CHARSET=utf8;



--
-- Dumping data for table 'empl'
--

LOCK TABLES 'empl' WRITE;
-- ## !40000 ALTER TABLE 'empl' DISABLE KEYS;
REPLACE INTO 'empl' ('id', 'name', 'job', 'salary') VALUES
	(1,'Adrish','Sr Software Engineer','50000');
REPLACE INTO 'empl' ('id', 'name', 'job', 'salary') VALUES
	(2,'Naved','Sr Engineer','40000');
REPLACE INTO 'empl' ('id', 'name', 'job', 'salary') VALUES
	(3,'Amit','Trainee','5000');
REPLACE INTO 'empl' ('id', 'name', 'job', 'salary') VALUES
	(4,'Roman','Trainee','4500');
REPLACE INTO 'empl' ('id', 'name', 'job', 'salary') VALUES
	(5,'Aditya','Manager','5000');
--/*!40000 ALTER TABLE 'empl' ENABLE KEYS;*/
UNLOCK TABLES;
--/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
--/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
