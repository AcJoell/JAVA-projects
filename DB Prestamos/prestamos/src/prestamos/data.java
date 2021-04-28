
package prestamos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class data {

    public String db = "prestamos";
    public String url = "jdbc:mysql://localhost:3306/"+db+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public String user = "root";
    public String pass = "acjoell019";
    Connection conect = null;
    
    public Connection conectando(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conect = DriverManager.getConnection(this.url, this.user, this.pass);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos...\n"+e);
        }
        return conect;
    }
    
    public void mensaje(){
        if(this.conectando() != null)
            JOptionPane.showMessageDialog(null,"Conexion exitosa.");
        else
            JOptionPane.showMessageDialog(null,"Conexion fallida.");
    }
    
}