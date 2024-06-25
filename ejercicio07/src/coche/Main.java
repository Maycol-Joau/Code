
package coche;


public class Main {


    public static void main(String[] args) {
        motor motor1= new motor();
        rueda rueda1= new rueda();
        puerta puerta1= new puerta();
        ventana ventana1= new ventana();

        motor1.arrancar();
        motor1.apagar();
        rueda1.inflar();
        rueda1.desinflar();
        ventana1.abrir();
        ventana1.cerrar();
        puerta1.abrir();
        puerta1.cerrar();

    }
}