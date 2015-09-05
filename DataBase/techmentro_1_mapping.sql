# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                 127.0.0.1
# Database:             techmentro_1_mapping
# Server version:       5.0.51b-community-nt
# Server OS:            Win32
# Target-Compatibility: Standard ANSI SQL
# HeidiSQL version:     3.2 Revision: 1129
# --------------------------------------------------------

/*!40100 SET CHARACTER SET latin1;*/
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ANSI';*/
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;*/


#
# Database structure for database 'techmentro_1_mapping'
#

CREATE DATABASE /*!32312 IF NOT EXISTS*/ "techmentro_1_mapping" /*!40100 DEFAULT CHARACTER SET latin1 */;

USE "techmentro_1_mapping";


#
# Table structure for table 'batchess'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "batchess" (
  "trainerId" int(11) default '0',
  "batchId" tinyint(3) unsigned NOT NULL auto_increment,
  "slot" varchar(500) NOT NULL,
  "topic" varchar(500) NOT NULL,
  PRIMARY KEY  ("batchId")
) AUTO_INCREMENT=23 /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'batchess'
#

LOCK TABLES "batchess" WRITE;
/*!40000 ALTER TABLE "batchess" DISABLE KEYS;*/
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(1,1,'3-6','Struts');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(1,2,'9-12','C#');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(1,3,'8-10','Spring');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(1,4,'12-2','ASP.NET');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(3,5,'3-6','Struts');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(3,6,'9-12','C#');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(3,7,'8-10','Spring');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(3,8,'12-2','ASP.NET');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(5,9,'3-6','Struts');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(5,10,'9-12','C#');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(5,11,'8-10','Spring');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(5,12,'12-2','ASP.NET');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(7,13,'3-6','Struts');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(7,14,'8-10','Spring');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(8,15,'9-12','C#');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(8,16,'12-2','ASP.NET');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(13,17,'8-10','Spring');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(13,18,'3-6','Struts');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(13,19,'12-2','Groovy & Grail');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(14,20,'9-12','C#');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(14,21,'12-2','ASP.NET');
REPLACE INTO "batchess" ("trainerId", "batchId", "slot", "topic") VALUES
	(14,22,'12-2','ASP.NET');
/*!40000 ALTER TABLE "batchess" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'batchmaster'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "batchmaster" (
  "id" int(10) unsigned NOT NULL auto_increment,
  "slot" varchar(50) NOT NULL,
  "topic" varchar(50) NOT NULL,
  PRIMARY KEY  ("id")
) AUTO_INCREMENT=9 /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'batchmaster'
#

LOCK TABLES "batchmaster" WRITE;
/*!40000 ALTER TABLE "batchmaster" DISABLE KEYS;*/
REPLACE INTO "batchmaster" ("id", "slot", "topic") VALUES
	('1','3-6','Struts');
REPLACE INTO "batchmaster" ("id", "slot", "topic") VALUES
	('2','8-10','Spring');
REPLACE INTO "batchmaster" ("id", "slot", "topic") VALUES
	('3','9-12','C#');
REPLACE INTO "batchmaster" ("id", "slot", "topic") VALUES
	('4','12-2','ASP.NET');
REPLACE INTO "batchmaster" ("id", "slot", "topic") VALUES
	('5','8-10','Spring');
REPLACE INTO "batchmaster" ("id", "slot", "topic") VALUES
	('6','3-6','Struts');
REPLACE INTO "batchmaster" ("id", "slot", "topic") VALUES
	('7','12-2','ASP.NET');
REPLACE INTO "batchmaster" ("id", "slot", "topic") VALUES
	('8','9-12','C#');
/*!40000 ALTER TABLE "batchmaster" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'clients'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "clients" (
  "id" int(10) unsigned NOT NULL auto_increment,
  "name" varchar(500) default NULL,
  "loc" varchar(1000) default NULL,
  PRIMARY KEY  ("id")
) AUTO_INCREMENT=6 /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'clients'
#

LOCK TABLES "clients" WRITE;
/*!40000 ALTER TABLE "clients" DISABLE KEYS;*/
REPLACE INTO "clients" ("id", "name", "loc") VALUES
	('1','HES Inc.','USA');
