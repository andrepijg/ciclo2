-- Consultas básicas

SELECT * FROM Lider; --Seleccionamos todas las filas y colunnas
SELECT  Nombre,
        Ciudad_Residencia,
        Cargo
FROM Lider; -- Selección de algunas columnas y todas las filas


-- Ciertas columnas, ciertas filas -->
-- Nombre y ciudad_residencia de los gerentes

SELECT  Nombre,
        Ciudad_Residencia,
        Cargo
FROM Lider
WHERE Cargo = "Gerente" AND (Ciudad_Residencia = "Barranquilla" OR Ciudad_Residencia = "Bucaramanga"); 

SELECT Nombre, cargo, salario * 0.10 AS Impuesto FROM Lider
WHERE Cargo = "Asesor"
ORDER BY Nombre asc
LIMIT 10;

-- Generar el nombre completo -->Concatenación

SELECT Nombre||' ' ||Primer_Apellido||' '|| Segundo_Apellido as Nombre_Completo,
Salario
FROM Lider;
