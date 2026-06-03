-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2026 at 07:46 AM
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
-- Database: `hotel_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `id` int(11) NOT NULL,
  `room_number` varchar(10) NOT NULL,
  `room_type` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `status` varchar(50) NOT NULL DEFAULT 'Available',
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`id`, `room_number`, `room_type`, `price`, `status`, `user_id`) VALUES
(1, '101', 'Palazzo Arzola', 2500, 'Reserved', 2),
(2, '102', 'Palazzo Arzola', 2500, 'Reserved', 1),
(3, '201', 'Tuazon Deluxe', 1500, 'Available', NULL),
(4, '202', 'Tuazon Deluxe', 1500, 'Available', NULL),
(5, '203', 'Tuazon Deluxe', 1500, 'Available', NULL),
(6, '301', 'Casa Lacao', 4000, 'Reserved', NULL),
(7, '302', 'Casa Lacao', 4000, 'Reserved', NULL),
(8, '401', 'Grande Aviles', 3000, 'Available', NULL),
(9, '402', 'Grande Aviles', 3000, 'Available', NULL),
(20, '205', 'Tuazon Deluxe', 1500, 'Reserved', 1),
(21, '204', 'Tuazon Deluxe', 1500, 'Available', NULL),
(22, '304', 'Casa Lacao', 4000, 'Available', NULL),
(23, '303', 'Casa Lacao', 4000, 'Available', NULL),
(24, '104', 'Palazzo Arzola\r\n', 2500, 'Available', NULL),
(25, '105', 'Palazzo Arzola\r\n', 2500, 'Available', NULL),
(26, '305', 'Casa Lacao', 4000, 'Available', NULL),
(27, '306', 'Casa Lacao', 4000, 'Available', NULL),
(28, '403', 'Grande Aviles', 3000, 'Reserved', 3),
(29, '404', 'Grande Aviles', 3000, 'Available', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contact_number` varchar(20) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `email`, `contact_number`, `birthdate`, `created_at`) VALUES
(1, 'admin', 'admin123', 'admin@madrigal.com', '09123456789', '2006-04-18', '2026-06-02 08:59:56'),
(2, 'sophia', '12345678', '123', '123', '2006-04-18', '2026-06-02 09:03:07'),
(3, 'aj', 'qweasdzxc', 'ajpogi@gmail.com', '0967676767', '2006-05-24', '2026-06-03 05:38:22');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `room_number` (`room_number`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `rooms_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
