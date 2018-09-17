package vozila;

import interfejsi.InterfejsAutobus;
import putnik.Putnik;

public class Autobus extends Vozilo implements InterfejsAutobus{
    private Putnik[] putnici;
    private static final int brojPutnika=5;

    public Autobus(String registracioniBroj, double zapreminaMotora, String boja) {
        super(registracioniBroj, zapreminaMotora, boja);
        this.putnici=new Putnik[brojPutnika];
    }
    public String toString(){
        String prikazPutnici="";
        for (Putnik p:putnici) {
            if(p!=null) {
                prikazPutnici += p;
                prikazPutnici += "\n";
            }
        }
        return super.toString()+",Putnici:\n"+prikazPutnici;
    }

    @Override
    public void prijemPutnika(Putnik noviPutnik) {
        boolean rezultat=false;
        for (int i=0;i<putnici.length;i++) {
            if (putnici[i]==null){
                putnici[i]=noviPutnik;
                rezultat=true;
                break;
            }
        }
        if(rezultat)
            System.out.println("Uspesan prijem putnika:"+noviPutnik);
        else
            System.out.println("Nema slobodnih mesta u autobusu!!");
    }

    @Override
    public void izlazPutnika(int indeks) {
        try {
            System.out.println("Putnik "+putnici[indeks] +" napustio autobus.");
            putnici[indeks]=null;

        }catch (IndexOutOfBoundsException e){
            System.out.println("Nepostojeci indeks!!");
        }
    }
}
