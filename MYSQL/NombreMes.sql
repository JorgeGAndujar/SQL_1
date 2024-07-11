DELIMITER $$

CREATE FUNCTION NombreMes(num_mes INT)
RETURNS VARCHAR(15)
DETERMINISTIC
BEGIN
    DECLARE nombre VARCHAR(15);

    SET nombre = CASE
        WHEN num_mes = 1 THEN 'Enero'
        WHEN num_mes = 2 THEN 'Febrero'
        WHEN num_mes = 3 THEN 'Marzo'
        WHEN num_mes = 4 THEN 'Abril'
        WHEN num_mes = 5 THEN 'Mayo'
        WHEN num_mes = 6 THEN 'Junio'
        WHEN num_mes = 7 THEN 'Julio'
        WHEN num_mes = 8 THEN 'Agosto'
        WHEN num_mes = 9 THEN 'Septiembre'
        WHEN num_mes = 10 THEN 'Octubre'
        WHEN num_mes = 11 THEN 'Noviembre'
        WHEN num_mes = 12 THEN 'Diciembre'
        ELSE 'Mes Inválido'
    END;

    RETURN nombre;
END$$

DELIMITER ;