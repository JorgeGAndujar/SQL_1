-- MySQL Workbench Forward Engineering

-- -----------------------------------------------------
-- Schema BD_CadenaAgencias
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema BD_CadenaAgencias
-- -----------------------------------------------------
DROP DATABASE IF EXISTS BD_CadenaAgencias;
CREATE SCHEMA IF NOT EXISTS BD_CadenaAgencias DEFAULT CHARACTER SET utf8 ;
USE BD_CadenaAgencias ;

-- -----------------------------------------------------
-- Table `BD_CadenaAgencias`.`sucursal`
-- -----------------------------------------------------
DROP TABLE IF EXISTS sucursal;
CREATE TABLE IF NOT EXISTS sucursal (
  codigoSucursal INT NOT NULL PRIMARY KEY,
  direccion      VARCHAR(45) NOT NULL,
  telefono       INT NOT NULL
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BD_CadenaAgencias`.`hotel`
-- -----------------------------------------------------
DROP TABLE IF EXISTS hotel;
CREATE TABLE IF NOT EXISTS hotel (
  codigoHotel      INT NOT NULL PRIMARY KEY,
  nombre           VARCHAR(45) NOT NULL,
  direccion        VARCHAR(45) NOT NULL,
  ciudad           VARCHAR(45) NOT NULL,
  telefono         INT NOT NULL,
  numerosPlazas    INT NOT NULL
  )ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BD_CadenaAgencias`.`vuelosRegulares`
-- -----------------------------------------------------
DROP TABLE IF EXISTS vuelosRegulares;
CREATE TABLE IF NOT EXISTS vuelosRegulares (
  numeroVuelo        INT NOT NULL PRIMARY KEY,
  fecha              DATE NOT NULL,
  hora               TIME NOT NULL,
  origen             VARCHAR(45) NOT NULL,
  destino            VARCHAR(45) NOT NULL,
  plazasTotales      INT NOT NULL,
  plazasClaseTurista INT NOT NULL
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BD_CadenaAgencias`.`turista`
-- -----------------------------------------------------
DROP TABLE IF EXISTS turista;
CREATE TABLE IF NOT EXISTS turista (
  codigoTurista  INT NOT NULL PRIMARY KEY,
  nombre        VARCHAR(45) NOT NULL,
  apellidos     VARCHAR(45) NOT NULL,
  direccion     VARCHAR(45) NOT NULL,
  telefono      INT NOT NULL
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BD_CadenaAgencias`.`sucursal_has_turista`
-- -----------------------------------------------------
DROP TABLE IF EXISTS sucursal_has_turista;
CREATE TABLE IF NOT EXISTS sucursal_has_turista (
  sucursal_codigoSucursal INT NOT NULL,
  turista_codigoTurista   INT NOT NULL,
  PRIMARY KEY (sucursal_codigoSucursal, turista_codigoTurista),
  CONSTRAINT fk_sucursal_has_turista_sucursal
    FOREIGN KEY (sucursal_codigoSucursal)
    REFERENCES sucursal (codigoSucursal)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_sucursal_has_turista_turista1
    FOREIGN KEY (turista_codigoTurista)
    REFERENCES turista (codigoTurista)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BD_CadenaAgencias`.`turista_has_vuelosRegulares`
-- -----------------------------------------------------
DROP TABLE IF EXISTS turista_has_vuelosRegulares;
CREATE TABLE IF NOT EXISTS turista_has_vuelosRegulares (
   codigoTurista   INT NOT NULL,
   numeroVuelo     INT NOT NULL,
   plazasTurista   INT NOT NULL,
   plazasPrimera   INT NOT NULL,
  PRIMARY KEY (codigoTurista, numeroVuelo),
  CONSTRAINT fk_turista_has_vuelosRegulares_turista1
    FOREIGN KEY (codigoTurista)
    REFERENCES turista (codigoTurista)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_turista_has_vuelosRegulares_vuelosRegulares1
    FOREIGN KEY (numeroVuelo)
    REFERENCES vuelosRegulares(numeroVuelo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BD_CadenaAgencias`.`turista_has_hotel`
-- -----------------------------------------------------
DROP TABLE IF EXISTS turista_has_hotel;
CREATE TABLE IF NOT EXISTS turista_has_hotel (
  turista_codigoTurista INT NOT NULL,
  hotel_codigoHotel     INT NOT NULL,
  mediaPension          TINYINT NOT NULL,
  pensionCompleta       TINYINT NOT NULL,
  PRIMARY KEY (turista_codigoTurista, hotel_codigoHotel),
  CONSTRAINT fk_turista_has_hotel_turista1
    FOREIGN KEY (turista_codigoTurista)
    REFERENCES turista (codigoTurista)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_turista_has_hotel_hotel1
    FOREIGN KEY (hotel_codigoHotel)
    REFERENCES hotel (codigoHotel)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)ENGINE = InnoDB;

-- Inserts para la tabla sucursal
INSERT INTO sucursal (codigoSucursal, direccion, telefono) VALUES (1, 'Calle Principal 123', 555123456);
INSERT INTO sucursal (codigoSucursal, direccion, telefono) VALUES (2, 'Avenida Secundaria 45', 555234567);
INSERT INTO sucursal (codigoSucursal, direccion, telefono) VALUES (3, 'Boulevard Central 678', 555345678);
INSERT INTO sucursal (codigoSucursal, direccion, telefono) VALUES (4, 'Calle Nueva 890', 555456789);
INSERT INTO sucursal (codigoSucursal, direccion, telefono) VALUES (5, 'Avenida Libertad 101', 555567890);
INSERT INTO sucursal (codigoSucursal, direccion, telefono) VALUES (6, 'Calle Esperanza 234', 555678901);
INSERT INTO sucursal (codigoSucursal, direccion, telefono) VALUES (7, 'Avenida Paz 345', 555789012);
INSERT INTO sucursal (codigoSucursal, direccion, telefono) VALUES (8, 'Calle Unión 456', 555890123);
INSERT INTO sucursal (codigoSucursal, direccion, telefono) VALUES (9, 'Avenida Progreso 567', 555901234);
INSERT INTO sucursal (codigoSucursal, direccion, telefono) VALUES (10, 'Calle Futuro 678', 555012345);

-- Inserts para la tabla hotel
INSERT INTO hotel (codigoHotel, nombre, direccion, ciudad, telefono, numerosPlazas) VALUES (1, 'Hotel Sol', 'Calle Mar 12', 'Barcelona', 931123456, 100);
INSERT INTO hotel (codigoHotel, nombre, direccion, ciudad, telefono, numerosPlazas) VALUES (2, 'Hotel Luna', 'Avenida Cielo 45', 'Madrid', 912234567, 150);
INSERT INTO hotel (codigoHotel, nombre, direccion, ciudad, telefono, numerosPlazas) VALUES (3, 'Hotel Estrella', 'Calle Estrella 56', 'Sevilla', 954345678, 200);
INSERT INTO hotel (codigoHotel, nombre, direccion, ciudad, telefono, numerosPlazas) VALUES (4, 'Hotel Maravilla', 'Boulevard Arena 78', 'Valencia', 963456789, 120);
INSERT INTO hotel (codigoHotel, nombre, direccion, ciudad, telefono, numerosPlazas) VALUES (5, 'Hotel Paraíso', 'Calle Sol 90', 'Malaga', 952567890, 180);
INSERT INTO hotel (codigoHotel, nombre, direccion, ciudad, telefono, numerosPlazas) VALUES (6, 'Hotel Montaña', 'Calle Roca 12', 'Granada', 958678901, 110);
INSERT INTO hotel (codigoHotel, nombre, direccion, ciudad, telefono, numerosPlazas) VALUES (7, 'Hotel Marítimo', 'Avenida Océano 34', 'Bilbao', 944789012, 130);
INSERT INTO hotel (codigoHotel, nombre, direccion, ciudad, telefono, numerosPlazas) VALUES (8, 'Hotel Imperial', 'Boulevard Sol 56', 'Zaragoza', 976890123, 160);
INSERT INTO hotel (codigoHotel, nombre, direccion, ciudad, telefono, numerosPlazas) VALUES (9, 'Hotel Brisa', 'Calle Nieve 78', 'Santander', 942901234, 140);
INSERT INTO hotel (codigoHotel, nombre, direccion, ciudad, telefono, numerosPlazas) VALUES (10, 'Hotel Nevado', 'Avenida Montaña 90', 'Pamplona', 948012345, 170);

-- Inserts para la tabla vuelosRegulares
INSERT INTO vuelosRegulares (numeroVuelo, fecha, hora, origen, destino, plazasTotales, plazasClaseTurista) VALUES (101, '2024-10-20', '12:00:00', 'Madrid', 'Barcelona', 150, 120);
INSERT INTO vuelosRegulares (numeroVuelo, fecha, hora, origen, destino, plazasTotales, plazasClaseTurista) VALUES (102, '2024-11-15', '16:30:00', 'Valencia', 'Sevilla', 180, 140);
INSERT INTO vuelosRegulares (numeroVuelo, fecha, hora, origen, destino, plazasTotales, plazasClaseTurista) VALUES (103, '2024-12-05', '10:15:00', 'Malaga', 'Bilbao', 200, 160);
INSERT INTO vuelosRegulares (numeroVuelo, fecha, hora, origen, destino, plazasTotales, plazasClaseTurista) VALUES (104, '2024-10-25', '14:45:00', 'Zaragoza', 'Madrid', 170, 130);
INSERT INTO vuelosRegulares (numeroVuelo, fecha, hora, origen, destino, plazasTotales, plazasClaseTurista) VALUES (105, '2024-11-01', '18:00:00', 'Granada', 'Barcelona', 160, 120);
INSERT INTO vuelosRegulares (numeroVuelo, fecha, hora, origen, destino, plazasTotales, plazasClaseTurista) VALUES (106, '2024-12-10', '08:30:00', 'Santander', 'Sevilla', 140, 110);
INSERT INTO vuelosRegulares (numeroVuelo, fecha, hora, origen, destino, plazasTotales, plazasClaseTurista) VALUES (107, '2024-10-22', '19:00:00', 'Pamplona', 'Valencia', 130, 100);
INSERT INTO vuelosRegulares (numeroVuelo, fecha, hora, origen, destino, plazasTotales, plazasClaseTurista) VALUES (108, '2024-11-17', '21:15:00', 'Madrid', 'Granada', 190, 150);
INSERT INTO vuelosRegulares (numeroVuelo, fecha, hora, origen, destino, plazasTotales, plazasClaseTurista) VALUES (109, '2024-10-27', '09:00:00', 'Bilbao', 'Santander', 180, 140);
INSERT INTO vuelosRegulares (numeroVuelo, fecha, hora, origen, destino, plazasTotales, plazasClaseTurista) VALUES (110, '2024-12-12', '13:30:00', 'Barcelona', 'Zaragoza', 170, 130);

-- Inserts para la tabla turista
INSERT INTO turista (codigoTurista, nombre, apellidos, direccion, telefono) VALUES (1, 'Juan', 'Pérez', 'Calle Olmo 12', 600123456);
INSERT INTO turista (codigoTurista, nombre, apellidos, direccion, telefono) VALUES (2, 'Ana', 'López', 'Avenida Roble 34', 600234567);
INSERT INTO turista (codigoTurista, nombre, apellidos, direccion, telefono) VALUES (3, 'Luis', 'Martínez', 'Calle Abeto 56', 600345678);
INSERT INTO turista (codigoTurista, nombre, apellidos, direccion, telefono) VALUES (4, 'María', 'González', 'Boulevard Pino 78', 600456789);
INSERT INTO turista (codigoTurista, nombre, apellidos, direccion, telefono) VALUES (5, 'Carlos', 'García', 'Calle Sauce 90', 600567890);
INSERT INTO turista (codigoTurista, nombre, apellidos, direccion, telefono) VALUES (6, 'Marta', 'Sánchez', 'Avenida Álamo 12', 600678901);
INSERT INTO turista (codigoTurista, nombre, apellidos, direccion, telefono) VALUES (7, 'Sofía', 'Ramírez', 'Calle Ciprés 34', 600789012);
INSERT INTO turista (codigoTurista, nombre, apellidos, direccion, telefono) VALUES (8, 'Pedro', 'Hernández', 'Avenida Encina 56', 600890123);
INSERT INTO turista (codigoTurista, nombre, apellidos, direccion, telefono) VALUES (9, 'Laura', 'Jiménez', 'Calle Laurel 78', 600901234);
INSERT INTO turista (codigoTurista, nombre, apellidos, direccion, telefono) VALUES (10, 'Diego', 'Fernández', 'Avenida Cedro 90', 600012345);

-- Inserts para la tabla sucursal_has_turista
INSERT INTO sucursal_has_turista (sucursal_codigoSucursal, turista_codigoTurista) VALUES (1, 1);
INSERT INTO sucursal_has_turista (sucursal_codigoSucursal, turista_codigoTurista) VALUES (1, 2);
INSERT INTO sucursal_has_turista (sucursal_codigoSucursal, turista_codigoTurista) VALUES (2, 3);
INSERT INTO sucursal_has_turista (sucursal_codigoSucursal, turista_codigoTurista) VALUES (2, 4);
INSERT INTO sucursal_has_turista (sucursal_codigoSucursal, turista_codigoTurista) VALUES (3, 5);
INSERT INTO sucursal_has_turista (sucursal_codigoSucursal, turista_codigoTurista) VALUES (3, 6);
INSERT INTO sucursal_has_turista (sucursal_codigoSucursal, turista_codigoTurista) VALUES (4, 7);
INSERT INTO sucursal_has_turista (sucursal_codigoSucursal, turista_codigoTurista) VALUES (4, 8);

-- Insert para la tabla turista_has_vuelosRegulares
INSERT INTO turista_has_vuelosRegulares (codigoTurista, numeroVuelo, plazasTurista, plazasPrimera) VALUES
(1, 101, 2, 1),
(2, 102, 1, 0),
(3, 103, 3, 1),
(4, 104, 2, 0),
(5, 105, 1, 1),
(6, 106, 4, 2),
(7, 101, 2, 1),
(8, 102, 3, 0),
(9, 103, 1, 1),
(10, 104, 2, 0);
-- Insert para la tabla turista_has_hotel
INSERT INTO turista_has_hotel (turista_codigoTurista, hotel_codigoHotel, mediaPension, pensionCompleta) VALUES
(1, 1, 1, 0),  -- Turista 1 se aloja en Hotel 1 con media pensión
(2, 2, 0, 1),  -- Turista 2 se aloja en Hotel 2 con pensión completa
(3, 1, 1, 0),  -- Turista 3 se aloja en Hotel 1 con media pensión
(4, 3, 0, 1),  -- Turista 4 se aloja en Hotel 3 con pensión completa
(5, 2, 1, 0),  -- Turista 5 se aloja en Hotel 2 con media pensión
(6, 1, 0, 1),  -- Turista 6 se aloja en Hotel 1 con pensión completa
(7, 3, 1, 0),  -- Turista 7 se aloja en Hotel 3 con media pensión
(8, 2, 0, 1),  -- Turista 8 se aloja en Hotel 2 con pensión completa
(9, 1, 1, 0),  -- Turista 9 se aloja en Hotel 1 con media pensión
(10, 3, 0, 1); -- Turista 10 se aloja en Hotel 3 con pensión completa

-- CONSULTAS
-- 1.Consulta de sucursales y los turistas que atendieron
-- Esta consulta muestra las direcciones de las sucursales y los nombres de los turistas que fueron atendidos en cada sucursal.
SELECT s.direccion AS direccionSucursal, t.nombre, t.apellidos
FROM sucursal s
JOIN sucursal_has_turista st ON s.codigoSucursal = st.sucursal_codigoSucursal
JOIN turista t ON st.turista_codigoTurista = t.codigoTurista;
-- 2.Consulta de turistas y los vuelos que tomaron
SELECT t.nombre, t.apellidos, v.numeroVuelo
FROM turista t
JOIN turista_has_vuelosRegulares tv ON t.codigoTurista = tv.codigoTurista
JOIN vuelosRegulares v ON tv.numeroVuelo = v.numeroVuelo;
-- 3.Consulta cuantos turistas se alojan en cada hotel
SELECT h.nombre AS nombreHotel, COUNT(th.turista_codigoTurista) AS cantidadTuristas
FROM hotel h
JOIN turista_has_hotel th ON h.codigoHotel = th.hotel_codigoHotel
GROUP BY h.nombre;





