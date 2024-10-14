-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2024 at 07:27 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cisdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `dd`
--

CREATE TABLE `dd` (
  `Department` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dd`
--

INSERT INTO `dd` (`Department`) VALUES
('Cleaning'),
('Finance'),
('Lectures'),
('QA');

-- --------------------------------------------------------

--
-- Table structure for table `designation`
--

CREATE TABLE `designation` (
  `Designation` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `designation`
--

INSERT INTO `designation` (`Designation`) VALUES
('Assistant'),
('Employee'),
('Helper'),
('President');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `epf` int(10) NOT NULL,
  `phonenumber` int(10) NOT NULL,
  `address` varchar(100) NOT NULL,
  `designation` varchar(15) NOT NULL,
  `department` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `name`, `epf`, `phonenumber`, `address`, `designation`, `department`) VALUES
(1, 'Shalika', 2345, 75032, 'Kalaniya', 'Employee', 'Marketing'),
(2, 'janaka', 23, 948, 'galkaduwa', 'President', 'SIS'),
(3, 'Hiran', 2365, 93412, 'Padukka', 'Employee', 'Lectures'),
(4, 'Dilu', 475, 3667, 'galla', 'Employee', 'Management'),
(5, 'Hemal', 1234, 36573, 'Delkada', 'Employee', 'Marketing'),
(6, 'chanaka', 23, 475, 'Galla', 'Employee', 'It'),
(7, 'Lasidu', 3242, 93242, 'Waga', 'Employee', 'Lectures'),
(8, 'Ashan', 234, 4753, 'Rathnapura', 'Employee', 'Game'),
(9, 'Dinu', 2001, 123456, 'Waga', 'Assistant', 'Lectures'),
(10, 'Gayan', 1236, 837453, 'Moratuwa', 'Helper', 'Lectures');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(10) DEFAULT NULL,
  `usertype` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`, `usertype`) VALUES
('Admin', '123', 'Admin'),
('Assistant', '1234', 'Assistant'),
('Dilshan', '234', 'Asistant'),
('Krishan', '123', 'Manager'),
('manager', '123', 'Manager');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dd`
--
ALTER TABLE `dd`
  ADD PRIMARY KEY (`Department`);

--
-- Indexes for table `designation`
--
ALTER TABLE `designation`
  ADD PRIMARY KEY (`Designation`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