REPLACE INTO "clients" ("id", "name", "loc") VALUES
	('2','BP','UK');
REPLACE INTO "clients" ("id", "name", "loc") VALUES
	('3','Vodafone India','India');
REPLACE INTO "clients" ("id", "name", "loc") VALUES
	('4','Quater Gas LLC.','Quatar');
REPLACE INTO "clients" ("id", "name", "loc") VALUES
	('5','Bharti Airtel','India');
/*!40000 ALTER TABLE "clients" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'countries'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "countries" (
  "id" int(10) unsigned NOT NULL default '0',
  "name" varchar(50) NOT NULL,
  "hosId" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("id")
) /*!40100 DEFAULT CHARSET=latin1 COMMENT='Owner'*/;



#
# Dumping data for table 'countries'
#

LOCK TABLES "countries" WRITE;
/*!40000 ALTER TABLE "countries" DISABLE KEYS;*/
REPLACE INTO "countries" ("id", "name", "hosId") VALUES
	('1','India','4');
REPLACE INTO "countries" ("id", "name", "hosId") VALUES
	('2','UK','5');
REPLACE INTO "countries" ("id", "name", "hosId") VALUES
	('3','USA','6');
/*!40000 ALTER TABLE "countries" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'country'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "country" (
  "id" int(10) unsigned NOT NULL,
  "name" varchar(100) NOT NULL,
  PRIMARY KEY  ("id")
) /*!40100 DEFAULT CHARSET=latin1 COMMENT='Owner_Entity'*/;



#
# Dumping data for table 'country'
#

LOCK TABLES "country" WRITE;
/*!40000 ALTER TABLE "country" DISABLE KEYS;*/
REPLACE INTO "country" ("id", "name") VALUES
	('1','India');
REPLACE INTO "country" ("id", "name") VALUES
	('2','UK');
REPLACE INTO "country" ("id", "name") VALUES
	('3','USA');
REPLACE INTO "country" ("id", "name") VALUES
	('4','India');
REPLACE INTO "country" ("id", "name") VALUES
	('5','UK');
REPLACE INTO "country" ("id", "name") VALUES
	('6','USA');
/*!40000 ALTER TABLE "country" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'country_hos_rel_table'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "country_hos_rel_table" (
  "countryId" int(10) unsigned default NULL,
  "hosId" int(10) unsigned default NULL
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'country_hos_rel_table'
#

LOCK TABLES "country_hos_rel_table" WRITE;
/*!40000 ALTER TABLE "country_hos_rel_table" DISABLE KEYS;*/
REPLACE INTO "country_hos_rel_table" ("countryId", "hosId") VALUES
	('4','7');
REPLACE INTO "country_hos_rel_table" ("countryId", "hosId") VALUES
	('5','8');
REPLACE INTO "country_hos_rel_table" ("countryId", "hosId") VALUES
	('6','9');
REPLACE INTO "country_hos_rel_table" ("countryId", "hosId") VALUES
	('1','2');
/*!40000 ALTER TABLE "country_hos_rel_table" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'coursemaster'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "coursemaster" (
  "ID" int(10) unsigned NOT NULL auto_increment,
  "NAME" varchar(500) NOT NULL,
  "FEE" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("ID")
) AUTO_INCREMENT=4 /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'coursemaster'
#

LOCK TABLES "coursemaster" WRITE;
/*!40000 ALTER TABLE "coursemaster" DISABLE KEYS;*/
REPLACE INTO "coursemaster" ("ID", "NAME", "FEE") VALUES
	('1','Struts 2.x','4000');
REPLACE INTO "coursemaster" ("ID", "NAME", "FEE") VALUES
	('2','Spring 2','4000');
REPLACE INTO "coursemaster" ("ID", "NAME", "FEE") VALUES
	('3','Hibernate 3','4000');
