
package cis;



import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Dinesh
 */
public class DatabaseConnection {
    static Connection connection(){
        Connection con;
        try{
           
            con =DriverManager.getConnection("jdbc:mysql://localhost/cisdb","root","");
   
            return con;
            
        }catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
            return null;
        }
    }
    
    
}
