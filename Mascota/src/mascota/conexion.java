
package mascota;

import java.sql.*;

public class conexion {
    Connection cn;
    PreparedStatement ps;
    ResultSet sr;
    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/formulario", "root", "");
            System.out.println("Se conecto a la base de datos.");
        } catch (Exception e) {
            System.out.println("Error al conectar la base de datos"+e.getMessage());
        }
    }
    public int Fmascota(String nombre,String apellido,String historial,String clave){
        int res=0;
        try {
            ps=cn.prepareStatement("INSERT INTO login(nombre,apellido,historial,clave)VALUES (?,?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, historial);
            ps.setString(4, clave);
            res=ps.executeUpdate();
            System.out.println("La mascota fue registrado correctamente");

        } catch (Exception e) {
            System.out.println("Hubo un error en el registro: " + e.getMessage());
        }
        return res;
    }   
}
