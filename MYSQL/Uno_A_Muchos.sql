-- ---------------------------
-- ESTRUCTURA DE BASE DE DATOS 
-- ---------------------------
DROP DATABASE IF EXISTS MYDB;
CREATE DATABASE IF NOT EXISTS MYDB DEFAULT CHARACTER SET utf8;
USE mydb ;

-- -----------------------------------------------------
-- Table `mydb`.`Departamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Departamento (
  idDepartamento     INT         PRIMARY KEY NOT NULL AUTO_INCREMENT,
  descripción        VARCHAR(45) NOT NULL
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Empleado (
  idEmpleado         INT         PRIMARY KEY NOT NULL AUTO_INCREMENT,
  nombre             VARCHAR(45) NOT NULL,
  teléfono           VARCHAR(45) NOT NULL UNIQUE,
  idDepartamento     INT NOT NULL,
CONSTRAINT fk_Departamento_empleado
    FOREIGN KEY (idDepartamento)
    REFERENCES Departamento (idDepartamento)
    ON DELETE CASCADE
    ON UPDATE CASCADE
)ENGINE = InnoDB;

-- ---------------------------
-- DATOS 
-- ---------------------------
INSERT INTO Departamento (descripción) VALUES
('Administración'), -- 1
('Profesores'), -- 2
('Secretaría'); -- 3

INSERT INTO Empleado (nombre,teléfono,idDepartamento) VALUES
('Jairo','666555444',2), -- 1
('Arsuaga','666511144',2), -- 2
('Josefa','662221144',2), -- 3
('María','654456789',3), -- 4
('Pablo','666234144',1), -- 5
('Reichel','663331144',1), -- 6
('Rocio','663332244',1); -- 7



-- CONSULTAS 
-- ----------
-- MOSTRAR LOS EMPLEADOS POR DEPARTAMENTO
-- PADRE: DEPARTAMENTO
-- HIJOS: EMPLEADO

SELECT d.descripción, e.nombre
FROM Departamento d
JOIN empleado e ON d.idDepartamento = e.idDepartamento
ORDER BY d.descripción;

-- MOSTRAR LA CANTIDAD DE EMPLEADOS POR DEPARTAMENTO
-- PADRE: DEPARTAMENTO
-- HIJOS: EMPLEADO

SELECT d.descripción, COUNT(e.nombre)
FROM Departamento d
JOIN empleado e ON d.idDepartamento = e.idDepartamento
GROUP BY d.descripción
ORDER BY d.descripción;

-- 2 FORMA ASCENDENTE(ASC)

SELECT d.descripción, COUNT(e.nombre) AS CANTIDAD
FROM Departamento d
JOIN empleado e ON d.idDepartamento = e.idDepartamento
GROUP BY d.descripción
ORDER BY CANTIDAD ASC;

-- MOSTRAR LOS EMPLEADOS DEL DEPARTAMENTO PROFESORES
-- PADRE: DEPARTAMENTO
-- HIJOS: EMPLEADO

SELECT d.descripción, COUNT(e.nombre) AS CANTIDAD
FROM Departamento d
JOIN empleado e ON d.idDepartamento = e.idDepartamento
WHERE d.idDepartamento = 2;

-- MOSTRAR EN QUE DEPARTAMENTO TRABAJA JOSEFA
-- PADRE: DEPARTAMENTO
-- HIJOS: EMPLEADO

SELECT d.descripción
FROM Departamento d
WHERE d.idDepartamento = (SELECT d.idDepartamento
FROM Departamento d
JOIN Empleado e ON d.idDepartamento = e.idDepartamento
WHERE e.nombre = 'Josefa');

-- MOSTRAR EL DEPARTAMENTO QUE TIENE MÁS EMPLEADOS Y SI HAY MÁS DE UNO ...
-- PADRE: DEPARTAMENTO
-- HIJOS: EMPLEADO

SELECT d.descripción, COUNT(e.nombre) AS CANTIDAD
FROM Departamento d
JOIN empleado e ON d.idDepartamento = e.idDepartamento
GROUP BY d.descripción
HAVING COUNT(e.nombre) = (
    SELECT MAX(CANTIDAD)
    FROM (
        SELECT COUNT(e.nombre) AS CANTIDAD
        FROM Departamento d
        JOIN empleado e ON d.idDepartamento = e.idDepartamento
        GROUP BY d.descripción
    ) AS Subconsulta
);

-- ELIMINAR A UN PADRE PERO NO MUERE SU HIJO
-- 1 PASO :  MODIFICAR IDEMPLEADO A NULO DE NOT NULL
ALTER TABLE Empleado
MODIFY idDepartamento INT  NULL;
-- 2 PASO : ELIMINAR LA CLAVE FORANEA
ALTER TABLE Empleado
DROP FOREIGN KEY fk_Departamento_empleado;
-- 3 PASO : CREAR LA CLAVE FORANEA CON LA NUEVA ESTRUCTURA
ALTER TABLE Empleado
ADD CONSTRAINT fk_Departamento_empleado FOREIGN KEY (idDepartamento) REFERENCES Departamento(idDepartamento)
ON DELETE SET NULL; 
-- ELIMINAR EL PADRE MIGUEL
DELETE FROM Departamento WHERE idDepartamento = 1;
SELECT * FROM Departamento;
SELECT * FROM empleado;