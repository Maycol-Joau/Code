
package libros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class libro {
    private String titulo;
    private String autor;

    public libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }
}

    class ListaLibros {
    private ArrayList<libro> libros;

    public ListaLibros() {
        libros = new ArrayList<>();
    }

    public int getNumeroLibros() {
        return libros.size();
    }

    public void insertarLibro(libro libro) {
        libros.add(libro);
        ordenarPorTitulo();
    }

    public void eliminarLibro(int posicion) {
        libros.remove(posicion);
    }

    public libro obtenerLibro(int posicion) {
        return libros.get(posicion);
    }

    public int buscarLibro(String parteTitulo) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().toLowerCase().contains(parteTitulo.toLowerCase())) {
                return i; // Se encontró el libro
            }
        }
        return -1; // No se encontró el libro
    }

    private void ordenarPorTitulo() {
        Collections.sort(libros, Comparator.comparing(libro::getTitulo));
    }
}

