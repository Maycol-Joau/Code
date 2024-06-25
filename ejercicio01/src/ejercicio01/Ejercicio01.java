
package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
   static Scanner entrada=new Scanner(System.in);
    
    public static void main(String[] args){
        String nombre;
        String direccion;
        String correo;
        double peso;
        double talla;
        double presionArterial;
        int edad;
        
        System.out.println("Porfavor, ingrese los datos de la persona");
        
        System.out.println("Ingrese su nombre;");
        nombre=entrada.next();
        System.out.println("Ingrese su dirección: ");
        direccion = entrada.next();
        System.out.println("Ingrese su correo personal: ");
        correo = entrada.next();
        System.out.println("Ingrese su peso en kg: ");
        peso = entrada.nextDouble();
        System.out.println("Ingrese su talla en metros: ");
        talla = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese su presión arterial: ");
        presionArterial = entrada.nextDouble();

        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        System.out.println("Los datos de la persona son: su nombre "+nombre+", su direccion "+direccion+", su correo es "+correo+", su peso es "+peso+"kg, mide aproximadamente "+talla+"cm, su presion arterial es"+presionArterial+" y su edad actualmente es "+edad+" años.");

        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        if (Multiplo3y5(numero)) {
            System.out.println(numero + " es múltiplo de 3 y 5.");
        } else {
            System.out.println(numero + " no es múltiplo de 3 y 5.");
        }


    }

    public static boolean Multiplo3y5(int numero) {
        return numero % 3 == 0 && numero % 5 == 0;
    }    
    
    
}