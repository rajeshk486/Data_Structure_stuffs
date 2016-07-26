-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 20, 2013 at 03:33 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test1`
--

-- --------------------------------------------------------

--
-- Table structure for table `contactuslist`
--

CREATE TABLE IF NOT EXISTS `contactuslist` (
  `name` varchar(50) NOT NULL,
  `email` varchar(75) NOT NULL,
  `phone` int(11) NOT NULL,
  `appid` varchar(75) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contactuslist`
--

INSERT INTO `contactuslist` (`name`, `email`, `phone`, `appid`) VALUES
('rajesh kamalanathan', 'rajeshkamalanathan486@gmail.com', 2147483647, '420');
