
package electrodomesticos;
import java.util.Scanner;


public class Main {

static Scanner entrada= new Scanner(System.in);
    
    public static void main(String[] args) {
        electrodomesticos electrodomestico = new electrodomesticos("Nevera", "Samsung", 1.5);

        System.out.println("Características del electrodoméstico:");
        System.out.println(electrodomestico);

        System.out.print("Ingrese el número de horas de funcionamiento: ");
        int horasFuncionamiento = entrada.nextInt();
        double consumoTotal = electrodomestico.getConsumo(horasFuncionamiento);
        System.out.println("Consumo total en kW: " + consumoTotal);

        System.out.print("Ingrese el coste por kW/hora: ");
        double costeHora = entrada.nextDouble();
        double costeTotalConsumo = electrodomestico.getCosteConsumo(horasFuncionamiento, costeHora);
        System.out.println("Coste total del consumo: $" + costeTotalConsumo);
    }
}