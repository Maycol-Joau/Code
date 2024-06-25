
package practica2;
import java.sql.*;

public class conexion {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos","root","");
            System.out.println("Conectado a la base de datos");
        } catch (Exception e) {
            System.out.println("Hubo un error en la conexion"+e.getMessage());
        }
    }
    public int registrar(int DNI, String nombre, String apellido, int telefono, String correo, String contraseña){
        int res=0;
        try {
            ps=cn.prepareStatement("INSERT INTO alumno(DNI, nombre, apellido, telefono, correo, contraseña) VALUES (?,?,?,?,?,?)");
            ps.setInt(1, DNI);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setInt(4, telefono);
            ps.setString(5, correo);
            ps.setString(6, contraseña);
            res=ps.executeUpdate();
            System.out.println("Alumno registrado correctamente");
        } catch (Exception e) {
            System.out.println("Hubo un error en el registro");
        }
        return res;
    }
    public SettGetter buscar(int DNI){
        SettGetter alumno=null;
        try {
            ps=cn.prepareStatement("SELECT DNI, nombre, apellido,telefono,correo,contraseña FROM alumno WHERE DNI=?");
            ps.setInt(1,DNI);
            rs=ps.executeQuery();
            if(rs.next()){
                alumno = new SettGetter();
                alumno.setDNI(rs.getInt("DNI"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setTelefono(rs.getInt("telefono"));
                alumno.setCorreo(rs.getString("correo"));
                alumno.setContraseña(rs.getString("contraseña"));
                System.out.println("Alumno encontrado con el DNI: "+ DNI);
            }
        } catch (Exception e) {
            System.out.println("Hubo un error al buscar");
        }
        return alumno;
    }
    public boolean modificar(int DNI, String nombre, String apellido, int telefono, String correo, String contraseña){
        boolean exito=false;
        try {
            ps=cn.prepareStatement("UPDATE alumno SET nombre=?,apellido=?,telefono=?,correo=?,contraseña=? WHERE DNI=?");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, telefono);
            ps.setString(4, correo);
            ps.setString(5, contraseña);
            ps.setInt(6, DNI);
            int filas= ps.executeUpdate();
            if(filas >0){
                System.out.println("El alumno se modifico correctamente");
                exito=true;
            }else{
                System.out.println("Hubo un error al modificar al alumno");
            }
        } catch (Exception e) {
            System.out.println("gubo un error"+ e.getMessage());
        }
        return exito;
    }
    public boolean eliminar(int DNI){
        boolean exito=false;
        try {
            ps=cn.prepareStatement("DELETE FROM alumno WHERE DNI=?");
            ps.setInt(1, DNI);
            int filas=ps.executeUpdate();
            if (filas>0){
                System.out.println("El alumno se elimino con exito");
                exito=true;
            }
        } catch (Exception e) {
            System.out.println("Hubo un error: "+e.getMessage());
        }
        return exito;
    }
    
}
    
