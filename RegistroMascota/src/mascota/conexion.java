
package mascota;

import java.sql.*;
        
public class conexion {
    Connection cn;
    PreparedStatement ps;
    ResultSet sr;
    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("com.mysql.cj.jdbc.Driver", "root", "");
            System.out.println("Se conecto a la base de datos.");
        } catch (Exception e) {
            System.out.println("Error al conectar la base de datos"+e.getMessage());
        }
    }
    public int Fmascota(String nombre,String apellido,String historial){
        int res=0;
        try {
            ps=cn.prepareStatement("INSERT INTO login(nombre,apellido,historial)VALUES (?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, historial);
        } catch (Exception e) {
        }
    }
    
}
