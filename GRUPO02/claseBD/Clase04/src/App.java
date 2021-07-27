import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        // crear la conexión 
        
        Connection connection;
        
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:hr.db");
            if(connection != null){
                System.out.println("Conexión exitosa");
            }

            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.


            // aca puedo reemplazar al objeto rs por consultaEmp

            ResultSet rs = statement.executeQuery("select * from employees");
            while(rs.next())
            {
                // read the result set
                System.out.println("employee_id = " +rs.getInt("employee_id"));
                System.out.println("apellido = " + rs.getString("last_name"));
                System.out.println("nombre = " + rs.getString("first_name"));
            }

            //------------------------------------------
            statement.executeUpdate("drop table if exists persona");
            statement.executeUpdate("create table persona (cedula integer, nombre string)");
            statement.executeUpdate("insert into persona values(1, 'Jhon')");
            statement.executeUpdate("insert into persona values(2, 'Patricia')");
            
            PreparedStatement ps = connection.prepareStatement("insert into persona values(?, ?)");
            ps.setInt(1, 3);
            ps.setString(2, "Pedro");
            ps.executeUpdate();


            // coloco el objeto consulta por que estoy seleccionando a persona, la anterior rs se refiere es a employeed, son dos tablas diferentes. tener cuidado con esto.

            ResultSet consultaPersona = statement.executeQuery("SELECT * FROM persona");
            while(consultaPersona.next()) // Estoy guardando 
            
            {
                // read the result set
                System.out.print("Cédula = " + consultaPersona.getInt("cedula"));
                System.out.println(", Nombre = " + consultaPersona.getString("nombre"));
                
            }

        } catch (Exception e) {
            //TODO: handle exception
            System.err.println(e.getClass().getName()+ ":"+e.getMessage());
            System.out.println("Error en la conexión");
        }
    }
}
