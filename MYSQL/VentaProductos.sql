-- ESTRUCTURA DE BASE DE DATOS--------------------------
-- -----------------------------------------------------
DROP DATABASE IF EXISTS VentaProductos;
CREATE DATABASE IF NOT EXISTS VentaProductos DEFAULT CHARACTER SET utf8 ;
USE VentaProductos;
-- -----------------------------------------------------
-- Table `VentaProductos`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Cliente(
  idCliente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  apellidos VARCHAR(45) NOT NULL,
  dirección VARCHAR(45) NOT NULL,
  dni CHAR(10)          NOT NULL UNIQUE,
  fechaNacimiento DATE  NOT NULL
)ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `VentaProductos`.`Provedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Provedor (
  idProvedor INT        NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(45)    NOT NULL,
  nif CHAR(10)          NOT NULL UNIQUE,
  dirección VARCHAR(45) NOT NULL
)ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `VentaProductos`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Producto (
  código INT                      NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(45)              NOT NULL,
  precio_unitario DECIMAL(13,2)   NOT NULL,
  idProvedor INT                  NOT NULL,
  CONSTRAINT fk_Producto_Provedor
    FOREIGN KEY (idProvedor) REFERENCES Provedor (idProvedor)
    ON DELETE CASCADE
    ON UPDATE CASCADE
)ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `VentaProductos`.`Producto_has_Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Producto_has_Cliente (
  código    INT                  NOT NULL,
  idCliente INT                  NOT NULL,
		    PRIMARY KEY (código, idCliente),
  CONSTRAINT fk_Producto_has_ClienteProducto1
    FOREIGN KEY (código)
    REFERENCES Producto (código)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Producto_has_ClienteProducto2
    FOREIGN KEY (idCliente)
    REFERENCES Cliente (idCliente)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)ENGINE = InnoDB;

-- ----------------
-- DATOS-----------
-- ----------------
INSERT INTO Provedor(nombre, nif, dirección) VALUES
('Amazon','05564298', 'Av. Ejercito 123'),  -- 1
('Dechatlon','05544292', 'Av. América 12'); -- 2
INSERT INTO Producto(nombre, precio_unitario, idProvedor) VALUES
('Cuaderno',1.5,1),    -- 1
('Bolígrafo',1.2,1),   -- 2
('Tinta',2.5,1),       -- 3
('Papel',0.9,1),       -- 4
('Zapatillas',10.9,2), -- 5
('Patines',15.9,2);    -- 6
INSERT INTO Cliente(nombre,apellidos,dirección,dni,fechaNacimiento) VALUES
('Gerson','Rabanal Alva','c/Seseña 2','05543298J','2000-01-13'),    -- 1
('Carlos','Andújar Pérez','c/Ocaña 3','05511198N','2005-04-10'),   -- 2
('Marta','González Álvarez','c/Montes 5','05522128R','2015-03-10'), -- 3
('Pablo','Martín Gómez','c/Guareña 12','15222328C','2015-03-10');     -- 4
INSERT INTO Producto_has_Cliente(código, idCliente) VALUES
(1,1),(1,3),(1,4),       -- Cuadero: Gerson, Marta, Pablo
(2,1),(2,2),(2,3),       -- Bolígrafo: Gerson, Carlos, Marta
(3,1),(3,3),(3,4),       -- Tinta: Gerson, Marta, Pablo
(4,1),(4,4),             -- Papel: Gerson, Pablo
(5,1),(5,2),(5,3),(5,4), -- Zapatillas: Gerson, Carlos, Marta, Pablo
(6,1);                   -- Patines: Gerson

-- ----------------
-- CONSULTAS--------
-- ----------------
-- MOSTRAR PRODUCTOS POR CADA PROVEDOR
SELECT pv.nombre, pr.nombre
FROM Provedor pv
JOIN Producto pr ON pv.idProvedor = pr.idProvedor 
ORDER BY pv.nombre;

-- --------------
-- MOSTRAR LA CANTIDAD DE PRODUCTOS DE CADA PROVEDOR
SELECT pv.nombre, COUNT(pr.nombre) AS Cantidad
FROM Provedor pv
JOIN Producto pr ON pv.idProvedor = pr.idProvedor 
GROUP BY pv.nombre
ORDER BY pv.nombre;

-- MOSTRAR TODOS LOS CLIENTES(HIJOS) QUE COMPRARON PRODUCTO(PADRE)CUADERNO
SELECT pr.nombre, c.nombre
FROM Producto pr 
JOIN Producto_has_Cliente pc ON pr.código = pc.código
JOIN Cliente c ON c.idCliente = pc.idCliente
ORDER BY pr.nombre;

