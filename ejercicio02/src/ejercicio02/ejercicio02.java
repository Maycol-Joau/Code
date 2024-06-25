
package ejercicio02;

import java.util.Scanner;

public class ejercicio02 {
    private String nombreCompleto;
    private String telefono;
    private String correoPersonal;
    private String correoInstitucional;
    private int edad;

    public ejercicio02(String nombreCompleto, String telefono, String correoPersonal, String correoInstitucional, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correoPersonal = correoPersonal;
        this.correoInstitucional = correoInstitucional;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre completo: " + nombreCompleto + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Correo personal: " + correoPersonal + "\n" +
               "Correo institucional: " + correoInstitucional + "\n" +
               "Edad: " + edad;
    }
}

