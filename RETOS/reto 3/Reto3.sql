-- REQUERIMIENTOS

-- Obtener el nombre de la constructora, la fecha de inicio y la clasificación para la ciudad de “Pereira”.

SELECT  Constructora,
        Fecha_Inicio,
        Clasificacion
FROM Proyecto
WHERE Ciudad = "Pereira";


-- Obtener el proveedor, la cantidad y el valor pagado de la tabla Compra, el nombre del material de construcción sea igual a “Vidrio” y se encuentre pago.

SELECT  c.Proveedor,
        c.Cantidad,
        c.Pagado,
        mc.Nombre_Material
FROM    Compra c 
JOIN    MaterialConstruccion mc ON
        c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion
WHERE mc.Nombre_Material = "Vidrio" AND c.Pagado = "Si";

-- Sumar las cantidades de la tabla Compra que se le han comprado al proveedor “Homecenter”.

SELECT SUM(c.Cantidad)
FROM Compra c
WHERE Proveedor = "Homecenter";

-- Mostrar de la tabla Líder el nombre, el primer apellido y segundo apellido en una sola columna separado por espacios en blanco, utilice el alias "Nombre Líder" de los que tengan como ciudad de residencia "Londres”.

SELECT Nombre || ' ' || Primer_Apellido ||' '||Segundo_Apellido AS "Nombre Líder"
FROM Lider
WHERE Ciudad_Residencia = "Londres";


-- Obtener de la tabla Proyecto, cuántas habitaciones (Asigne el alias "Habitaciones") ha construido cada constructora, el nombre de la constructora y adicionalmente de esas habitaciones construidas cuántas están por encima de 80.

SELECT COUNT(Numero_Habitaciones) as Habitaciones,
        Constructora
FROM Proyecto
GROUP BY Constructora
HAVING Habitaciones >= 80;