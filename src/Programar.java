public class Programar extends EscucharMusica {
    public Programar(String nombreHobby, int horasDia, String razon, String cancionFavorita, String artistaFavorito, String lenFavorito) {
        super(nombreHobby, horasDia, razon, cancionFavorita, artistaFavorito);
        this.lenFavorito = lenFavorito;
    }
    String lenFavorito;

    public String getLenFavorito() {
        return lenFavorito;
    }

    public void setLenFavorito(String lenFavorito) {
        this.lenFavorito = lenFavorito;
    }

    public void progra(){
        System.out.println("Tu lenguaje favorito es: " + lenFavorito);
        System.out.println("Y escucho " + cancionFavorita + " para programar");
    }
}
