
package registro;

import java.sql.*;
;

public class conexion {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnobd", "root", "");
                System.out.println("Se conecto correctamanete a la base de Datos.");
        } catch (Exception e) {
            System.out.println("Hubo un error al momento de conectar la base de datos."+e.getMessage());
        }
    }
        public int Ralumno(String nombre, String edad, String curso, String numAula){
            int res=0;
            try {
                ps=cn.prepareStatement("INSERT INTO alumno (nombre, edad, curso, numAula) VALUES (?, ?, ?, ?)");
                ps.setString(1, nombre);
                ps.setString(2, edad);
                ps.setString(3, curso);
                ps.setString(4, numAula);
                res=ps.executeUpdate();
                    System.out.println("El Alumno fue registrado correctamente");
            } catch (Exception e) {
                System.out.println("Error en el registro"+e.getMessage());
            }
            return res;
        }
    }
    

