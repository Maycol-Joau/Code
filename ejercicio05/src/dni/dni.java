
package dni;
import java.util.Scanner;

public class dni {
        static Scanner entrada=new Scanner(System.in);
        long nuevoNumeroDNI;

    private long numeroDNI;
    private String cui;

    public dni() {
        this.numeroDNI = 0;
        this.cui = "";
    }

    public dni(long numeroDni) {
        this.numeroDNI = numeroDNI;
        calcularCUI();
    }

    public long getNumeroDNI() {
        return numeroDNI;
    }

    public void setNumeroDNI(long numeroDNI) {
        this.numeroDNI = numeroDNI;
        calcularCUI();
    }

    public void leer() {
        System.out.println("Ingrese el número de DNI:");
        nuevoNumeroDNI = entrada.nextLong();
        this.numeroDNI = nuevoNumeroDNI;
        calcularCUI();
    }

    // Método para calcular el CUI
    private void calcularCUI() {
        int resto = (int)(numeroDNI % 8);
        cui = String.valueOf(resto);
    }

    public void mostrarDNI() {
        System.out.println(numeroDNI + "-" + cui);
    }

}

