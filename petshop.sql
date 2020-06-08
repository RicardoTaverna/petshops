-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2020 at 10:59 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `petshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `clienteId` int(11) NOT NULL,
  `primeiro_nome` varchar(20) DEFAULT NULL,
  `sobrenome` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `senha` varchar(50) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `cidade` varchar(20) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `telefone` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`clienteId`, `primeiro_nome`, `sobrenome`, `email`, `senha`, `cep`, `cidade`, `cpf`, `telefone`) VALUES
(1, 'Ricardo', 'Taverna', 'taverna.ricardo@gmail.om', 'qwerty', 'default', 'default', 'default', 'default'),
(2, 'teste', 'testeraldo', 'teste@teste.com', 'testezinho', '88888882', 'Curitiba', '7777777', '419999999'),
(3, 'Gelson', 'Taverna', 'gelson@taverna.com', 'qwertyuiio', 'default', 'default', 'default', 'default'),
(4, 'ygor', 'sadas', 'dsadas@gmail.com', 'teste', 'default', 'default', 'default', 'default'),
(5, 'teste', 'teste', 'ygor@gmail.com', 'teste', 'default', 'default', 'default', 'default');

-- --------------------------------------------------------

--
-- Table structure for table `fornecedor`
--

CREATE TABLE `fornecedor` (
  `fornecedorId` int(11) NOT NULL,
  `nome_fantasia` varchar(50) NOT NULL,
  `cnpj` text NOT NULL,
  `cep` varchar(10) NOT NULL,
  `cidade` varchar(20) NOT NULL,
  `horario_funcionamento` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(12) NOT NULL,
  `senha` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fornecedor`
--

INSERT INTO `fornecedor` (`fornecedorId`, `nome_fantasia`, `cnpj`, `cep`, `cidade`, `horario_funcionamento`, `email`, `telefone`, `senha`) VALUES
(1, 'Petshop Teste 1', '121212121212/0001-1', '82000000', 'teste', '8hrs', 'petshop@teste1.com', '41999888777', '123'),
(2, 'Petshop Teste 2', '131313131313/0001-1', '82000001', 'default', 'default', 'petshop@teste2.com', '41999888222', 'qwertyuiio'),
(3, 'Petshop Teste 3', '141414141414/0001-3', '82000003', 'default', 'default', 'petshop@teste3.com', '41999888333', 'qwertyuiio'),
(4, 'Petshop Teste 4', '151515151515/0001-3', '82000004', 'default', 'default', 'petshop@teste4.com', '41999888444', 'qwertyuiio'),
(5, 'Petshop Teste 5', '161616161616/0001-5', '82000005', 'default', 'default', 'petshop@teste5.com', '41999888555', 'qwertyuiio'),
(6, 'Petshop Teste 6', '171717171717/0001-6', '82000006', 'default', 'default', 'petshop@teste6.com', '41999888666', 'qwertyuiio');

-- --------------------------------------------------------

--
-- Table structure for table `pedido`
--

CREATE TABLE `pedido` (
  `pedidoId` int(11) NOT NULL,
  `clientId` int(11) NOT NULL,
  `fornecedorId` int(11) NOT NULL,
  `servicosId` int(11) NOT NULL,
  `data_pedido` date NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor_total` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `servicos`
--

CREATE TABLE `servicos` (
  `servicosId` int(11) NOT NULL,
  `fornecedorId` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `preco` float NOT NULL,
  `descricao` text NOT NULL,
  `tempo_servico` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `servicos`
--

INSERT INTO `servicos` (`servicosId`, `fornecedorId`, `nome`, `preco`, `descricao`, `tempo_servico`) VALUES
(1, 1, 'banho', 30, 'Banho completo blabla', '60'),
(2, 1, 'Tosa', 20, 'Tosa completa blabla', '60'),
(4, 2, 'banho e tosa', 50, 'Banho e tosa completa blabla', '120'),
(5, 3, 'banho e tosa', 50, 'Banho e tosa completa blabla', '120'),
(7, 1, 'Banho + Tosa', 45, 'Banho + Tosa em seu cachorro ou gato', '120');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`clienteId`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`fornecedorId`);

--
-- Indexes for table `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`pedidoId`),
  ADD KEY `clientId` (`clientId`),
  ADD KEY `fornecedorId` (`fornecedorId`),
  ADD KEY `servicosId` (`servicosId`);

--
-- Indexes for table `servicos`
--
ALTER TABLE `servicos`
  ADD PRIMARY KEY (`servicosId`),
  ADD KEY `fornecedorId` (`fornecedorId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `clienteId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `fornecedorId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `pedido`
--
ALTER TABLE `pedido`
  MODIFY `pedidoId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `servicos`
--
ALTER TABLE `servicos`
  MODIFY `servicosId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`clientId`) REFERENCES `cliente` (`clienteId`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`fornecedorId`) REFERENCES `fornecedor` (`fornecedorId`),
  ADD CONSTRAINT `pedido_ibfk_3` FOREIGN KEY (`servicosId`) REFERENCES `servicos` (`servicosId`);

--
-- Constraints for table `servicos`
--
ALTER TABLE `servicos`
  ADD CONSTRAINT `servicos_ibfk_1` FOREIGN KEY (`fornecedorId`) REFERENCES `fornecedor` (`fornecedorId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
