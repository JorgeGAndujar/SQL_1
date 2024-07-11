-- ---------------
-- --BASE DE DATOS
-- ---------------
DROP DATABASE IF EXISTS baseDatosUNOAUNO;
CREATE DATABASE IF NOT EXISTS baseDatosUNOAUNO DEFAULT CHARACTER SET utf8 ;
USE baseDatosUNOAUNO ;

-- -----------------------------------------------------
-- Table `baseDatosUNOAUNO`.`Empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Empleado (
  idEmpleado INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombre     VARCHAR(45) NOT NULL

)ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `baseDatosUNOAUNO`.`DocumentoIdentidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS DocumentoIdentidad(
  dni        VARCHAR(20) NOT NULL PRIMARY KEY,
  idEmpleado INT         NOT NULL,
  CONSTRAINT fk_DocumentoIdentidad_Empleado
    FOREIGN KEY (idEmpleado)
    REFERENCES Empleado (idEmpleado)
    ON DELETE CASCADE
    ON UPDATE CASCADE
)ENGINE = InnoDB;

-- ---------------
-- --DATOS--------
-- ---------------

INSERT INTO Empleado (nombre) VALUES
('Miguel'), -- 1
('Mihai'), -- 2
('Silvial'), -- 3
('Carlos'), -- 4
('Pablo'); -- 5

INSERT INTO DocumentoIdentidad (dni, idEmpleado) VALUES
('11111111A',1),
('99955544J',2),
('05821154N',3),
('05545821E',4),
('11222222A',5);

-- ---------------
-- --CONSULTAS----
-- ---------------

-- ELIMINAR UN PADRE (MIGUEL) Y POR LO TANTO MUERE EL HIJO 
SELECT * FROM Empleado;
SELECT * FROM DocumentoIdentidad;
DELETE FROM Empleado WHERE idEmpleado = 1;

-- ELIMINAR A UN PADRE PERO NO MUERE SU HIJO
-- 1 PASO :  MODIFICAR IDEMPLEADO A NULO DE NOT NULL
ALTER TABLE DocumentoIdentidad
MODIFY idEmpleado INT  NULL;
-- 2 PASO : ELIMINAR LA CLAVE FORANEA
ALTER TABLE DocumentoIdentidad
DROP FOREIGN KEY fk_DocumentoIdentidad_Empleado;
-- 3 PASO : CREAR LA CLAVE FORANEA CON LA NUEVA ESTRUCTURA
ALTER TABLE DocumentoIdentidad
ADD CONSTRAINT fk_DocumentoIdentidad_Empleado FOREIGN KEY (idEmpleado) REFERENCES Empleado(idEmpleado)
ON DELETE SET NULL; 
-- ELIMINAR EL PADRE MIGUEL
DELETE FROM Empleado WHERE idEmpleado = 1;
SELECT * FROM DocumentoIdentidad;