/*!40000 ALTER TABLE "coursemaster" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'emp'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "emp" (
  "id" int(10) unsigned NOT NULL auto_increment,
  "name" varchar(50) NOT NULL,
  "job" varchar(50) NOT NULL,
  "salary" int(10) unsigned default NULL,
  PRIMARY KEY  ("id")
) AUTO_INCREMENT=17 /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'emp'
#

LOCK TABLES "emp" WRITE;
/*!40000 ALTER TABLE "emp" DISABLE KEYS;*/
REPLACE INTO "emp" ("id", "name", "job", "salary") VALUES
	('11','Vipul','COO','100000');
REPLACE INTO "emp" ("id", "name", "job", "salary") VALUES
	('12','Nitin','Sr. Technical Manager','50000');
REPLACE INTO "emp" ("id", "name", "job", "salary") VALUES
	('13','Rani','Technical Manager','35000');
REPLACE INTO "emp" ("id", "name", "job", "salary") VALUES
	('14','Anindya','Project Lead','30000');
REPLACE INTO "emp" ("id", "name", "job", "salary") VALUES
	('15','Kuldeep','Technical Lead','29500');
REPLACE INTO "emp" ("id", "name", "job", "salary") VALUES
	('16','Avinash','Sr Engineer','25000');
/*!40000 ALTER TABLE "emp" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'emp_previlige'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "emp_previlige" (
  "empId" int(10) unsigned NOT NULL default '0',
  "previligeId" int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  ("empId","previligeId")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'emp_previlige'
#

LOCK TABLES "emp_previlige" WRITE;
/*!40000 ALTER TABLE "emp_previlige" DISABLE KEYS;*/
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('11','7');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('11','8');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('11','9');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('12','7');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('12','8');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('13','7');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('14','10');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('14','11');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('14','12');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('15','10');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('15','12');
REPLACE INTO "emp_previlige" ("empId", "previligeId") VALUES
	('16','12');
/*!40000 ALTER TABLE "emp_previlige" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'employees'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "employees" (
  "personId" int(10) unsigned NOT NULL default '0',
  "job" varchar(50) NOT NULL,
  "salary" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("personId")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'employees'
#

LOCK TABLES "employees" WRITE;
/*!40000 ALTER TABLE "employees" DISABLE KEYS;*/
REPLACE INTO "employees" ("personId", "job", "salary") VALUES
	('2','Sr. Analyst','20000');
/*!40000 ALTER TABLE "employees" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'hos'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "hos" (
  "id" int(10) unsigned NOT NULL auto_increment,
  "title" varchar(100) NOT NULL,
  "name" varchar(100) NOT NULL,
  PRIMARY KEY  ("id")
) AUTO_INCREMENT=10 /*!40100 DEFAULT CHARSET=latin1 COMMENT='owned_entity'*/;



#
# Dumping data for table 'hos'
#

LOCK TABLES "hos" WRITE;
/*!40000 ALTER TABLE "hos" DISABLE KEYS;*/
REPLACE INTO "hos" ("id", "title", "name") VALUES
	('1','President','P. Mukherjee');
REPLACE INTO "hos" ("id", "title", "name") VALUES
	('2','Queen','Elizabeth II');
REPLACE INTO "hos" ("id", "title", "name") VALUES
	('3','President','B. Obama');
REPLACE INTO "hos" ("id", "title", "name") VALUES
	('4','President','P. Mukherjee');
REPLACE INTO "hos" ("id", "title", "name") VALUES
	('5','Queen','Elizabeth II');
REPLACE INTO "hos" ("id", "title", "name") VALUES
	('6','President','B. Obama');
REPLACE INTO "hos" ("id", "title", "name") VALUES
	('7','President','P. Mukherjee');
REPLACE INTO "hos" ("id", "title", "name") VALUES
	('8','Queen','Elizabeth II');
REPLACE INTO "hos" ("id", "title", "name") VALUES
	('9','President','B. Obama');
/*!40000 ALTER TABLE "hos" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'person'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "person" (
  "id" int(10) unsigned NOT NULL default '0',
  "name" varchar(100) NOT NULL,
  PRIMARY KEY  ("id")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'person'
#

LOCK TABLES "person" WRITE;
/*!40000 ALTER TABLE "person" DISABLE KEYS;*/
REPLACE INTO "person" ("id", "name") VALUES
	('1','Armany John');
