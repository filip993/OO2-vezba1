package vozila;

public abstract class Vozilo {
    protected String registracioniBroj;
    protected double zapreminaMotora;
    protected String boja;
    public Vozilo(String registracioniBroj,double zapreminaMotora,String boja){
        this.registracioniBroj=registracioniBroj;
        this.zapreminaMotora=zapreminaMotora;
        this.boja=boja;
    }
    public String toString(){
        return this.registracioniBroj+"("+this.zapreminaMotora+","+this.boja+")";
    }

}
