
package sueldo;

import java.util.Scanner;

public class Sueldo {
    static Scanner entrada= new Scanner(System.in);

    public static void main(String[] args) {
        
        double sueldo1,sueldo2,sueldo3,sueldo4,sueldo5;        
        
        System.out.println("Porfavor, ingrese los sueldos;");
        System.out.println("Primer sueldo");
        sueldo1=entrada.nextDouble();        
        System.out.println("Segundo sueldo");
        sueldo2=entrada.nextDouble();
        System.out.println("Tercer sueldo");
        sueldo3=entrada.nextDouble();
        System.out.println("Cuarto sueldo");
        sueldo4=entrada.nextDouble();
        System.out.println("Quinto sueldo");
        sueldo5=entrada.nextDouble();   
        
        double suma=sueldo1+sueldo2+sueldo3+sueldo4+sueldo5;
        System.out.println("La suma de los sueldos en total son: "+suma);
        
        int mayor2500=0;
        if (sueldo1 > 2500) mayor2500++;
        if (sueldo2 > 2500) mayor2500++;
        if (sueldo3 > 2500) mayor2500++;
        if (sueldo4 > 2500) mayor2500++;
        if (sueldo5 > 2500) mayor2500++;
        
        System.out.println("Existe "+ mayor2500 +" sueldos que superan los 2500 soles");


    }
    
}
