package putnik;

public class Putnik {
    private String ime;
    private String prezime;
    private int godiste;

    public Putnik(String ime, String prezime, int godiste) {
        this.ime = ime;
        this.prezime = prezime;
        this.godiste = godiste;
    }

    public String toString(){
        return this.ime+" "+this.prezime+","+this.godiste;
    }
}
