
package libros;

import java.util.Scanner;

public class Main {

    static Scanner entrada=new Scanner(System.in);

    public static void main(String[] args) {
        ListaLibros lista = new ListaLibros();

        // Ejemplo de uso:
        lista.insertarLibro(new libro("El señor de los anillos", "J.R.R. Tolkien"));
        lista.insertarLibro(new libro("Harry Potter", "J.K. Rowling"));
        lista.insertarLibro(new libro("Cien años de soledad", "Gabriel García Márquez"));

        System.out.println("Número de libros en la lista: " + lista.getNumeroLibros());

        System.out.println("Ingrese una parte del título para buscar:");
        String parteTitulo = entrada.nextLine();
        int posicionEncontrada = lista.buscarLibro(parteTitulo);
        if (posicionEncontrada != -1) {
            System.out.println("Libro encontrado en la posición " + posicionEncontrada + ": " + lista.obtenerLibro(posicionEncontrada));
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}