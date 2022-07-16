-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2022 at 06:27 PM
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
-- Database: `paymentdatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `PaymentID` int(10) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `ContactNumber` int(10) NOT NULL,
  `CardName` varchar(10) NOT NULL,
  `CreditCardNumber` bigint(12) NOT NULL,
  `ExpiryDate` varchar(10) NOT NULL,
  `CVV` int(3) NOT NULL,
  `PaymentDate` timestamp NOT NULL DEFAULT current_timestamp(),
  `Amount` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`PaymentID`, `Name`, `Email`, `Address`, `ContactNumber`, `CardName`, `CreditCardNumber`, `ExpiryDate`, `CVV`, `PaymentDate`, `Amount`) VALUES
(2, 'Amantha', 'amantha@gmail.com', 'Gampaha', 784563215, 'Master', 332557618426, '01/27', 451, '2022-04-23 23:32:28', 4000),
(4, 'Jenuli', 'jenuli@gmail.com', 'Colombo', 758632148, 'Visa', 753159824652, '12/24', 337, '2022-04-23 23:32:28', 6000),
(7, 'Shehan', 'shehan@gmail.com', 'Rathnapura', 112524568, 'Master', 785285233654, '20/25', 111, '2022-04-23 23:32:28', 2000),
(8, 'Piyathma', 'piyathma@gmail.com', 'Anuradhapura', 771238654, 'Visa', 753159824652, '09/26', 427, '2022-04-23 23:32:28', 3000),
(10, 'Yehan', 'yehan@gmail.com', 'Yakkala', 767531594, 'Master', 453687519635, '05/26', 173, '2022-04-25 07:06:11', 1500),
(11, 'Kelum', 'kelum@gmail.com', 'Nittabuwa', 752364158, 'Master', 753852641572, '03/26', 122, '2022-04-25 07:20:52', 4500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`PaymentID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `PaymentID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