/*!40000 ALTER TABLE "person" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'persons'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "persons" (
  "id" int(10) unsigned NOT NULL default '0',
  "name" varchar(50) default NULL,
  "job" varchar(50) default NULL,
  "salary" int(10) unsigned default NULL,
  "course" varchar(50) default NULL,
  "fee" int(10) unsigned default NULL,
  "personType" int(10) unsigned default NULL,
  PRIMARY KEY  ("id")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'persons'
#

LOCK TABLES "persons" WRITE;
/*!40000 ALTER TABLE "persons" DISABLE KEYS;*/
REPLACE INTO "persons" ("id", "name", "job", "salary", "course", "fee", "personType") VALUES
	('1','Amit',NULL,NULL,NULL,NULL,'1');
REPLACE INTO "persons" ("id", "name", "job", "salary", "course", "fee", "personType") VALUES
	('2','Roman','Sr. Analyst','20000',NULL,NULL,'2');
REPLACE INTO "persons" ("id", "name", "job", "salary", "course", "fee", "personType") VALUES
	('3','Aditya',NULL,NULL,'Java','5000','3');
/*!40000 ALTER TABLE "persons" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'pm_proj'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "pm_proj" (
  "pmId" int(10) unsigned default NULL,
  "clientId" int(10) unsigned default NULL,
  "projectId" int(10) unsigned default NULL
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'pm_proj'
#

LOCK TABLES "pm_proj" WRITE;
/*!40000 ALTER TABLE "pm_proj" DISABLE KEYS;*/
REPLACE INTO "pm_proj" ("pmId", "clientId", "projectId") VALUES
	('5','4','9');
REPLACE INTO "pm_proj" ("pmId", "clientId", "projectId") VALUES
	('5','1','10');
REPLACE INTO "pm_proj" ("pmId", "clientId", "projectId") VALUES
	('5','2','11');
REPLACE INTO "pm_proj" ("pmId", "clientId", "projectId") VALUES
	('6','5','12');
REPLACE INTO "pm_proj" ("pmId", "clientId", "projectId") VALUES
	('6','3','13');
/*!40000 ALTER TABLE "pm_proj" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'pm_projects'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "pm_projects" (
  "pmId" tinyint(3) unsigned NOT NULL,
  "client" varchar(50) NOT NULL,
  "projectId" int(10) unsigned NOT NULL
) /*!40100 DEFAULT CHARSET=latin1 COMMENT='relation table'*/;



#
# Dumping data for table 'pm_projects'
#

LOCK TABLES "pm_projects" WRITE;
/*!40000 ALTER TABLE "pm_projects" DISABLE KEYS;*/
REPLACE INTO "pm_projects" ("pmId", "client", "projectId") VALUES
	(1,'PQR LLC.','1');
REPLACE INTO "pm_projects" ("pmId", "client", "projectId") VALUES
	(1,'XYZ Inc.','2');
REPLACE INTO "pm_projects" ("pmId", "client", "projectId") VALUES
	(2,'ABC Ltd.','3');
REPLACE INTO "pm_projects" ("pmId", "client", "projectId") VALUES
	(2,'MNP PVT LTD.','4');
REPLACE INTO "pm_projects" ("pmId", "client", "projectId") VALUES
	(3,'PQR LLC.','5');
REPLACE INTO "pm_projects" ("pmId", "client", "projectId") VALUES
	(3,'XYZ Inc.','6');
REPLACE INTO "pm_projects" ("pmId", "client", "projectId") VALUES
	(4,'ABC Ltd.','7');
REPLACE INTO "pm_projects" ("pmId", "client", "projectId") VALUES
	(4,'MNP PVT LTD.','8');
/*!40000 ALTER TABLE "pm_projects" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'previliges'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "previliges" (
  "id" int(10) unsigned NOT NULL auto_increment,
  "name" varchar(50) NOT NULL,
  "cost" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("id")
) AUTO_INCREMENT=13 /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'previliges'
#

LOCK TABLES "previliges" WRITE;
/*!40000 ALTER TABLE "previliges" DISABLE KEYS;*/
REPLACE INTO "previliges" ("id", "name", "cost") VALUES
	('7','Car','60000');
