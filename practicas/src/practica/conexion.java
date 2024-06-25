
package practica;

import java.sql.*;

public class conexion {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    public conexion(){
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productos", "root", "");
            System.out.println("Conectado a la base de datos");
        }catch(Exception e){
            System.out.println("Error en la conexion: "+ e.getMessage());
        }
    }
    public int Rproductos (String nombre,String categoria,String precio,String cantidad){
        int res =0;
        try {
            ps=cn.prepareStatement("INSERT INTO producto(nombre,categoria,precio,cantidad) VALUES (?,?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, categoria);
            ps.setString(3,precio);
            ps.setString(4,cantidad);
            res=ps.executeUpdate();
            System.out.println("El producto fue registrado correctamente");
        } catch (Exception e) {
            System.out.println("Hubo un error: "+e.getMessage());
        }
        return res;
    }
    public int ingresarTabla (String nombre,String categoria,String precio,String cantidad){
        int res =0;
        try {
            ps=cn.prepareStatement("SELECT * FROM producto where idProducto=?");
            ps.setString(1, nombre);
            ps.setString(2, categoria);
            ps.setString(3,precio);
            ps.setString(4,cantidad);
            res=ps.executeUpdate();
            System.out.println("El producto fue registrado correctamente");
        } catch (Exception e) {
            System.out.println("Hubo un error: "+e.getMessage());
        }
        return res;
    }
}
