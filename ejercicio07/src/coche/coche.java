
package coche;


public class coche {
    private motor motor;
    private puerta puerta1;
    private puerta puerta2;

    public coche() {
        this.motor = new motor();
        this.puerta1 = new puerta();
        this.puerta2 = new puerta();
    }

    public void arrancar() {
        motor.arrancar();
    }

    public void apagar() {
        motor.apagar();
    }

    public void abrirPuerta1() {
        puerta1.abrir();
    }

    public void cerrarPuerta1() {
        puerta1.cerrar();
    }

    public void abrirPuerta2() {
        puerta2.abrir();
    }

    public void cerrarPuerta2() {
        puerta2.cerrar();
    }

    public void inflarRueda() {
        System.out.println("Inflando ruedas...");
    }

    public void desinflarRueda() {
        System.out.println("Desinflando ruedas...");
    }
}