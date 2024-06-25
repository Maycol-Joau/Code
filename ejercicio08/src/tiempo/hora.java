
package tiempo;

import java.util.Scanner;

public class hora {
    static Scanner entrada= new Scanner(System.in);
    private int horas;
    private int minutos;
    private int segundos;

    public hora() {
        this(0, 0, 0);
    }

    public hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        valida();
    }

    public void leer() {
        System.out.print("Ingrese las horas: ");
        this.horas = entrada.nextInt();
        System.out.print("Ingrese los minutos: ");
        this.minutos = entrada.nextInt();
        System.out.print("Ingrese los segundos: ");
        this.segundos = entrada.nextInt();
        valida();
    }

    private void valida() {
        if (horas < 0 || horas > 23) {
            horas = 0;
        }
        if (minutos < 0 || minutos > 59) {
            minutos = 0;
        }
        if (segundos < 0 || segundos > 59) {
            segundos = 0;
        }
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void print() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public int aSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public void deSegundos(int segundosDesdeMedianoche) {
        horas = segundosDesdeMedianoche / 3600;
        minutos = (segundosDesdeMedianoche % 3600) / 60;
        segundos = (segundosDesdeMedianoche % 3600) % 60;
        valida();
    }

    public int segundosDesde(hora otraHora) {
        return Math.abs(this.aSegundos() - otraHora.aSegundos());
    }

    public void siguiente() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                horas++;
                if (horas >= 24) {
                    horas = 0;
                }
            }
        }
    }

    public void anterior() {
        segundos--;
        if (segundos < 0) {
            segundos = 59;
            minutos--;
            if (minutos < 0) {
                minutos = 59;
                horas--;
                if (horas < 0) {
                    horas = 23;
                }
            }
        }
    }

    public hora copia() {
        return new hora(horas, minutos, segundos);
    }

    public boolean igualQue(hora otraHora) {
        return this.horas == otraHora.horas && this.minutos == otraHora.minutos && this.segundos == otraHora.segundos;
    }

    public boolean menorQue(hora otraHora) {
        if (this.horas < otraHora.horas) {
            return true;
        } else if (this.horas == otraHora.horas && this.minutos < otraHora.minutos) {
            return true;
        } else if (this.horas == otraHora.horas && this.minutos == otraHora.minutos && this.segundos < otraHora.segundos) {
            return true;
        }
        return false;
    }

    public boolean mayorQue(hora otraHora) {
        if (this.horas > otraHora.horas) {
            return true;
        } else if (this.horas == otraHora.horas && this.minutos > otraHora.minutos) {
            return true;
        } else if (this.horas == otraHora.horas && this.minutos == otraHora.minutos && this.segundos > otraHora.segundos) {
            return true;
        }
        return false;
    }
}