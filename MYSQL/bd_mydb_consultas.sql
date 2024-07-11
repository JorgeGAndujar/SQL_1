-- MOSTRAR LAS ASIGNATURAS DE LUIS (2)
-- PADRE ALUMNO      Luis
-- HIJO  ASIGNATURA  Matemáticas Física Lengua
SELECT a.nombre, asi.descripción
FROM alumno a
JOIN alumno_has_asignatura ag ON a.idAlumno = ag.idAlumno
JOIN asignatura asi ON asi.idAsignatura = ag.idAsignatura
WHERE a.idAlumno = 2;

-- MOSTRAR LOS ALUMNOS MATRICULADOS EN LENGUA (3)
-- PADRE ASIGNATURA     LENGUA
-- HIJO  ALUMNOS        Ismael Luis Silvia Jorge

SELECT asi.descripción, a.nombre
FROM alumno a
JOIN alumno_has_asignatura ag ON a.idAlumno = ag.idAlumno
JOIN asignatura asi ON asi.idAsignatura = ag.idAsignatura
WHERE asi.idAsignatura = 3;

-- MOSTRAR TODOS LOS ALUMNOS MATRICULADOS POR ASIGNATURA
-- PADRE ASIGNATURA     
-- HIJO  ALUMNOS        

SELECT asi.descripción, a.nombre
FROM alumno a
JOIN alumno_has_asignatura ag ON a.idAlumno = ag.idAlumno
JOIN asignatura asi ON asi.idAsignatura = ag.idAsignatura
ORDER BY descripción;