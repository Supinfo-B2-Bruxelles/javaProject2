-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Sam 10 Mai 2014 à 10:13
-- Version du serveur: 5.6.12-log
-- Version de PHP: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `acme`
--
CREATE DATABASE IF NOT EXISTS `acme` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `acme`;

-- --------------------------------------------------------

--
-- Structure de la table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` text NOT NULL,
  `prenom` text NOT NULL,
  `mot_de_passe` text NOT NULL,
  `e_mail` text NOT NULL,
  `statut` int(11) NOT NULL COMMENT '0=>employé, 1=>manager',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `employee`
--

INSERT INTO `employee` (`id`, `nom`, `prenom`, `mot_de_passe`, `e_mail`, `statut`) VALUES
(1, 'de b', 'seb', 'seb', 'sebv@supinfo.com', 1),
(2, '', '', '', '@supinfo.com', 0),
(3, '', '', '', '@supinfo.com', 0),
(4, '', '', '', '@supinfo.com', 0),
(5, 'sebastien', '', 'seb', 'seb@supinfo.com', 0);

-- --------------------------------------------------------

--
-- Structure de la table `employee_project`
--

CREATE TABLE IF NOT EXISTS `employee_project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_employee` int(11) NOT NULL,
  `id_project` int(11) NOT NULL,
  `statut_employee` int(11) NOT NULL COMMENT '0=>employee, 1=>manager',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `employee_project`
--

INSERT INTO `employee_project` (`id`, `id_employee`, `id_project`, `statut_employee`) VALUES
(1, 5, 1, 0);

-- --------------------------------------------------------

--
-- Structure de la table `project`
--

CREATE TABLE IF NOT EXISTS `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` text NOT NULL,
  `date_debut` int(11) NOT NULL COMMENT 'time stamp java',
  `date_fin` int(11) NOT NULL COMMENT 'time stamp java',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `project`
--

INSERT INTO `project` (`id`, `nom`, `date_debut`, `date_fin`) VALUES
(1, 'truc', 0, 0);

-- --------------------------------------------------------

--
-- Structure de la table `tache`
--

CREATE TABLE IF NOT EXISTS `tache` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` text NOT NULL,
  `date_debut` int(11) NOT NULL COMMENT 'time stamp java',
  `date_fin` int(11) NOT NULL COMMENT 'time stamp java',
  `autheur` text NOT NULL,
  `description` text NOT NULL,
  `statut` int(11) NOT NULL COMMENT '0=>incomplet, 1=>complet',
  `id_projet` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
