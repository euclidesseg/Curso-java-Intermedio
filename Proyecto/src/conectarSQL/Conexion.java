
package conectarSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexion {
    
   public  Connection getConnection(){
        String conexionUrl = "jdbc:sqlserver://LOCALHOST:1433;"
                + "database = BDGestion;" 
                + "user = sa;" 
                + "password = masterkey;" 
                + "loginTimeout = 30;";
        try{
            Connection cnx = DriverManager.getConnection(conexionUrl);
            return cnx;
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
            return null;
        } 
    }
}
