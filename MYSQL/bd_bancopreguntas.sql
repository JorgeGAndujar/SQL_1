-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bancopreguntas
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bancopreguntas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bancopreguntas` DEFAULT CHARACTER SET utf8 ;
USE `bancopreguntas` ;

-- -----------------------------------------------------
-- Table `bancopreguntas`.`Pregunta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancopreguntas`.`Pregunta` (
  `idPregunta` INT NOT NULL AUTO_INCREMENT,
  `pregunta` VARCHAR(300) NOT NULL,
  `respuesta` CHAR(1) NOT NULL,
  PRIMARY KEY (`idPregunta`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bancopreguntas`.`Opcion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancopreguntas`.`Opcion` (
  `id_opcion` INT NOT NULL AUTO_INCREMENT,
  `id_pregunta` INT NOT NULL,
  `opcion` VARCHAR(300) NOT NULL,
  `letra` CHAR(1) NOT NULL,
  PRIMARY KEY (`id_opcion`),
  INDEX `fk_Opcion_Pregunta_idx` (`id_pregunta` ASC) VISIBLE,
  CONSTRAINT `fk_Opcion_Pregunta`
    FOREIGN KEY (`id_pregunta`)
    REFERENCES `bancopreguntas`.`Pregunta` (`idPregunta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