REPLACE INTO "previliges" ("id", "name", "cost") VALUES
	('8','Flat','300000');
REPLACE INTO "previliges" ("id", "name", "cost") VALUES
	('9','Foreign Tour','600000');
REPLACE INTO "previliges" ("id", "name", "cost") VALUES
	('10','Incentive on target','30000');
REPLACE INTO "previliges" ("id", "name", "cost") VALUES
	('11','Gift vouchers on target','12000');
REPLACE INTO "previliges" ("id", "name", "cost") VALUES
	('12','Cab','6000');
/*!40000 ALTER TABLE "previliges" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'projectmanager'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "projectmanager" (
  "id" int(10) unsigned NOT NULL default '0',
  "name" varchar(500) NOT NULL,
  PRIMARY KEY  ("id")
) /*!40100 DEFAULT CHARSET=latin1 COMMENT='owner'*/;



#
# Dumping data for table 'projectmanager'
#

LOCK TABLES "projectmanager" WRITE;
/*!40000 ALTER TABLE "projectmanager" DISABLE KEYS;*/
REPLACE INTO "projectmanager" ("id", "name") VALUES
	('1','Adrish');
REPLACE INTO "projectmanager" ("id", "name") VALUES
	('2','Naved');
REPLACE INTO "projectmanager" ("id", "name") VALUES
	('3','Adrish');
REPLACE INTO "projectmanager" ("id", "name") VALUES
	('4','Naved');
REPLACE INTO "projectmanager" ("id", "name") VALUES
	('5','Adrish');
REPLACE INTO "projectmanager" ("id", "name") VALUES
	('6','Naved');
/*!40000 ALTER TABLE "projectmanager" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'projects'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "projects" (
  "id" int(10) unsigned NOT NULL default '0',
  "name" varchar(50) NOT NULL,
  "teamSize" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("id")
) /*!40100 DEFAULT CHARSET=latin1 COMMENT='OwnedEntity'*/;



#
# Dumping data for table 'projects'
#

LOCK TABLES "projects" WRITE;
/*!40000 ALTER TABLE "projects" DISABLE KEYS;*/
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('1','B solutioning','30');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('2','A Sys Pro','20');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('3','C cracks','10');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('4','D Info Beta','80');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('5','B solutioning','30');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('6','A Sys Pro','20');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('7','C cracks','10');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('8','D Info Beta','80');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('9','Quintiq - supply chain planning system','80');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('10','BattleRed - HDF','20');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('11','BP PetroGasDataManagement.','30');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('12','Airtel Fraud Control System.','10');
REPLACE INTO "projects" ("id", "name", "teamSize") VALUES
	('13','Vodafone Telecom Fraud Management.','10');
/*!40000 ALTER TABLE "projects" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'student'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "student" (
  "id" int(10) unsigned NOT NULL default '0',
  "name" varchar(100) NOT NULL,
  "course" varchar(100) NOT NULL,
  "fee" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("id")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'student'
#

LOCK TABLES "student" WRITE;
/*!40000 ALTER TABLE "student" DISABLE KEYS;*/
REPLACE INTO "student" ("id", "name", "course", "fee") VALUES
	('1','StupidGuy BadBoy','Java','5000');
/*!40000 ALTER TABLE "student" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'students'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "students" (
  "personId" int(10) unsigned NOT NULL default '0',
  "course" varchar(100) NOT NULL,
  "fee" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("personId")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'students'
#

LOCK TABLES "students" WRITE;
/*!40000 ALTER TABLE "students" DISABLE KEYS;*/
REPLACE INTO "students" ("personId", "course", "fee") VALUES
	('3','Java','5000');
/*!40000 ALTER TABLE "students" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'topicmaster'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "topicmaster" (
  "courseId" int(10) unsigned NOT NULL default '0',
  "topicIndex" int(10) unsigned NOT NULL default '0',
  "topic" varchar(500) default NULL,
  PRIMARY KEY  ("courseId","topicIndex")
) /*!40100 DEFAULT CHARSET=latin1 COMMENT='CollectionTable'*/;



