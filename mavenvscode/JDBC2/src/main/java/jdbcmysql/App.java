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
                Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root" ,"admin");
                java.sql.Statement instruccion= conexion.createStatement();
                ResultSet sqle=instruccion.executeQuery("SELECT * FROM actor");
                // ResultSet resultados=instruccion.executeQuery(sql);
                while (sqle.next()) {
                    System.out.println("--------");
                    System.out.println("Id Persona:"+sqle.getInt("actor_id"));
                    System.out.println("--------");
                   
                }
                instruccion.close();
                conexion.close();

            }
            // catch(ClassNotFoundException ex){
            // }
             catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace(System.out);
            }
        // System.out.println( "Hello World!" );
        
    }
}
