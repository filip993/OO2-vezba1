package glavni;

import putnik.Putnik;
import tovar.Paket;
import vozila.Autobus;
import vozila.Kamion;


public class Program {
    public static void main(String[] args) {
        Autobus a1=new Autobus("BG-123-AA",3450.10,"Bela");
        Autobus a2=new Autobus("BG-321-AA",3450.10,"Plava");
        System.out.println(a1);
        System.out.println(a2);

        Putnik p1=new Putnik("Ime1","Prezime1",1990);
        Putnik p2=new Putnik("Ime2","Prezime2",1991);
        Putnik p3=new Putnik("Ime3","Prezime3",1992);
        Putnik p4=new Putnik("Ime4","Prezime4",1993);
        Putnik p5=new Putnik("Ime5","Prezime5",1994);
        Putnik p6=new Putnik("Ime6","Prezime6",1995);
        a1.prijemPutnika(p1);
        a1.prijemPutnika(p2);
        a1.prijemPutnika(p3);
        a1.prijemPutnika(p4);
        a1.prijemPutnika(p5);
        a1.prijemPutnika(p6);

        a1.izlazPutnika(8);

        a1.izlazPutnika(2);

        System.out.println(a1);
        System.out.println(a2);

        Kamion k1=new Kamion("BG-456-KK",5000.90,"Siva",30000);
        Kamion k2=new Kamion("BG-654-KK",5000.90,"Crvena",32000);

        System.out.println(k1);
        System.out.println(k2);


        Paket pk1=new Paket("NazivP1",10000);
        Paket pk2=new Paket("NazivP2",12000);
        Paket pk3=new Paket("NazivP3",13000);
        Paket pk4=new Paket("NazivP4",14000);

        k1.utovar(pk1);
        k1.utovar(pk2);
        k1.utovar(pk3);

        k2.utovar(pk3);
        k2.utovar(pk4);
        k2.istovar(pk2.getId());
        k2.istovar(pk3.getId());

        System.out.println(k1);
        System.out.println(k2);

    }
}
