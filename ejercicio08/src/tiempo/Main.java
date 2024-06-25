
package tiempo;


public class Main {


    public static void main(String[] args) {
        hora hora1 = new hora();
        System.out.println("Hora 1 (predeterminada):");
        hora1.print();

        hora hora2 = new hora();
        System.out.println("Ingrese la hora 2:");
        hora2.leer();
        System.out.println("Hora 2:");
        hora2.print();

        System.out.println("Segundos desde medianoche para hora 1: " + hora1.aSegundos());

        hora1.deSegundos(3600);
        System.out.println("Hora 1 después de 3600 segundos desde medianoche:");
        hora1.print();

        System.out.println("Segundos entre hora 1 y hora 2: " + hora1.segundosDesde(hora2));

        hora1.siguiente();
        System.out.println("Hora 1 después del segundo siguiente:");
        hora1.print();

        hora2.anterior();
        System.out.println("Hora 2 después del segundo anterior:");
        hora2.print();

        System.out.println("¿Hora 1 es igual a hora 2? " + hora1.igualQue(hora2));

        System.out.println("¿Hora 1 es menor que hora 2? " + hora1.menorQue(hora2));

        System.out.println("¿Hora 1 es mayor que hora 2? " + hora1.mayorQue(hora2));
    }
}
