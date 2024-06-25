
package ejercicio04;
import java.util.Scanner;


public class racional {
    static Scanner entrada=new Scanner(System.in);
    private int numerador;
    private int denominador;

    public racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public racional(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            System.out.println("Error: El denominador no puede ser cero. Se establecerá a 1.");
            this.denominador = 1;
        }
    }
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }

    public void leer() {
        System.out.println("Ingrese el numerador:");
        this.numerador = entrada.nextInt();

        System.out.println("Ingrese el denominador:");
        int nuevoDenominador = entrada.nextInt();
        if (nuevoDenominador != 0) {
            this.denominador = nuevoDenominador;
        } else {
            System.out.println("Error: El denominador no puede ser cero. Se mantendrá el valor anterior.");
        }
    }

    // Método para sumar dos números racionales
    public racional suma(racional otro) {
        int nuevoNumerador = this.numerador * otro.denominador + otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new racional(nuevoNumerador, nuevoDenominador);
    }

    // Método para restar dos números racionales
    public racional resta(racional otro) {
        int nuevoNumerador = this.numerador * otro.denominador - otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new racional(nuevoNumerador, nuevoDenominador);
    }

    // Método para multiplicar dos números racionales
    public racional multiplicacion(racional otro) {
        int nuevoNumerador = this.numerador * otro.numerador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new racional(nuevoNumerador, nuevoDenominador);
    }

    // Método para dividir dos números racionales
    public racional division(racional otro) {
    if (otro.numerador == 0) {
        System.out.println("Error: No se puede dividir por cero.");
        // Devolver un nuevo objeto racional con valor 0/1
        return new racional();
    }
    int nuevoNumerador = this.numerador * otro.denominador;
    int nuevoDenominador = this.denominador * otro.numerador;
    return new racional(nuevoNumerador, nuevoDenominador);
    }

    // Método para comparar dos números racionales
    public int comparar(racional otro) {
        int numerador1 = this.numerador * otro.denominador;
        int numerador2 = otro.numerador * this.denominador;
        if (numerador1 < numerador2) {
            return -1;
        } else if (numerador1 > numerador2) {
            return 1;
        } else {
            return 0;
        }
    }

    // Método para realizar una copia del número racional
    public racional copia() {
        return new racional(this.numerador, this.denominador);
    }

    // Método para imprimir el número racional
    public void print() {
        System.out.println(this.numerador + "/" + this.denominador);
    }

}
