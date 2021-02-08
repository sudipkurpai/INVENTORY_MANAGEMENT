-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 07, 2021 at 05:01 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_register`
--

CREATE TABLE `employee_register` (
  `FIRST_NAME` varchar(50) NOT NULL,
  `LAST_NAME` varchar(100) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `MOBILE_NO` varchar(20) NOT NULL,
  `EMP_ID` varchar(12) NOT NULL,
  `PASSWORD` varchar(30) NOT NULL,
  `CONFIRM_PASSWORD` varchar(30) NOT NULL,
  `T_D` varchar(30) NOT NULL,
  `DOB` varchar(20) NOT NULL,
  `ADDRESS` varchar(500) NOT NULL,
  `GENDER` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee_register`
--

INSERT INTO `employee_register` (`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `EMP_ID`, `PASSWORD`, `CONFIRM_PASSWORD`, `T_D`, `DOB`, `ADDRESS`, `GENDER`) VALUES
('Bhola', 'Baba', '@sorga', '', 'INVEE100001', '1234', '1234', '', '99988', 'sdfsdf', '');

-- --------------------------------------------------------

--
-- Table structure for table `emp_session`
--

CREATE TABLE `emp_session` (
  `EMP_NAME` varchar(100) NOT NULL,
  `EMP_ID` varchar(12) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `PHONE` varchar(20) NOT NULL,
  `LOGIN_TIME` varchar(30) NOT NULL,
  `LOGOUT_TIME` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `id_store`
--

CREATE TABLE `id_store` (
  `MNG_ID` varchar(12) NOT NULL,
  `EMP_ID` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `id_store`
--

INSERT INTO `id_store` (`MNG_ID`, `EMP_ID`) VALUES
('100000', '100001');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `FIRST_NAME` varchar(15) NOT NULL,
  `LAST_NAME` varchar(15) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `MOBILE_NO` varchar(15) NOT NULL,
  `MNG_ID` varchar(12) NOT NULL,
  `PASSWORD` varchar(25) NOT NULL,
  `CONFIRM_PASSWORD` varchar(25) NOT NULL,
  `ADDRESS` varchar(250) NOT NULL,
  `GENDER` varchar(10) NOT NULL,
  `T_D` varchar(20) NOT NULL,
  `DOB` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `MNG_ID`, `PASSWORD`, `CONFIRM_PASSWORD`, `ADDRESS`, `GENDER`, `T_D`, `DOB`) VALUES
('akash', 'M', 'FX', 'df', '', '1234', '1234', '', '', '', ''),
('Jay ', 'Maa Tara', 'JayMaa', '101', '', '123', '123', '', '', '', ''),
('Sudip', 'Maiti', 'maiti.sudip20@gmail.com', '9134456790', '', 'Sudip123', 'Sudip123', '', '', '', ''),
('QWE', 'EWQ', 'qewe121', '456789', '', '123', '123', '', '', '', ''),
('Sudip', 'Maiti', 'sudip@gmail.com', '8116286557', '', 'sgdgs', 'hsucihxcui', '', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee_register`
--
ALTER TABLE `employee_register`
  ADD PRIMARY KEY (`EMAIL`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`EMAIL`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
