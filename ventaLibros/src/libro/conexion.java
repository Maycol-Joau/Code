
package libro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class conexion {
    
    Connection cn;
    PreparedStatement ps;
    ResultSet sr;
    
    public conexion(){
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar la base de datos: " + e.getMessage());
        }
    }
    
    public boolean verificarDatos(String usuario, String clave) {
        try (PreparedStatement ps = cn.prepareStatement("SELECT * FROM usuario WHERE usuario=? AND clave=?")) {
            ps.setString(1, usuario);
            ps.setString(2, clave);
            sr = ps.executeQuery();
            return sr.next(); 
        } catch (SQLException e) {
            System.out.println("Error al verificar los datos: " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(ps, sr);
        }
    }
    public boolean ingresarTabla(String titulo, String autor) {
        try {
            ps = cn.prepareStatement("INSERT INTO libro (titulo, autor) VALUES (?,?)");
            ps.setString(1, titulo);
            ps.setString(2, autor);
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (Exception e) {
            System.out.println("Hubo un error al agregar un libro. " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(ps, null);
        }
    }
    private void cerrarRecursos(PreparedStatement ps, ResultSet sr) {
        try {
            if (ps != null) ps.close();
            if (sr != null) sr.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar recursos: " + e.getMessage());
        }
    }
}   