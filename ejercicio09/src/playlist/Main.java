
package playlist;


public class Main {


    public static void main(String[] args) {
        
        playlist miPlaylist = new playlist();
        
        miPlaylist.agrega(new Cancion("Cancion1", "Artista1", 3.5));
        miPlaylist.agrega(new Cancion("Cancion2", "Artista2", 4.2));
        miPlaylist.agrega(new Cancion("Cancion3", "Artista3", 5.1));
        
        System.out.println("Número de canciones en la playlist: " + miPlaylist.numeroCanciones());
        
        Cancion primeraCancion = miPlaylist.dameCancion(0);
        if (primeraCancion != null) {
            System.out.println("Primera canción: " + primeraCancion.getTitulo());
        } else {
            System.out.println("La playlist está vacía.");
        }
        
        miPlaylist.elimina(1);
        
        System.out.println("Número de canciones en la playlist después de eliminar: " + miPlaylist.numeroCanciones());
    }
}