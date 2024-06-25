//Este es una clase Main en java, con esta clase, llamare a los atributos y metodos creados en la clase pasada
package persona;

import java.util.Scanner;
public class Main {
    //Esto sirve para que el usuario pueda meter datos en la maquina
    static Scanner entrada= new Scanner(System.in);
    
    public static void main(String[] args) {
        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;
        
       //Aqui inicializamos y llamamos las variables
        System.out.println("Introduce el nombre:");
        nombre=entrada.nextLine();

        System.out.println("Introduce la edad:");
        edad=entrada.nextInt();

        System.out.println("Introduce el sexo (H/M):");
        sexo=entrada.next().charAt(0);

        System.out.println("Introduce el peso (en kg):");
        peso=entrada.nextDouble();

        System.out.println("Introduce la altura (en cm):");
        altura=entrada.nextDouble();
        
        //Aqui creames una nueva variable para poder llamar la clase pasada(persona)
        persona persona1 = new persona(nombre, edad, sexo, peso, altura);

        persona persona2 = new persona(nombre, edad, sexo);

        persona persona3 = new persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.comprobarSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        System.out.println("\nResultados:");
        comprobarPesoIdeal(persona1);
        comprobarPesoIdeal(persona2);
        comprobarPesoIdeal(persona3);

        System.out.println("\nMayoría de edad:");
        indicarMayorDeEdad(persona1);
        indicarMayorDeEdad(persona2);
        indicarMayorDeEdad(persona3);

        System.out.println("\nInformación de cada persona:");
        System.out.println("Persona 1:\n" + persona1);
        System.out.println("Persona 2:\n" + persona2);
        System.out.println("Persona 3:\n" + persona3);
    }

    private static void comprobarPesoIdeal(persona persona) {
        double imc = persona.calcularIMC();
        if (imc == -1) {
            System.out.println(persona.getNombre() + " está por debajo de su peso ideal.");
        } else if (imc == 0) {
            System.out.println(persona.getNombre() + " está en su peso ideal.");
        } else {
            System.out.println(persona.getNombre() + " tiene sobrepeso.");
        }
    }

    private static void indicarMayorDeEdad(persona persona) {
        if (persona.esMayorDeEdad()) {
            System.out.println(persona.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona.getNombre() + " es menor de edad.");
        }
    }
}