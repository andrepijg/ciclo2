package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Encapsulamiento de los datos
import model.vo.ProyectoCiudad;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

public class ProyectoCiudadDao {

    public ArrayList<ProyectoCiudad> rankingProyectosCiudad() throws SQLException {

        // Requerimiento 1 Reto 3 
        ArrayList<ProyectoCiudad> respuesta = new ArrayList<ProyectoCiudad>();

        // Declarar la conexión
        Connection conexion = null;

        // Intentar conectarnos y extraer la información de la base de datos para el requerimiento
        // Lógica -> Consulta SQL

        try{
            //Connectarse

            conexion = JDBCUtilities.getConnection();

            String consulta =   "SELECT  Constructora, " +
                                "Fecha_Inicio,  "+
                                "Clasificacion "+
                                "FROM Proyecto "+
                                "WHERE Ciudad = 'Pereira' ";

        // Construir objeto que realizará la consulta
        PreparedStatement statement = conexion.prepareStatement(consulta);

        // Realizar propiamente la consulta
        ResultSet resultSet = statement.executeQuery();

        // Recorrerlo mientras tenga posiciones o registros

        while(resultSet.next()){
            ProyectoCiudad proyectoCiudad = new ProyectoCiudad();
            proyectoCiudad.setConstructora(resultSet.getString("Constructora"));
            proyectoCiudad.setFechaInicio(resultSet.getString("Fecha_Inicio"));
            proyectoCiudad.setClasificacion(resultSet.getString("Clasificacion"));

            respuesta.add(proyectoCiudad);
        }

        resultSet.close();
        statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando Proyecto Ciudad!! " +e);
            
        }finally{
            if(conexion != null){
                conexion.close();
            }

        }
        return respuesta;

    }  

}

