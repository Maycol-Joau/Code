
package ejercicio03;


public class main {

    public static void main(String[] args) {
        int tamano = 30;
        double[] numeros = ejercicio03.numerosAleatorios(tamano);
        double media = ejercicio03.calcularMedia(numeros);
        double desviacionEstandar = ejercicio03.calcularDesviacionEstandar(numeros, media);

        System.out.println("Media: " + media);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }    
    
}
