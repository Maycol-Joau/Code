
package fecha;


public class Main {


    public static void main(String[] args) {
        fecha fecha1 = new fecha(); // Constructor predeterminado
        fecha fecha2 = new fecha(28, 2, 2024); // Constructor parametrizado

        fecha1.leer();

        System.out.println("Fecha 1 (Corta): ");
        fecha1.corta();
        System.out.println("Fecha 1 (Larga): ");
        fecha1.larga();

        System.out.println("Fecha 2 (Corta): ");
        fecha2.corta();
        System.out.println("Fecha 2 (Larga): ");
        fecha2.larga();

        System.out.println("¿Fecha 1 es bisiesto? " + fecha1.bisiesto());
        System.out.println("¿Fecha 2 es bisiesto? " + fecha2.bisiesto());

        System.out.println("Día de la semana para Fecha 1: " + fecha1.diaSemana());
        System.out.println("Día de la semana para Fecha 2: " + fecha2.diaSemana());

        System.out.println("Días transcurridos desde 1-1-1900 para Fecha 1: " + fecha1.diasTranscurridos());
        System.out.println("Días transcurridos desde 1-1-1900 para Fecha 2: " + fecha2.diasTranscurridos());

        System.out.println("¿Fecha 1 es igual que Fecha 2? " + fecha1.igualQue(fecha2));
        System.out.println("¿Fecha 1 es menor que Fecha 2? " + fecha1.menorQue(fecha2));
        System.out.println("¿Fecha 1 es mayor que Fecha 2? " + fecha1.mayorQue(fecha2));

        fecha1.siguiente();
        fecha2.anterior();

        System.out.println("Fecha 1 después de pasar al día siguiente: ");
        fecha1.corta();
        System.out.println("Fecha 2 después de pasar al día anterior: ");
        fecha2.corta();

        fecha fecha3 = fecha1.copia();
        System.out.println("Fecha 3 (copia de Fecha 1): ");
        fecha3.corta();

        System.out.println("Días entre Fecha 1 y Fecha 3: " + fecha1.diasEntre(fecha3));

        fecha3.fechaTras(10000);
        System.out.println("Fecha 3 después de 10,000 días: ");
        fecha3.corta();
    }
}
    

