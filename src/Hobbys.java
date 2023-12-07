public class Hobbys {
    public String nombreHobby;
    public int horasDia;
    public String Razon;

    public Hobbys(String nombreHobby, int horasDia, String razon) {
        this.nombreHobby = nombreHobby;
        this.horasDia = horasDia;
        Razon = razon;
    }

    public String getNombreHobby() {
        return nombreHobby;
    }

    public void setNombreHobby(String nombreHobby) {
        this.nombreHobby = nombreHobby;
    }

    public int getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public String getRazon() {
        return Razon;
    }

    public void setRazon(String razon) {
        Razon = razon;
    }

    public void Datos(){
        System.out.println("El nombre del Hobby es: " + nombreHobby);
        System.out.println("Y realizas este hobby por: " + horasDia + " horas al día");
        System.out.println("Hago ese hobby porque " + Razon);

    }
}
