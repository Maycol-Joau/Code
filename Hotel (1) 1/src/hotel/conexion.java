

package hotel;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class conexion {
    Connection cn;
    PreparedStatement ps;
    ResultSet sr;
    
    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelp", "root", "");
            System.out.println("Se conecto a la base de datos.");
        } catch (Exception e) {
            System.out.println("Error al conectar la base de datos"+e.getMessage());
        }
    }
    public int conexionHotel(String sucursal, String huesped, String habitacion, String entrada, String salida) {
        int res = 0;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date entradaDate = dateFormat.parse(entrada);
            Date salidaDate = dateFormat.parse(salida);

            ps = cn.prepareStatement("INSERT INTO reserva (sucursal, huesped, habitacion, entrada, salida) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, sucursal);
            ps.setString(2, huesped);
            ps.setString(3, habitacion);
            ps.setTimestamp(4, new Timestamp(entradaDate.getTime()));
            ps.setTimestamp(5, new Timestamp(salidaDate.getTime()));
            res = ps.executeUpdate();
            System.out.println("La reserva fue registrada correctamente");
        } catch (Exception e) {
            System.out.println("Hubo un error en el registro: " + e.getMessage());
        }
        return res;
    }
}