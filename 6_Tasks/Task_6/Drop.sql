CREATE DATABASE  IF NOT EXISTS `universe` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `universe`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: universe
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `galaxies`
--

DROP TABLE IF EXISTS `galaxies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `galaxies` (
  `idgalaxies` int(10) unsigned NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `palanet` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idgalaxies`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `galaxies`
--

LOCK TABLES `galaxies` WRITE;
/*!40000 ALTER TABLE `galaxies` DISABLE KEYS */;
INSERT INTO `galaxies` VALUES (1,'M82','Много'),(2,'NGC 2770','Много'),(3,'ESO 137—001','Мало'),(4,'NGC 3314B','Нет');
/*!40000 ALTER TABLE `galaxies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planets`
--

DROP TABLE IF EXISTS `planets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planets` (
  `idPlanets` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `core_temperature` int(11) DEFAULT NULL,
  `atmosphere` tinyint(4) DEFAULT NULL,
  `life` tinyint(4) DEFAULT NULL,
  `radius` double DEFAULT NULL,
  `satellites` tinyint(4) DEFAULT NULL,
  `galaxies_idgalaxies` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idPlanets`,`galaxies_idgalaxies`),
  KEY `fk_Planets_galaxies_idx` (`galaxies_idgalaxies`),
  CONSTRAINT `fk_Planets_galaxies` FOREIGN KEY (`galaxies_idgalaxies`) REFERENCES `galaxies` (`idgalaxies`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planets`
--

LOCK TABLES `planets` WRITE;
/*!40000 ALTER TABLE `planets` DISABLE KEYS */;
INSERT INTO `planets` VALUES (1,'Belena-21',18754,1,0,12457,2,1),(2,'Peleng-58',14258,0,0,8547,0,1),(3,'Animar-75',8547,1,1,9854,1,1),(4,'Nina-9',5478,1,1,5478,0,1),(5,'Keplirng-84',88745,1,1,5987,0,2),(6,'Lochi-87-z',2141,0,0,4587,1,2),(7,'Bird-58',12471,0,0,3547,3,2),(8,'Fish-54',25478,1,1,4857,2,3);
/*!40000 ALTER TABLE `planets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `satellites`
--

DROP TABLE IF EXISTS `satellites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `satellites` (
  `idsatellites` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `radius` double DEFAULT NULL,
  `distance` double DEFAULT NULL,
  `Planets_idPlanets` int(11) NOT NULL,
  `Planets_galaxies_idgalaxies` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idsatellites`,`Planets_idPlanets`,`Planets_galaxies_idgalaxies`),
  KEY `fk_satellites_Planets1_idx` (`Planets_idPlanets`,`Planets_galaxies_idgalaxies`),
  CONSTRAINT `fk_satellites_Planets1` FOREIGN KEY (`Planets_idPlanets`, `Planets_galaxies_idgalaxies`) REFERENCES `planets` (`idPlanets`, `galaxies_idgalaxies`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `satellites`
--

LOCK TABLES `satellites` WRITE;
/*!40000 ALTER TABLE `satellites` DISABLE KEYS */;
INSERT INTO `satellites` VALUES (1,'Arhon-58',124,54874,1,1),(2,'Geha-89',457,124787,1,1),(3,'Kila-8',1244,87548,3,1),(4,'Linj-86',214,587498,6,2),(5,'Like-38',2147,254711,7,2),(6,'Like-39',1247,124780,7,2),(7,'Like-40',1874,587454,7,2),(8,'Life-58',214,12478,8,3),(9,'Life-91',96,45874,8,3);
/*!40000 ALTER TABLE `satellites` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `idusers` int(10) unsigned NOT NULL,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idusers`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-19 19:58:06
