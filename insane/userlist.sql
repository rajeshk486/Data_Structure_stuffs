-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 20, 2013 at 03:34 PM
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
-- Table structure for table `userlist`
--

CREATE TABLE IF NOT EXISTS `userlist` (
  `name` varchar(50) NOT NULL,
  `email` varchar(75) NOT NULL,
  `password` varchar(60) NOT NULL,
  `phone` int(11) NOT NULL,
  `appid` varchar(75) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userlist`
--

INSERT INTO `userlist` (`name`, `email`, `password`, `phone`, `appid`) VALUES
('', '', '', 0, '420'),
('rajesh kamalanathan', 'dfd', '', 2147483647, '420'),
('rajesh', 'ra@gmail.com', '7994565', 2147483647, '454'),
('rajesh kamalanathan', 'rajeshkamalanadfgdsthan486@gmail.com', '', 2147483647, '420'),
('rajesh kamalanathan', 'rajeshkamalanathafsadfn486@gmail.com', '', 2147483647, '420'),
('asdf', 'rajeshkamalanathan486@gmail.com', 'sdfdsaf', 2147483647, '420'),
('safaf', 'sffsdaf', '', 0, '420');
