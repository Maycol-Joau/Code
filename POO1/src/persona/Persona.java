
package persona;


public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    private double imc;

    
    public static final char SexoMasculino = 'H';
    public static final char SexoFemenino = 'M';

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = "";
        this.sexo = SexoMasculino;
        this.peso = 0.0;
        this.altura = 0.0;
    }
    

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calcularIMC(){
        imc

    }
    


          
}
