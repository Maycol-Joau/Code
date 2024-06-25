
package coche;


public class motor {
    private boolean encendido;

    public motor() {
        this.encendido = false;
    }

    public void arrancar() {
        if (!encendido) {
            encendido = true;
            System.out.println("El motor ha sido arrancado.");
        } else {
            System.out.println("El motor ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El motor ha sido apagado.");
        } else {
            System.out.println("El motor ya está apagado.");
        }
    }
}
