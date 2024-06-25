
package coche;


public class puerta {
    private boolean abierta;
    private ventana ventana;

    public puerta() {
        this.abierta = false;
        this.ventana = new ventana();
    }

    public void abrir() {
        if (!abierta) {
            abierta = true;
            System.out.println("La puerta ha sido abierta.");
        } else {
            System.out.println("La puerta ya está abierta.");
        }
    }

    public void cerrar() {
        if (abierta) {
            abierta = false;
            System.out.println("La puerta ha sido cerrada.");
        } else {
            System.out.println("La puerta ya está cerrada.");
        }
    }

    public ventana getVentana() {
        return ventana;
    }
}