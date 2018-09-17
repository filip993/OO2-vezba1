package vozila;

import interfejsi.KamionInterfejs;
import tovar.Paket;

import java.util.ArrayList;


public class Kamion extends Vozilo implements KamionInterfejs {
    private double nosivost;
    private ArrayList<Paket> paketi;
    public Kamion(String registracioniBroj,double zapreminaMotora,String boja,double nosivost){
        super(registracioniBroj,zapreminaMotora,boja);
        this.nosivost=nosivost;
        this.paketi=new ArrayList<Paket>();
    }
    public String toString(){
        String prikazPaketi="";
        double ukupnaTezina=0;
        for (Paket p: paketi) {
            prikazPaketi+=p;
            prikazPaketi+="\n";
            ukupnaTezina+=p.getTezina();
        }
        return super.toString()+",Paketi:\n"+prikazPaketi+",Ukupna tezina:"+ukupnaTezina;
    }

    @Override
    public void utovar(Paket noviPaket){
        double ukupnaTezina=0;
        for (Paket p: paketi) {
            ukupnaTezina+=p.getTezina();
        }
        ukupnaTezina+=noviPaket.getTezina();
        if(this.nosivost>=ukupnaTezina){
            paketi.add(noviPaket);
            System.out.println("Uspesno ste dodali paket:"+noviPaket);
        }
        else{
            System.out.println("Kamion popunjen, nije moguce dodati paket!!");
        }
    }

    @Override
    public void istovar(int id) {
        boolean rezultat=false;
        for(int i=0;i<paketi.size();i++){
            if(paketi.get(i)!=null && paketi.get(i).getId()==id){
                paketi.remove(i);
                System.out.println("Usnesno ste uklonili paket iz kamiona!!");
                rezultat=true;
            }


        }
        if (!rezultat)
             System.out.println("Ne postoji paket sa zadatim id-em "+id);
    }
}
