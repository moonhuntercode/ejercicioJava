package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

            try{ 
                
                // Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true","root" ,"admin");
                java.sql.Statement instruccion= conexion.createStatement();
                ResultSet sql=instruccion.executeQuery("SELECT actor_id,first_name,last_name,last_update FROM actor");
                // ResultSet resultados=instruccion.executeQuery(sql);
                while (sql.next()) {
                    System.out.println("Id Persona:"+resultados.getInt("actor_id"));
                }

            }
            // catch(ClassNotFoundException ex){
            // }
             catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        System.out.println( "Hello World!" );
        
    }
}
