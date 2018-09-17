package tovar;


public class Paket {
    private int id;
    private String naziv;
    private double tezina;
    private static int idGenerator=0;

    public Paket(String naziv,double tezina){
        idGenerator++;
        this.naziv=naziv;
        this.tezina=tezina;
        this.id=idGenerator;
    }
    public double getTezina(){
        return tezina;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return this.id+"("+this.naziv+","+this.tezina+")";
    }
}
