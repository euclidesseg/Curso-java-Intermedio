
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    public Connection getConexion(){
     
        //String cadenaconection = "jdbc:sqlserver://"+server+":"+puerto+";"+"database ="+baseDatos+";"+"user ="+usuario+";"+"password ="+contrasenia+"loginTimeout = 30;";
        String conexionURL = "jdbc:sqlserver://LOCALHOST:1433;"
                + "database = master;" // base de datos a la que nos vamos a conectar
                + "user =  sa;"
                + "password = masterkey;" // contraseña de nuestro servidor 
                + "loginTimeout = 30;";  // indica cuanto tiempo va a tardar en procesar la informacion 
                
        /* cuando vamos a trabajar con conexion a bases de datos se debe hacer mediante sentencia try catch*/
        try {
            Connection cnx = DriverManager.getConnection(conexionURL);
            return cnx;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"error en la conexion");
            return null;
        }
       
    }
}
