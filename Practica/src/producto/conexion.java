
package producto;

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
        } catch (Exception e) {
            System.out.println("Hubo un error en la conexion: "+e.getMessage());
        }
    }
    public int Rproducto(int idClave, String nombre, String categoria,double precio, int cantidad){
        int res=0;
        try {
            ps=cn.prepareStatement("INSERT INTO producto(idClave,nombre,categoria,precio,cantidad) VALUES (?,?,?,?,?)");
            ps.setInt(1, idClave);
            ps.setString(2, nombre);
            ps.setString(3, categoria);
            ps.setDouble(4, precio);
            ps.setInt(5, cantidad);
            res=ps.executeUpdate();
            System.out.println("Producto registrado correctamente");
        } catch (Exception e) {
            System.out.println("Hubo un error en el registro");
        }
        return res;
    }
    public boolean modificar(int idClave, String nombre, String categoria,double precio, int cantidad){
        boolean exito = false;
        try {
            ps=cn.prepareStatement("UPDATE producto SET nombre=?,categoria=?,precio=?,cantidad=? WHERE idClave=?");
            ps.setString(1, nombre);
            ps.setString(2, categoria);
            ps.setDouble(3, precio);
            ps.setInt(4, cantidad);
            ps.setInt(5, idClave);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Producto modificado correctamente");
                exito = true;
            } 
        } catch (Exception e) {
        System.out.println("Hubo un error en la modificación del producto: " + e.getMessage());
     }
        return exito;
    }
        public boolean eliminar(int idClave){
        boolean exito = false;
        try {
            ps=cn.prepareStatement("DELETE  FROM producto WHERE idClave=?");
            ps.setInt(1, idClave);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Producto eliminado correctamente");
                exito = true;
            } 
        } catch (Exception e) {
        System.out.println("Hubo un error en la eliminacion del producto: " + e.getMessage());
     }
        return exito;
    }
    public SettGetter buscar(int idClave) {
        SettGetter producto = null;
        try {
            ps = cn.prepareStatement("SELECT idClave, nombre, categoria, precio, cantidad FROM producto WHERE idClave = ?");
            ps.setInt(1, idClave);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto = new SettGetter();
                producto.setIdClave(rs.getInt("idClave"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidad(rs.getInt("cantidad"));
                System.out.println("Producto encontrado con el ID: " + idClave);
            }
        } catch (Exception e) {
            System.out.println("Hubo un error en la búsqueda del producto: " + e.getMessage());
        }
        return producto;
    }
}