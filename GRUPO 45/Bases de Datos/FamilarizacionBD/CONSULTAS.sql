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

-- Requerimientos sobre Reto3 Grupo 45 --> Conceptos de consultas SQL

-- Genererar los correos electrónicos de los líderes de los proyectos con el siguiente formato y arrojarlos ordenados por tamaño de forma descendente:
--3) Nombrar la columna resultante como e-mail
--1) La primera letra del nombre en minúscula
--2) Un punto
--3) Primer apellido
--4) Colocar ID_Lider
--5) Dominio @empresa.com


-- Extraer un pedazo del nombre

SELECT  LOWER (SUBSTR(Lider.Nombre, 1, 1)) as Inicial,
        Lider.Nombre
FROM    Lider;

SELECT  LOWER   (SUBSTR(Lider.Nombre, 1, 1))
                ||"."||Lider.Primer_Apellido || ID_Lider 
                || "@empresa.com.co" AS email_lider,
Lider.Nombre,
Lider.Primer_Apellido,
Lider.ID_Lider
FROM    Lider
ORDER BY LENGTH (email_lider) DESC;

-- Variante sacando porción final del apellido

SELECT  LOWER(SUBSTR(Lider.Nombre, 1, 1)) || "." ||
        SUBSTR(Lider.Primer_Apellido, LENGTH(Lider.Primer_Apellido)-2, 3)        
        || Lider.ID_Lider
        || "@empresa.com.co" AS email_lider,
        Lider.Nombre,
        Lider.Primer_Apellido,
        Lider.ID_Lider
FROM Lider
ORDER BY LENGTH(email_lider) DESC;

-- RQ: Edad promedio de los líderes, redondeada.

-- Calcular edades de los líderes

SELECT DATETIME ('now') - Lider.Fecha_Nacimiento as Edad_Lider,
Lider.Nombre, 
Lider.Fecha_Nacimiento
FROM Lider;

-- Edad promedio

SELECT ROUND(AVG(DATETIME('now') - Lider.Fecha_Nacimiento)) as Promedo_Edad_Líderes,
FROM Lider;

-- SUM --> SUMA
-- AVG --> PROMEDIO
-- COUNT --> COUNT
-- MAX --> MAXIMO
-- MIN --> MINIMO

-- JOIN --> Ampliar entidades -> contrario a Normalizar.

SELECT * FROM Proyecto p
JOIN Tipo t ON
p.ID_Tipo = t.ID_Tipo
LIMIT 10;

SELECT 
        p.ID_Proyecto,
        p.Constructora, 
        p.Banco_Vinculado,
        t.Area_Max,
        t.Estrato,
        t.Financiable
FROM Proyecto p
JOIN Tipo t ON
p.ID_Tipo = t.ID_Tipo;

--Area promedio de los proyectos que respalda cada banco
-- Agrupamiento y agregación sobre el resultado de un JOIN.
-- Ranking de los bancos según el área promedio de mayor a menor

SELECT  p.Banco_Vinculado,
        AVG(t.Area_Max) as Area_Promedio_Proyectos,
        COUNT(*) as Numero_Proyectos        
FROM Proyecto p 
JOIN Tipo t ON
p.ID_Tipo = t.ID_Tipo
GROUP BY p.Banco_Vinculado
ORDER BY Numero_Proyectos DESC, Area_Promedio_Proyectos DESC;

-- Anidación

SELECT  Banco_Vinculado,
        Area_Promedio_Proyectos,
        Numero_Proyectos,
        ROUND (Area_Promedio_Proyectos / Numero_Proyectos) as Indicador,
FROM (  
        SELECT  p.Banco_Vinculado,
        AVG(t.Area_Max) as Area_Promedio_Proyectos,
        COUNT(*) as Numero_Proyectos        
        FROM Proyecto p 
        JOIN Tipo t ON
        p.ID_Tipo = t.ID_Tipo
        GROUP BY p.Banco_Vinculado
        ORDER BY Numero_Proyectos DESC, Area_Promedio_Proyectos DESC
);
        
