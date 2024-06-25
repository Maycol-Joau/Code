
package ejercicio02;

import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.println("Ingrese su número de teléfono: ");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese su correo personal: ");
        String correoPersonal = scanner.nextLine();

        System.out.println("Ingrese su correo institucional: ");
        String correoInstitucional = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        ejercicio02 usuario = new ejercicio02(nombreCompleto, telefono, correoPersonal, correoInstitucional, edad);
        System.out.println("Ingrese el nombre de su mascota: ");
        String nombreMascota = scanner.nextLine();
        System.out.println("Ingrese la raza de su mascota: ");
        String razaMascota = scanner.nextLine();
        System.out.println("Datos del usuario:\n" + usuario);
        System.out.println("Nombre de la mascota: " + nombreMascota);
        System.out.println("Raza de la mascota: " + razaMascota);
        System.out.println("Ingrese un número para obtener la suma de los primeros números naturales positivos: ");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        // Mostrar resultados
        System.out.println("La suma de los primeros " + n + " números naturales positivos es: " + suma);


    }    
    
}
