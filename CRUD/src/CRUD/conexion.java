
package CRUD;

import java.sql.*;
public class conexion {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    public conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("JDBC:MYSQL://LOCALHOST:3306/login", "root", "");
            System.out.println("Conectado BD");
        } catch (Exception e) {
            System.out.println("Error en conectar con la BD");
        }
    }        
        public int Rusuario(String nombre, String usuario, String clave, String correo){
    int res=0;
    try {
        ps=cn.prepareStatement("INSERT INTO usuario (nombre, usuario, clave, correo) VALUES (?, ?, ?, ?)");
        ps.setString(1, nombre);
        ps.setString(2, usuario);
        ps.setString(3, clave);
        ps.setString(4, correo);
        res=ps.executeUpdate();
        System.out.println("El usuario fue registrado correctamente");
    } catch (Exception e) {
        System.out.println("Error en el registro: " + e.getMessage());
    }
    return res;
    }
}

