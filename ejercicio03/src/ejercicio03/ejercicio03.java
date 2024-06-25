
package ejercicio03;

import java.util.Random;

public class ejercicio03 {

    public static double[] numerosAleatorios(int tamaño) {
        double[] numeros = new double[tamaño];
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = random.nextDouble();
        }
        return numeros;
    }

    public static double calcularMedia(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    public static double calcularDesviacionEstandar(double[] numeros, double media) {
        double sumaDiferenciasCuadrado = 0;
        for (double numero : numeros) {
            sumaDiferenciasCuadrado += Math.pow(numero - media, 2);
        }
        double varianza = sumaDiferenciasCuadrado / numeros.length;
        return Math.sqrt(varianza);
    }
}