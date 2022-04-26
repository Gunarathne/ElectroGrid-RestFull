-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2022 at 06:39 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `electrogriddb`
--

-- --------------------------------------------------------

--
-- Table structure for table `complain_table`
--

CREATE TABLE `complain_table` (
  `Complain_id` int(5) NOT NULL,
  `Description` varchar(50) NOT NULL,
  `complainDate` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `complain_table`
--

INSERT INTO `complain_table` (`Complain_id`, `Description`, `complainDate`) VALUES
(14, 'Not Satisfied', '2022-04-24 21:29:30'),
(15, 'Test 3', '2022-04-24 21:29:30'),
(16, 'Test 4', '2022-04-24 21:29:30'),
(17, 'Test 5', '2022-04-24 21:29:30'),
(19, 'Test 6', '2022-04-24 21:29:30');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `complain_table`
--
ALTER TABLE `complain_table`
  ADD PRIMARY KEY (`Complain_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `complain_table`
--
ALTER TABLE `complain_table`
  MODIFY `Complain_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
