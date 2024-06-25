
package Boa;

import Boa.Boa;
import java.util.Scanner;
/**
 *============================================================
 * @author Maycol Joau Baneo R.        fecha: 19/09/23
 * version: 1     JDK: 17           Java: 8
 *============================================================
 * Sistema de Boa
 * Aqui estará la clase principal: main
 */
public class BoaMain {
    public static void main(String[] args) {
        //inicio
	//entrada
	//var de entrada
        //var de salida
        //Var complementarias
        Scanner objeto = new Scanner(System.in);
        //creacion de objeto
        Boa boa = new Boa();
        //Peticiones de entrada
        System.out.println("============================================");
        System.out.println("Bienvenido, ingrese la información de la boa");
        System.out.println("============================================");
        System.out.println("Ingrese el color de la boa: ");
        boa.color=objeto.next();
        System.out.println("¿Cuantos ojos tiene?");
        boa.ojos=objeto.nextInt();
        System.out.println("¿Cual es su peso?");
        boa.peso=objeto.nextDouble();
        System.out.println("¿Cual es su tamaño?");
        boa.tamaño=objeto.nextInt();
        System.out.println("¿Cual es su especie?");
        boa.especie=objeto.next();
        System.out.println("¿Cual es su habita?");
        boa.habita=objeto.next();
        //Proceso
        
        //Salida
        System.out.println("Mostrando resultados");
	System.out.println("====================");
	System.out.println("");
	System.out.println("\nBoa");
	System.out.println("Color            :"+boa.color);
	System.out.println("Numero de ojos   :"+boa.ojos);
	System.out.println("Su peso es       :"+boa.peso);
	System.out.println("Su tamaño es     :"+boa.tamaño);
	System.out.println("Esoecie          :"+boa.especie);
	System.out.println("Su habita es     :"+boa.habita);

        
    }//Fin de main
    
}//Fin de class
