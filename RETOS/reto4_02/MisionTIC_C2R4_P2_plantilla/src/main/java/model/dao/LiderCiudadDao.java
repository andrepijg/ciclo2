package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.LiderCiudad;

public class LiderCiudadDao {

    public ArrayList<LiderCiudad> rankingLiderCiudad() throws SQLException {

           // Requerimiento 1 Reto 3 
            ArrayList<LiderCiudad> respuesta = new ArrayList<LiderCiudad>();
    
            // Declarar la conexión
            Connection conexion = null;
    
            // Intentar conectarnos y extraer la información de la base de datos para el requerimiento
            // Lógica -> Consulta SQL
    
            try{
                //Connectarse
    
                conexion = JDBCUtilities.getConnection();
    
                String consulta =   "SELECT Nombre  || ' ' || Primer_Apellido ||' '||Segundo_Apellido AS 'Nombre Lider' " +
                                    "FROM Lider " +
                                    "WHERE Ciudad_Residencia = 'Londres' ";
    
            // Construir objeto que realizará la consulta
            PreparedStatement statement = conexion.prepareStatement(consulta);
    
            // Realizar propiamente la consulta
            ResultSet resultSet = statement.executeQuery();
    
            // Recorrerlo mientras tenga posiciones o registros
    
            while(resultSet.next()){
                LiderCiudad liderCiudad = new LiderCiudad();
                // liderCiudad.setNombre(resultSet.getString("Nombre"));
                // liderCiudad.setPrimerApellido(resultSet.getString("Primer_Apellido"));
                // liderCiudad.setSegundoApellido(resultSet.getString("Segundo_Apellido"));
                liderCiudad.setNombreLider(resultSet.getString("Nombre Lider"));
    
                respuesta.add(liderCiudad);
            }
    
            resultSet.close();
            statement.close();
    
            }catch(SQLException e){
                System.err.println("Error consultando Líder Ciudad!!" +e);
                
            }finally{
                if(conexion != null){
                    conexion.close();
                }
    
            }
            return respuesta;
    
        }  

        

    }

