
package hotel;

import java.sql.*;

public class registroHotel {
    Connection cn;
    PreparedStatement ps;
    ResultSet sr;
    public registroHotel(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelp", "root", "");
            System.out.println("Se conecto a la base de datos.");
        } catch (Exception e) {
            System.out.println("Error al conectar la base de datos"+e.getMessage());
        }
    }
    public int RCliente(String nombre,String apellido,String telefono,String correo,String clave){
        int res = 0;
        try {
        ps = cn.prepareStatement("INSERT INTO cliente(nombre,apellido,telefono,correo,clave) VALUES (?,?,?,?,?)");
        ps.setString(1, nombre);
        ps.setString(2, apellido);
        ps.setString(3, telefono);
        ps.setString(4, correo);
        ps.setString(5, clave);
        res = ps.executeUpdate();
            System.out.println("El usuario fue registrado correctamente");
        } catch (Exception e) {
            System.out.println("Hubo un error en el registro: " + e.getMessage());
        }
        return res;
    }
}
