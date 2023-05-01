-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: hotel_alura
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `tb_hospedes`
--

DROP TABLE IF EXISTS `tb_hospedes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_hospedes` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NOME` varchar(10) NOT NULL,
  `SOBRENOME` varchar(25) NOT NULL,
  `DATA_NASCIMENTO` timestamp(4) NOT NULL,
  `NACIONALIDADE` varchar(20) DEFAULT NULL,
  `TELEFONE` varchar(20) NOT NULL,
  `ID_RESERVA` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_RESERVA` (`ID_RESERVA`),
  CONSTRAINT `tb_hospedes_ibfk_1` FOREIGN KEY (`ID_RESERVA`) REFERENCES `tb_reservas` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_hospedes`
--

LOCK TABLES `tb_hospedes` WRITE;
/*!40000 ALTER TABLE `tb_hospedes` DISABLE KEYS */;
INSERT INTO `tb_hospedes` VALUES (5,'Danilo','Cardilli','2023-04-13 03:00:00.0000','brasileiro','11991960325',6),(7,'Bruna','Cardilli','2023-04-13 03:00:00.0000','antiguano','119999',8);
/*!40000 ALTER TABLE `tb_hospedes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_reservas`
--

DROP TABLE IF EXISTS `tb_reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_reservas` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `DATA_ENTRADA` timestamp(6) NOT NULL,
  `DATA_SAIDA` timestamp(6) NOT NULL,
  `VALOR` decimal(5,2) DEFAULT NULL,
  `FORMA_PAGAMENTO` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_reservas`
--

LOCK TABLES `tb_reservas` WRITE;
/*!40000 ALTER TABLE `tb_reservas` DISABLE KEYS */;
INSERT INTO `tb_reservas` VALUES (6,'2023-04-26 03:00:00.000000','2023-04-29 03:00:00.000000',180.00,'CartÃ£o de DÃ©bito'),(8,'2023-04-13 03:00:00.000000','2023-04-18 03:00:00.000000',250.00,'CartÃ£o de DÃ©bito');
/*!40000 ALTER TABLE `tb_reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'hotel_alura'
--

--
-- Dumping routines for database 'hotel_alura'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-01  9:38:22
