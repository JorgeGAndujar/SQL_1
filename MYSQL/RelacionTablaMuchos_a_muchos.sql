-- ------------------------
-- ESTRUCTURA DE BASE DATOS
-- ------------------------
DROP DATABASE IF EXISTS MYDB;
CREATE DATABASE MYDB;
USE MYDB;
-- -----------------------------------------------------
-- Table `mydb`.`ALUMNO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS ALUMNO (
  idAlumno INT AUTO_INCREMENT,
  nombre   VARCHAR(45) NOT NULL,
		   PRIMARY KEY (idAlumno)
)ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `mydb`.`ASIGNATURA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS ASIGNATURA (
  idAsignatura  INT         AUTO_INCREMENT,
  descripción   VARCHAR(45) NOT NULL,
  creditos      INT         NOT NULL,
                PRIMARY KEY (idAsignatura)
)ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `mydb`.`ALUMNO_has_ASIGNATURA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS ALUMNO_has_ASIGNATURA (
  idAlumno 		INT NOT NULL,
  idAsignatura  INT NOT NULL,
			    PRIMARY KEY (idAlumno,idAsignatura),
				FOREIGN KEY (idAlumno) REFERENCES ALUMNO (idAlumno)
                ON DELETE NO ACTION
                ON UPDATE NO ACTION,
 
                FOREIGN KEY (idAsignatura) REFERENCES ASIGNATURA (idAsignatura)
				ON DELETE NO ACTION
				ON UPDATE NO ACTION
)ENGINE = InnoDB;
-- ------------------------
-- ESTRUCTURA DE DATOS
-- ------------------------

INSERT INTO ALUMNO (idAlumno, nombre) VALUES(NULL, 'Ismael'); -- 1
INSERT INTO ALUMNO (nombre)           VALUES('Luis'); -- 2
INSERT INTO ALUMNO (nombre)           VALUES
('Mihai'), -- 3
('Silvia'), -- 4
('Jorge'); -- 5

INSERT INTO ASIGNATURA (descripción, creditos) VALUES
('Matemáticas',5), -- 1
('Física',6), -- 2
('Lengua',5), -- 3
('Historia',6), -- 4
('Biología',5); -- 5

INSERT INTO ALUMNO_has_ASIGNATURA (idAlumno, idAsignatura) VALUES
(1,1),(1,3),(1,5),
(2,1),(2,2),(2,3),
(3,4),(3,5),
(4,1),(4,3),(4,4),
(5,3),(5,4),(5,5);



