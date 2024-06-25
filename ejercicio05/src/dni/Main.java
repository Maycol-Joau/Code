
package dni;
import java.util.Scanner;

public class Main {
       static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        dni Dni1 = new dni();

        System.out.println("DNI sin número establecido:");
        Dni1.mostrarDNI();
        System.out.println("Ingrese el número de DNI para el primer objeto:");
        long numeroDNI1 = entrada.nextLong();
        Dni1.setNumeroDNI(numeroDNI1);

        System.out.println("DNI con número establecido:");
        Dni1.mostrarDNI();

        System.out.println("Ingrese el número de DNI para el segundo objeto:");
        long numeroDNI2 = entrada.nextLong();
        dni dni2 = new dni(numeroDNI2);

        System.out.println("DNI del segundo objeto:");
        dni2.mostrarDNI();
    }
}