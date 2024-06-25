
package hotel;

import java.sql.*;

public class loginHotel {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;    
    
    public loginHotel() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelp", "root", "");
        } catch (Exception e) {
            System.out.println("Error al conectar la base de datos" + e.getMessage());
        }
    }

    public boolean verificarDatos(String correo, String clave) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM cliente WHERE correo=? AND clave=? ";
            ps = cn.prepareStatement(query);
            ps.setString(1, correo);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            return rs.next(); 
        } catch (SQLException  e) {
            System.out.println("Error al verificar los datos: " + e.getMessage());
            return false;
        } finally {
            cerrarConexiones(ps, rs);
        }
    }
        public boolean verificarCorreo(String correo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT COUNT(*) FROM cliente WHERE correo=?";
            ps = cn.prepareStatement(query);
            ps.setString(1, correo);
            rs = ps.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            return count > 0;
        } catch (SQLException  e) {
            System.out.println("Error al verificar el correo: " + e.getMessage());
            return false;
        } finally {
            cerrarConexiones(ps, rs);   
        }
    }
        public boolean restaurarContraseña(String correo, String contraseña) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE cliente SET clave=? WHERE correo=?";
                ps = cn.prepareStatement(query);
                ps.setString(1, contraseña);
                ps.setString(2, correo);
                int filasActualizadas = ps.executeUpdate();
                return filasActualizadas > 0;
            } catch (SQLException e) {
                System.out.println("Error al restaurar la contraseña: " + e.getMessage());
                return false;
            } finally {
                try {
                    if (ps != null) ps.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar el PreparedStatement: " + e.getMessage());
        }
    }
}
    private void cerrarConexiones(PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexiones: " + e.getMessage());
        }
    }
}