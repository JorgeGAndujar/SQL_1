-- MOSTRAR LA CANTIDAD DE ALUMNOS EN CADA GRUPO

-- WHERE
SELECT * from Alumno where grupo = 'dam';
Select count(idAlumno) AS DAM FROM Alumno Where grupo = 'dam';
Select count(idAlumno) AS DAW FROM Alumno Where grupo = 'daw';

-- AGRUPAMIENTO (GROUP BY)

SELECT GRUPO, COUNT(idAlumno) AS CANTIDAD
FROM ALUMNO
GROUP BY GRUPO;

-- (2) MOSTRAR LA CANTIDAD DE ALUMNOS POR CADA FECHA DISTINTA
SELECT fechaNacimiento, COUNT(idAlumno) AS CANTIDAD
FROM ALUMNO
GROUP BY fechaNacimiento;

-- (3) MOSTRAR LA CANTIDAD DE ALUMNOS POR MES
SELECT month(fechaNacimiento) as MES, COUNT(idAlumno) AS CANTIDAD
FROM ALUMNO
GROUP BY month(fechaNacimiento);

SELECT NombreMes(month(fechaNacimiento)) as MES, COUNT(idAlumno) AS CANTIDAD
FROM ALUMNO
GROUP BY month(fechaNacimiento);

-- MOSRAR QUE GRUPOS TENGO

SELECT distinct grupo FROM Alumno;
