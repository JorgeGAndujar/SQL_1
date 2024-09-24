-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Trabajador
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Trabajador
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Trabajador` DEFAULT CHARACTER SET utf8 ;
USE `Trabajador` ;

-- -----------------------------------------------------
-- Table `Trabajador`.`Trabajador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Trabajador`.`Trabajador` (
  `id_trabajador` VARCHAR(5) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_trabajador`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Trabajador`.`Directivo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Trabajador`.`Directivo` (
  `id_trabajador` VARCHAR(5) NOT NULL,
  `meta` INT NOT NULL,
  `dieta` INT NULL,
  `base` INT NOT NULL,
  INDEX `fk_Directivo_Trabajador1_idx` (`id_trabajador` ASC) VISIBLE,
  CONSTRAINT `fk_Directivo_Trabajador1`
    FOREIGN KEY (`id_trabajador`)
    REFERENCES `Trabajador`.`Trabajador` (`id_trabajador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Trabajador`.`Secretaria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Trabajador`.`Secretaria` (
  `id_secretaria` VARCHAR(5) NOT NULL,
  `horas_trabajadas` INT NOT NULL,
  `incentivo` INT NOT NULL,
  INDEX `fk_Secretaria_Trabajador1_idx` (`id_secretaria` ASC) VISIBLE,
  CONSTRAINT `fk_Secretaria_Trabajador1`
    FOREIGN KEY (`id_secretaria`)
    REFERENCES `Trabajador`.`Trabajador` (`id_trabajador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Trabajador`.`Conserje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Trabajador`.`Conserje` (
  `id_trabajador` VARCHAR(5) NOT NULL,
  `horas_trabajas` INT NOT NULL,
  INDEX `fk_Conserje_Trabajador1_idx` (`id_trabajador` ASC) VISIBLE)
ENGINE = CSV;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
