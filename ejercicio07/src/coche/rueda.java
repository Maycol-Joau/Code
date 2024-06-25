
package coche;


public class rueda {
    private boolean inflada;

    public rueda() {
        this.inflada = false;
    }

    public void inflar() {
        if (!inflada) {
            inflada = true;
            System.out.println("La rueda ha sido inflada.");
        } else {
            System.out.println("La rueda ya está inflada.");
        }
    }

    public void desinflar() {
        if (inflada) {
            inflada = false;
            System.out.println("La rueda ha sido desinflada.");
        } else {
            System.out.println("La rueda ya está desinflada.");
        }
    }
}
