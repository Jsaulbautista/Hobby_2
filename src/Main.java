import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        System.out.println("Hola");

        EscucharMusica mimusica = new EscucharMusica("escuchar Música", 23, "Porque me siento solo", "El canto de la vaca burra", "Macehtazo");
        mimusica.Datos();
        mimusica.datosMusica();

        Programar miprograma = new Programar("Programar", 2, "Me gusta", "the end of evagelion", "sia", "Java");
        miprograma.Datos();
        miprograma.datosMusica();
        miprograma.progra();

        



        }
    }