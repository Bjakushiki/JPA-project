-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2020. Dec 20. 11:21
-- Kiszolgáló verziója: 10.4.6-MariaDB
-- PHP verzió: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `borbolya_vh`
--

DELIMITER $$
--
-- Eljárások
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_apartman` (IN `apartmannev_in` VARCHAR(30), IN `1fo_in` INT, IN `2fo_in` INT, IN `3fo_in` INT, IN `4fo_in` INT, IN `tobbfo_in` INT, IN `potagyar_in` INT)  NO SQL
INSERT INTO `apartman` (`apartman`.`ApartmanNev`, `apartman`.`fo1`, `apartman`.`fo2`, `apartman`.`fo3`, `apartman`.`fo4`, `apartman`.`TobbFo`, `apartman`.`PotagyAr`) VALUE (apartmannev_in, 1fo_in, 2fo_in, 3fo_in, 4fo_in, tobbfo_in, potagyar_in)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `create_foglalas` (IN `apartmanid_in` INT, IN `nev_in` VARCHAR(45), IN `email_in` VARCHAR(254), IN `telefon_in` VARCHAR(13), IN `erkezes_in` DATE, IN `tavozas_in` DATE, IN `felnott_in` INT, IN `gyerek1_in` INT, IN `gyerek2_in` INT, IN `kisallat_in` INT, IN `potagyszam_in` INT, IN `vegosszeg_in` INT, IN `fizetesimod_in` VARCHAR(20))  NO SQL
INSERT INTO `foglalas` (`foglalas`.`ApartmanID`, `foglalas`.`Nev`, `foglalas`.`E-mail`, `foglalas`.`Telefon`, `foglalas`.`Erkezes`, `foglalas`.`Tavozas`, `foglalas`.`FelnottSzam`, `foglalas`.`Gyerek1Szam`, `foglalas`.`Gyerek2Szam`, `foglalas`.`KisallatSzam`, `foglalas`.`PotagySzam`, `foglalas`.`Vegosszeg`, `foglalas`.`Fizetesimod`) VALUE (apartmanid_in, nev_in, email_in, telefon_in, erkezes_in, tavozas_in, felnott_in, gyerek1_in, gyerek2_in, kisallat_in, potagyszam_in, vegosszeg_in, fizetesimod_in)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `create_velemeny` (IN `nev_in` VARCHAR(45), IN `apartmanid_in` INT, IN `email_in` VARCHAR(254), IN `ertekeles_in` DOUBLE(3,2), IN `tetszett_in` VARCHAR(500), IN `nemtetszett_in` VARCHAR(500), IN `megjegyzes_in` VARCHAR(1000))  NO SQL
INSERT INTO `velemeny` (`velemeny`.`Nev`, `velemeny`.`E-mail`, `velemeny`.`Ertekeles`, `velemeny`.`Tetszett`, `velemeny`.`NemTetszett`, `velemeny`.`Megjegyzes`, `velemeny`.`ApartmanID`) VALUE (nev_in, email_in, ertekeles_in, tetszett_in, nemtetszett_in, megjegyzes_in, apartmanid_in)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `get_all_foglalas` ()  NO SQL
SELECT * FROM `foglalas` ORDER BY `foglalas`.`ID` ASC$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `get_all_velemeny` ()  NO SQL
SELECT * FROM `velemeny` ORDER BY `velemeny`.`ApartmanID` ASC$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `read_apartman` (IN `id_in` INT)  NO SQL
SELECT * FROM `apartman` WHERE `apartman`.`ID` = id_in$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `read_foglalas` (IN `id_in` INT)  NO SQL
SELECT * FROM `foglalas` WHERE `foglalas`.`ID` = id_in$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `read_velemeny` (IN `id_in` INT)  NO SQL
SELECT * FROM `velemeny` WHERE `velemeny`.`ID` = id_in$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `apartman`
--

CREATE TABLE `apartman` (
  `ID` int(11) NOT NULL,
  `ApartmanNev` varchar(30) NOT NULL,
  `fo1` int(11) NOT NULL,
  `fo2` int(11) NOT NULL,
  `fo3` int(11) NOT NULL,
  `fo4` int(11) NOT NULL,
  `TobbFo` int(11) NOT NULL,
  `PotagyAr` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `apartman`
--

INSERT INTO `apartman` (`ID`, `ApartmanNev`, `fo1`, `fo2`, `fo3`, `fo4`, `TobbFo`, `PotagyAr`) VALUES
(1, 'Borbolya Vendégház', 6500, 6500, 5000, 4000, 4000, 3500),
(2, 'Kétszemélyes apartman', 5000, 4000, 0, 0, 0, 0),
(3, 'Négyszemélyes apartman', 5000, 5000, 4500, 4000, 4000, 3000);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `foglalas`
--

CREATE TABLE `foglalas` (
  `ID` int(11) NOT NULL,
  `ApartmanID` int(11) NOT NULL,
  `Nev` varchar(45) NOT NULL,
  `E-mail` varchar(254) NOT NULL,
  `Telefon` varchar(13) NOT NULL,
  `Erkezes` date NOT NULL,
  `Tavozas` date NOT NULL,
  `FelnottSzam` int(11) NOT NULL,
  `Gyerek1Szam` int(11) NOT NULL,
  `Gyerek2Szam` int(11) NOT NULL,
  `KisallatSzam` int(11) NOT NULL,
  `PotagySzam` int(11) NOT NULL,
  `Vegosszeg` int(11) NOT NULL,
  `Fizetesimod` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `foglalas`
--

INSERT INTO `foglalas` (`ID`, `ApartmanID`, `Nev`, `E-mail`, `Telefon`, `Erkezes`, `Tavozas`, `FelnottSzam`, `Gyerek1Szam`, `Gyerek2Szam`, `KisallatSzam`, `PotagySzam`, `Vegosszeg`, `Fizetesimod`) VALUES
(47, 1, 'Gipsz Jakab', 'gipszjakab@gmail.com', '06307894536', '2020-12-20', '2020-12-23', 1, 0, 0, 0, 0, 19500, 'keszpenz'),
(48, 2, 'Gipsz Jolán ', 'gipszjolan@gmail.com', '06308976541', '2020-12-20', '2020-12-25', 1, 0, 1, 0, 0, 35000, 'erzsebetutalvany'),
(49, 3, 'Gipsz Jakab', 'GipszJ@gamil.com', '06304561236', '2020-12-21', '2020-12-31', 2, 0, 1, 0, 0, 111330, 'atutalas');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `velemeny`
--

CREATE TABLE `velemeny` (
  `ID` int(11) NOT NULL,
  `ApartmanID` int(11) NOT NULL,
  `Nev` varchar(45) NOT NULL,
  `E-mail` varchar(254) NOT NULL,
  `Ertekeles` double NOT NULL,
  `Tetszett` varchar(500) NOT NULL,
  `NemTetszett` varchar(500) NOT NULL,
  `Megjegyzes` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `velemeny`
--

INSERT INTO `velemeny` (`ID`, `ApartmanID`, `Nev`, `E-mail`, `Ertekeles`, `Tetszett`, `NemTetszett`, `Megjegyzes`) VALUES
(31, 1, 'Gipsz Jakab', 'gipsz@gmail.com', 4, 'Gyors \nOlcsó', 'Kissé zajos', 'Minden megfelelő volt!'),
(32, 2, 'Gipsz Jolán', 'gipszjolan@gmail.com', 3, 'Két személyes', 'Kicsi', 'Az ár megfelelő'),
(36, 3, 'Gipsz család', 'gipsz@gmail.com', 5, 'Tiszta\nCsendes\n', '', 'Minden tökéletes volt!');

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `apartman`
--
ALTER TABLE `apartman`
  ADD PRIMARY KEY (`ID`);

--
-- A tábla indexei `foglalas`
--
ALTER TABLE `foglalas`
  ADD PRIMARY KEY (`ID`);

--
-- A tábla indexei `velemeny`
--
ALTER TABLE `velemeny`
  ADD PRIMARY KEY (`ID`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `apartman`
--
ALTER TABLE `apartman`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT a táblához `foglalas`
--
ALTER TABLE `foglalas`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT a táblához `velemeny`
--
ALTER TABLE `velemeny`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
