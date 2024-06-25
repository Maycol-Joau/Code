
package playlist;

public class playlist {
    private Cancion[] canciones;
    private int contador;

    public playlist() {
        canciones = new Cancion[50]; //
        contador = 0;
    }

    public int numeroCanciones() {
        return contador;
    }

    public Cancion dameCancion(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            return canciones[posicion];
        } else {
            return null; 
        }
    }

    public void grabaCancion(int posicion, Cancion nuevaCancion) {
        if (posicion >= 0 && posicion < contador) {
            canciones[posicion] = nuevaCancion;
        }
    }

    public void agrega(Cancion cancion) {
        if (contador < canciones.length) {
            canciones[contador] = cancion;
            contador++;
        } else {
            System.out.println("La playlist está llena, no se puede agregar más canciones.");
        }
    }

    public void elimina(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            for (int i = posicion; i < contador - 1; i++) {
                canciones[i] = canciones[i + 1];
            }
            canciones[contador - 1] = null; 
            contador--;
        }
    }
}
