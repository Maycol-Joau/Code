
package fecha;
import java.util.Scanner;


public class fecha {
    static Scanner entrada = new Scanner(System.in);

     private int dia;
    private int mes;
    private int año;

    public fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }
    
    public fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();
    }

    public void leer() {
        System.out.print("Ingrese el día (1-31): ");
        this.dia = entrada.nextInt();
        System.out.print("Ingrese el mes (1-12): ");
        this.mes = entrada.nextInt();
        System.out.print("Ingrese el año (1900-2050): ");
        this.año = entrada.nextInt();
        valida();
    }

    public boolean bisiesto() {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public int diasMes(int mes) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto()) {
            return 29;
        }
        return diasPorMes[mes - 1];
    }

    private void valida() {
        if (año < 1900 || año > 2050) {
            año = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (dia < 1 || dia > diasMes(mes)) {
            dia = 1;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return año;
    }

    public void setAnio(int anio) {
        this.año = anio;
    }

    public void corta() {
        System.out.printf("%02d-%02d-%d\n", dia, mes, año);
    }

    public void larga() {
        String[] diasSemana = {"domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"};
        System.out.printf("%s %d de %s de %d\n", diasSemana[diaSemana()], dia, nombreMes(), año);
    }

    private String nombreMes() {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return meses[mes - 1];
    }

    public int diaSemana() {
        int a = (14 - mes) / 12;
        int y = año - a;
        int m = mes + 12 * a - 2;
        return (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
    }

    public int diasTranscurridos() {
        int dias = dia - 1;
        for (int i = 1; i < mes; i++) {
            dias += diasMes(i);
        }
        for (int i = 1900; i < año; i++) {
            if (bisiesto()) {
                dias += 366;
            } else {
                dias += 365;
            }
        }
        return dias;
    }

    public void fechaTras(long dias) {
        int totalDias = diasTranscurridos() + (int) dias;
        int año = 1900;
        int mes = 1;

        while (totalDias > 0) {
            int diasEnAnio = bisiesto() ? 366 : 365;
            if (totalDias >= diasEnAnio) {
                totalDias -= diasEnAnio;
                año++;
            } else {
                while (totalDias >= diasMes(mes)) {
                    totalDias -= diasMes(mes);
                    mes++;
                }
                this.año = año;
                this.mes = mes;
                this.dia = totalDias + 1;
                totalDias = 0;
            }
        }
    }

    public int diasEntre(fecha otraFecha) {
        return Math.abs(otraFecha.diasTranscurridos() - this.diasTranscurridos());
    }

    public void siguiente() {
        int maxDia = diasMes(mes);
        if (dia < maxDia) {
            dia++;
        } else {
            dia = 1;
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                año++;
            }
        }
    }

    public void anterior() {
        if (dia > 1) {
            dia--;
        } else {
            if (mes > 1) {
                mes--;
                dia = diasMes(mes);
            } else {
                año--;
                mes = 12;
                dia = 31;
            }
        }
    }

    // Método para devolver un clon de la fecha
    public fecha copia() {
        return new fecha(dia, mes, año);
    }

    // Método para verificar si dos fechas son iguales
    public boolean igualQue(fecha otraFecha) {
        return (this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.año == otraFecha.año);
    }

    // Método para verificar si la fecha es menor que otra fecha
    public boolean menorQue(fecha otraFecha) {
        if (this.año < otraFecha.año) {
            return true;
        } else if (this.año == otraFecha.año && this.mes < otraFecha.mes) {
            return true;
        } else if (this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia < otraFecha.dia) {
            return true;
        }
        return false;
    }

    // Método para verificar si la fecha es mayor que otra fecha
    public boolean mayorQue(fecha otraFecha) {
        if (this.año > otraFecha.año) {
            return true;
        } else if (this.año == otraFecha.año && this.mes > otraFecha.mes) {
            return true;
        } else if (this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia > otraFecha.dia) {
            return true;
        }
        return false;
    }
}