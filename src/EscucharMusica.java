public class EscucharMusica extends Hobbys {

    public EscucharMusica(String nombreHobby, int horasDia, String razon, String cancionFavorita, String artistaFavorito) {
        super(nombreHobby, horasDia, razon);
        this.cancionFavorita=cancionFavorita;
        this.artistaFavorito = artistaFavorito;
    }
    String cancionFavorita;
    String artistaFavorito;

    public String getCancionFavorita() {
        return cancionFavorita;
    }

    public void setCancionFavorita(String cancionFavorita) {
        this.cancionFavorita = cancionFavorita;
    }

    public String getArtistaFavorito() {
        return artistaFavorito;
    }

    public void setArtistaFavorito(String artistaFavorito) {
        this.artistaFavorito = artistaFavorito;
    }

    public void datosMusica(){
        System.out.println("Tu canción Favorita es: " + cancionFavorita);
        System.out.println("Tu artista favorito es: " + artistaFavorito);
        System.out.println();
    }
}
