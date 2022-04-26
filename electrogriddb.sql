-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20220423.6d54ac471a
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2022 at 07:49 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.5

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
-- Table structure for table `userdb`
--

CREATE TABLE `userdb` (
  `UID` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `phoneNO` int(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `address` varchar(20) NOT NULL,
  `accountNO` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userdb`
--

INSERT INTO `userdb` (`UID`, `name`, `phoneNO`, `email`, `address`, `accountNO`) VALUES
(3, 'Viru', 12343322, 'viru@gmail.gmail', 'anurahap', 23623),
(5, 'farah', 12343333, 'vfaru@gmail.gmail', 'mathale', 236233),
(6, 'qqqq', 12343333, 'vfaru@gmail.gmail', 'mathale', 236233),
(7, 'qqqq', 12343333, 'vfaru@gmail.gmail', 'mathale', 236233),
(8, 'qqqqjhjj', 12343333, 'vfaru@gmail.gmail', 'mathale', 236233),
(9, 'qqqqjhjj', 12343333, 'vfaru@gmail.gmail', 'mathale', 236233),
(10, 'qqqqjhjj', 12343333, 'vfaru@gmail.gmail', 'mathale', 236233),
(11, 'qqqqjhjj', 12343333, 'vfaru@gmail.gmail', 'mathale', 236233),
(12, 'Hemal ', 711234356, 'hemal@gmail.gmail', 'mathale', 236233),
(13, 'Alia ', 711234345, 'alia@gmail.gmail', 'Colombo', 236233),
(14, 'Jackie ', 711234335, 'jac@gmail.gmail', 'Kandy', 236233),
(15, 'Vinod', 711234335, 'vin@gmail.gmail', 'Jaffna', 236980),
(16, 'Jini', 711234335, 'jin@gmail.gmail', 'Katunayake', 236899);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `userdb`
--
ALTER TABLE `userdb`
  ADD PRIMARY KEY (`UID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `userdb`
--
ALTER TABLE `userdb`
  MODIFY `UID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



