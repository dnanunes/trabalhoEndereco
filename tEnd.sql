-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 05-Out-2016 às 00:06
-- Versão do servidor: 5.7.15-0ubuntu0.16.04.1
-- PHP Version: 7.0.8-0ubuntu0.16.04.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tEnd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `bairro`
--

CREATE TABLE `bairro` (
  `id` double NOT NULL,
  `nome` text NOT NULL,
  `cidade_id` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `bairro`
--

INSERT INTO `bairro` (`id`, `nome`, `cidade_id`) VALUES
(1, 'Novo Horizonte', 1),
(2, 'Residencial Canada', 1),
(3, 'Centro', 3),
(4, 'Nuria', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cidade`
--

CREATE TABLE `cidade` (
  `id` double NOT NULL,
  `nome` text NOT NULL,
  `estado_id` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cidade`
--

INSERT INTO `cidade` (`id`, `nome`, `estado_id`) VALUES
(1, 'Acreuna', 1),
(2, 'Rio Verde', 2),
(3, 'Santa Helena', 3),
(4, 'Pito', 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

CREATE TABLE `endereco` (
  `id` double NOT NULL,
  `observacao` text NOT NULL,
  `cep` text NOT NULL,
  `logradouro_id` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`id`, `observacao`, `cep`, `logradouro_id`) VALUES
(1, 'Nao tem', '76978-000', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `estado`
--

CREATE TABLE `estado` (
  `id` double NOT NULL,
  `nome` text NOT NULL,
  `pais_id` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `estado`
--

INSERT INTO `estado` (`id`, `nome`, `pais_id`) VALUES
(1, 'Goiás', 1),
(2, 'Sao Paulo', 1),
(3, 'Ceara', 2),
(4, 'Maranhão', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `logradouro`
--

CREATE TABLE `logradouro` (
  `id` double NOT NULL,
  `nome` text NOT NULL,
  `tipo` text NOT NULL,
  `bairro_id` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `logradouro`
--

INSERT INTO `logradouro` (`id`, `nome`, `tipo`, `bairro_id`) VALUES
(1, 'Rio Turvo', 'Viela', 2),
(2, 'Pastor Alcimar Borges', 'Avenida', 2),
(3, 'M 10', 'Rua', 4),
(4, 'Sao Paulo', 'Rua', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pais`
--

CREATE TABLE `pais` (
  `id` double NOT NULL,
  `nome` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pais`
--

INSERT INTO `pais` (`id`, `nome`) VALUES
(1, 'Brasil'),
(2, 'EUA');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bairro`
--
ALTER TABLE `bairro`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cidade`
--
ALTER TABLE `cidade`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `logradouro`
--
ALTER TABLE `logradouro`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pais`
--
ALTER TABLE `pais`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bairro`
--
ALTER TABLE `bairro`
  MODIFY `id` double NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `cidade`
--
ALTER TABLE `cidade`
  MODIFY `id` double NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `endereco`
--
ALTER TABLE `endereco`
  MODIFY `id` double NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `estado`
--
ALTER TABLE `estado`
  MODIFY `id` double NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `logradouro`
--
ALTER TABLE `logradouro`
  MODIFY `id` double NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `pais`
--
ALTER TABLE `pais`
  MODIFY `id` double NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
