SELECT  p.ID_Proyecto,
        p.Fecha_Inicio,
        p.Constructora,
        p.Ciudad,
        t.Financiable,
        t.Area_Max AS 'Area Máxima (m2)',
        p.ID_Tipo,
        p.ID_Lider,
        l.Nombre || ' ' || l.Primer_Apellido || ' ' ||  l.Segundo_Apellido AS 'Líder Proyecto'
FROM Proyecto p
INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider
INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo
WHERE p.ciudad = "Salento";

SELECT  l.ID_Lider, 
        l.Nombre, 
        l.Primer_Apellido, 
        l.Segundo_Apellido
FROM    LIDER l
WHERE   l.ID_Lider = 50;
