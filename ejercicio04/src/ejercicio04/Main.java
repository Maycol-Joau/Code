
package ejercicio04;


public class Main {


    public static void main(String[] args) {
         racional racional1 = new racional();
        racional1.leer();
        racional racional2 = new racional();
        racional2.leer();

        System.out.println("Número racional 1:");
        racional1.print();
        System.out.println("Número racional 2:");
        racional2.print();

        System.out.println("Suma:");
        racional suma = racional1.suma(racional2);
        suma.print();

        System.out.println("Resta:");
        racional resta = racional1.resta(racional2);
        resta.print();

        System.out.println("Multiplicación:");
        racional multiplicacion = racional1.multiplicacion(racional2);
        multiplicacion.print();

        System.out.println("División:");
        racional division = racional1.division(racional2);
        division.print();

        System.out.println("Comparación:");
        int comparacion = racional1.comparar(racional2);
        if (comparacion < 0) {
            System.out.println("El número racional 1 es menor que el número racional 2.");
        } else if (comparacion > 0) {
            System.out.println("El número racional 1 es mayor que el número racional 2.");
        } else {
            System.out.println("Los números racionales son iguales.");
        }
    }
}
    

