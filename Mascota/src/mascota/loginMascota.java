
package mascota;

import java.sql.*;

public class loginMascota {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;    
    
    public loginMascota() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/formulario", "root", "");
        } catch (Exception e) {
            System.out.println("Error al conectar la base de datos" + e.getMessage());
        }
    }

    public boolean verificarDatos(String nombre, String apellido, String clave) {
        try {
            String query = "SELECT * FROM login WHERE correo=? AND apellido=? AND clave=?";
            ps = cn.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, clave);
            rs = ps.executeQuery();
            return rs.next(); 
        } catch (Exception e) {
            System.out.println("Error al verificar los datos: " + e.getMessage());
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexiones: " + e.getMessage());
            }
        }
    }
}
