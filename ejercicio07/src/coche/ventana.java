
package coche;

public class ventana {
    private boolean abierta;

    public ventana() {
        this.abierta = false;
    }

    public void abrir() {
        if (!abierta) {
            abierta = true;
            System.out.println("La ventana ha sido abierta.");
        } else {
            System.out.println("La ventana ya está abierta.");
        }
    }

    public void cerrar() {
        if (abierta) {
            abierta = false;
            System.out.println("La ventana ha sido cerrada.");
        } else {
            System.out.println("La ventana ya está cerrada.");
        }
    }
}
