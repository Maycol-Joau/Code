
package entrada.de.datos;

import java.util.Scanner;

public class EntradaDeDatos {

static Scanner entrada= new Scanner(System.in);

    public static void main(String[] args) {
        
        /*int lado;
            System.out.println("Ingrese el numero del lado:");
                    lado=entrada.nextInt();
            System.out.println("El area del cuadrado es:"+ lado*lado);*/
        
        
        
        //operaciones
        /*
         double num1;
            System.out.println("Ingrese el primer numero");
                    num1=entrada.nextDouble();
         double num2;
            System.out.println("Ingrese el segundo numero");
                    num2=entrada.nextDouble();
        // Mostrar la suma
        System.out.println("La suma es:" + (num1 + num2));
        // mostrar la resta
        System.out.println("La resta es:" + (num1 - num2));
        // Mostrar la muntiplicacion
        System.out.println("La multiplicacion es:"+ (num1 * num2));
        // Mostrar la division
        System.out.println("La division es:"+ (num1 / num2));
        */
        
        
        //Calcular el Area de un cuadrado
        int lado1;
        System.out.println("Ingrese el primer lado");
                lado1=entrada.nextInt();
        int lado2;
        System.out.println("Ingrese el segundo lado");
                lado2=entrada.nextInt();
        int area;
        int perimetro;
        area = lado1*lado2;
        perimetro = lado1*4;
        System.out.println("El area de un cuadrado es: "+area+"\nEl perimetro de un cuadrado es: "+perimetro);

    }
    
}
