
package de.cemil.date;

import Kunden.Kunde;

public class Werbung {//Beispielklasse für alles Mögliche zu Methoden
    //werbeSpamOpfer soll sofort beim Anlegen des Objekts initialisert werden:
    private Kunde[] werbeSpamOpfer = new Kunde[4];
    public void zeigeAlleKundenAn(){
        System.out.println("***************");
        for(Kunde meinKunde : werbeSpamOpfer){
            System.out.println("Der Kunde ist: "+meinKunde.gebeName());
        }
        System.out.println("***************");
    }
    public void kundeZufuegen(Kunde neuerKunde){
        //Soll an eine Stelle im Kunden-Array gesetzt werden, die bisher nicht belegt wurde
        //Eine Ausgabe soll erfolgen, wenn das Kunden-Array schon voll ist
        //Kein Kunde soll "überschrieben" werden
        //Vergleich mit null ist möglich: if (k[i]==null)..
        //Array durchlaufen: um herauszufinden, on ein Element schon belegt ist: for(int i=0; i<10;i++)
        //
        for(int i=0; i<werbeSpamOpfer.length;i++){
            if(werbeSpamOpfer[i]==null){
                werbeSpamOpfer[i] = neuerKunde;
                break;
            }
        }
    }
    public void anredeAendern(){
        for(Kunde meinKunde : werbeSpamOpfer){
            meinKunde.setzeDenNamen(meinKunde.gebeName().toUpperCase());
            /* Gleichbedeutend: 
                String tmp = meinKunde.gebeName();
                String gross = tmp.toUpperCase();
                meinKunde.setzeDenNamen(gross);
            */
        }  
        Kunde testKunde = werbeSpamOpfer[0];
        //kundeIstKoenig(testKunde); 
        kundeIstKoenig(werbeSpamOpfer);
    }
    public void kundeIstKoenig(Kunde meinKunde){
        meinKunde.setzeDenNamen("König");  
    }
    public void kundeIstKoenig(Kunde[] alleMeineKunden){
        Kunde koenig = new Kunde();
        koenig.setzeDenNamen("König");
        alleMeineKunden[0]=koenig; 
    }
    
    
    public void zahlenKram(){
        int i =0;
        manI(i);
        System.out.println("i hat den Wert: "+i);
    }
    public void manI(int i){
        i++;
    }
    
}
