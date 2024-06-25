
package persona;

import java.util.Random;

public class persona {
    //Atributos
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    private double imc;

    //Metodos para definir el sexo
    public static final char SexoMasculino = 'H';
    public static final char SexoFemenino = 'M';

    //Mas metodos
    public persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = SexoMasculino;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }



    public persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }


    //Metodo para calcular el IMC
    public double calcularIMC(){
        double alturaEnMetros = altura / 100.0;
        imc = peso / (alturaEnMetros * alturaEnMetros);

        if (imc < 20) {
            return -1; 
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SexoMasculino; 
        }
    }

    //Generar un DNI(documento nacional de identificacion)
    private String generarDNI() {
        Random rnd = new Random();
        int numDNI = rnd.nextInt(100000000);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = numDNI % 23;
        return String.valueOf(numDNI) + letras.charAt(indice);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nDNI: " + DNI +
               "\nSexo: " + sexo +
               "\nPeso: " + peso +
               "\nAltura: " + altura +
               "\nIMC: " + imc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getIMC() {
        return imc;
    }
}

