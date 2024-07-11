DROP DATABASE IF EXISTS BDREGISTRO;
CREATE DATABASE IF NOT EXISTS BDREGISTRO;
USE BDREGISTRO;
CREATE TABLE IF NOT EXISTS mascotas(
 idMascotas INT PRIMARY KEY auto_increment,
 Descripcion VARCHAR(20) NOT NULL
);
INSERT INTO mascotas VALUES
(NULL,'Gato'),
(NULL,'Perro'),
(NULL,'Lince'),
(NULL,'Hamster'),
(NULL,'Loro'),
(NULL,'Tortuga');

INSERT INTO mascotas (idMascotas, descripcion) VALUES (NULL, 'Oso');
INSERT INTO mascotas (idMascotas, descripcion) VALUES (NULL, 'Hipopótamo');

CREATE TABLE IF NOT EXISTS pais(
	idPais VARCHAR(3) PRIMARY KEY,
    descripcion VARCHAR(20)
);
INSERT INTO pais VALUES
('ES','España'),
('RO','Rumania'),
('CO','Colombia'),
('MX','Mexico'),
('UK','Inglaterra');

CREATE TABLE IF NOT EXISTS pasatiempos(
 idPasatiempo INT PRIMARY KEY auto_increment,
 descripcion VARCHAR(20) NOT NULL
);
INSERT INTO pasatiempos VALUES
(NULL,'Ajedrez'),
(NULL,'Escalada'),
(NULL,'Futbol'),
(NULL,'Baloncesto'),
(NULL,'Hockey');


CREATE TABLE IF NOT EXISTS cliente (
	idCliente INT primary key auto_increment,
    nombreApellido VARCHAR(20),
    mascota JSON,
    pais char(2),
    pasatiempos JSON,
    correo VARCHAR(100),
    sexo char(1),
    telefono char(9),
    fechaHora datetime,
    clave VARCHAR(20),
    autorizacion BOOLEAN
    
    
);
SELECT * FROM cliente;

