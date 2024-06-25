
package com.mycompany.precio;

import java.util.Scanner;

public class Precio {
/**
 *====================================================
 * @author Maycol             fecha:25/09/23
 * version: 1                 JDK :17   JAVA:8
 * ===================================================
 * Sistema Para Los Precios De Diferentes Productos
 */
    public static void main(String[] args) {
        while(true){
            //inicio
            //entrada
            //  var entrada
            int producto;
            char calidad;
            //  var salida
            float pago;
            //  var complementaria
            Scanner objeto= new Scanner(System.in);
            int opcion;
            String mensaje;
            //  inicializadores
            producto=0;
            calidad=0;
            pago=0;
            opcion=0;
            mensaje="";
            //  peticiones de entrada
            System.out.println("Ingrese el producto 1, 2, 3: ");
            producto=objeto.nextInt();
            System.out.println("Ingrese la calidad: ");
            calidad=objeto.next().charAt(0);
            //proceso
            if(producto=='1'){
                if(calidad=='A'){
                    pago=5000;
                    mensaje="Usted eligio la calidad A";
                }
                else if(calidad=='B'){
                    pago=4500;
                    mensaje="Usted eligio la calidad B";
                }
                else if(calidad=='C'){
                    pago=4000;
                    mensaje="Usted eligio la calidad C";
                }
            }
            if(producto=='2'){
                if(calidad=='A'){
                    pago=4500;
                    mensaje="Usted eligio la calidad A";
                }
                else if(calidad=='B'){
                    pago=4000;
                    mensaje="Usted eligio la calidad B";
                }
                else if(calidad=='C'){
                    pago=3500;
                    mensaje="Usted eligio la clase C";
                }
            }
            if(producto=='3'){
                if(calidad=='A'){
                    pago=4000;
                    mensaje="Usted eligio la calidad A";
                }
                else if(calidad=='B'){
                    pago=3500;
                    mensaje="Usted eligio la calidad B";
                }
                else if(calidad=='C'){
                    pago=3000;
                    mensaje="Usted eligio la calidad C";
                }
            }
            //Salida
            System.out.println("Mostrando los resultados");
            System.out.println("========================0");
            System.out.println("Usted eligio: "+producto);
            System.out.println("El precio a pagar es: "+pago);
            System.out.println("");
            System.out.println("¿Deseas continuar? Si=1/No=0: ");
            opcion=objeto.nextInt();
            if(opcion==0){
                break;
            }
        }//Fin de While
    }//Fin del Main
}//Fin de Class Precio
