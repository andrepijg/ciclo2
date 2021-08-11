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
import model.vo.SumaProveedor;

public class SumaProveedorDao {

    public ArrayList<SumaProveedor> rankingSumaProveedor() throws SQLException {

        // Requerimiento 1 Reto 3 
        ArrayList<SumaProveedor> respuesta = new ArrayList<SumaProveedor>();

        // Declarar la conexión
        Connection conexion = null;

        // Intentar conectarnos y extraer la información de la base de datos para el requerimiento
        // Lógica -> Consulta SQL

        try{
            //Connectarse

            conexion = JDBCUtilities.getConnection();

            String consulta =   "SELECT SUM(Cantidad) AS 'Cantidad' "+
                                "FROM Compra "+
                                "WHERE Proveedor = 'Homecenter' ";

        // Construir objeto que realizará la consulta
        PreparedStatement statement = conexion.prepareStatement(consulta);

        // Realizar propiamente la consulta
        ResultSet resultSet = statement.executeQuery();

        // Recorrerlo mientras tenga posiciones o registros

        while(resultSet.next()){
            SumaProveedor sumaProveedor = new SumaProveedor();
            sumaProveedor.setCantidad(resultSet.getInt("Cantidad"));
            

            respuesta.add(sumaProveedor);
        }

        resultSet.close();
        statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando Suma Proveedor!!" +e);
            
        }finally{
            if(conexion != null){
                conexion.close();
            }

        }
        return respuesta;

    }  

}