#
# Dumping data for table 'topicmaster'
#

LOCK TABLES "topicmaster" WRITE;
/*!40000 ALTER TABLE "topicmaster" DISABLE KEYS;*/
REPLACE INTO "topicmaster" ("courseId", "topicIndex", "topic") VALUES
	('1','0','Hibernate Arch');
REPLACE INTO "topicmaster" ("courseId", "topicIndex", "topic") VALUES
	('1','1','Hibernate Common Methods');
REPLACE INTO "topicmaster" ("courseId", "topicIndex", "topic") VALUES
	('1','2','Hibernate Mapping');
REPLACE INTO "topicmaster" ("courseId", "topicIndex", "topic") VALUES
	('2','0','Hibernate Arch');
REPLACE INTO "topicmaster" ("courseId", "topicIndex", "topic") VALUES
	('2','1','Hibernate Common Methods');
REPLACE INTO "topicmaster" ("courseId", "topicIndex", "topic") VALUES
	('2','2','Hibernate Mapping');
REPLACE INTO "topicmaster" ("courseId", "topicIndex", "topic") VALUES
	('3','0','Hibernate Arch');
REPLACE INTO "topicmaster" ("courseId", "topicIndex", "topic") VALUES
	('3','1','Hibernate Common Methods');
REPLACE INTO "topicmaster" ("courseId", "topicIndex", "topic") VALUES
	('3','2','Hibernate Mapping');
/*!40000 ALTER TABLE "topicmaster" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'trainer_batch'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "trainer_batch" (
  "trainerId" int(10) unsigned NOT NULL,
  "batchId" int(10) unsigned NOT NULL,
  PRIMARY KEY  ("batchId","trainerId")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'trainer_batch'
#

LOCK TABLES "trainer_batch" WRITE;
/*!40000 ALTER TABLE "trainer_batch" DISABLE KEYS;*/
REPLACE INTO "trainer_batch" ("trainerId", "batchId") VALUES
	('9','1');
REPLACE INTO "trainer_batch" ("trainerId", "batchId") VALUES
	('9','2');
REPLACE INTO "trainer_batch" ("trainerId", "batchId") VALUES
	('10','3');
REPLACE INTO "trainer_batch" ("trainerId", "batchId") VALUES
	('10','4');
REPLACE INTO "trainer_batch" ("trainerId", "batchId") VALUES
	('11','5');
REPLACE INTO "trainer_batch" ("trainerId", "batchId") VALUES
	('11','6');
REPLACE INTO "trainer_batch" ("trainerId", "batchId") VALUES
	('12','7');
REPLACE INTO "trainer_batch" ("trainerId", "batchId") VALUES
	('12','8');
/*!40000 ALTER TABLE "trainer_batch" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'trainers'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "trainers" (
  "id" int(10) unsigned NOT NULL auto_increment,
  "Name" varchar(500) default NULL,
  PRIMARY KEY  ("id")
) AUTO_INCREMENT=15 /*!40100 DEFAULT CHARSET=latin1 COMMENT='OwnerTable'*/;



#
# Dumping data for table 'trainers'
#

LOCK TABLES "trainers" WRITE;
/*!40000 ALTER TABLE "trainers" DISABLE KEYS;*/
REPLACE INTO "trainers" ("id", "Name") VALUES
	('1','Anil');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('2','Saurav');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('3','Anil');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('4','Saurav');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('5','Neeraj');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('6','Ayon');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('7','Neeraj Kumar');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('8','Ayon Chatterjee');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('9','Neeraj Kumar');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('10','Ayon Chatterjee');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('11','Adrish Bhattacharyay');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('12','Naved Khan');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('13','Adrish ......');
REPLACE INTO "trainers" ("id", "Name") VALUES
	('14','Ayon ......');
/*!40000 ALTER TABLE "trainers" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'usermaster'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "usermaster" (
  "id" int(10) unsigned NOT NULL auto_increment,
  "name" varchar(50) NOT NULL,
  "mailId" varchar(500) default NULL,
  "password" varchar(50) NOT NULL,
  PRIMARY KEY  ("id")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'usermaster'
#

# (No data found.)

/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
