
package com.myGames.figuren;


public class GespielterCharakter extends Charakter{
    protected String wirdGespieltVon;
    //protected int lebenspunkte;
    
    public GespielterCharakter(String spielername){
        //Konstruktor der Super-Klasse
        super();//Konstruktor der super-Klasse
        wirdGespieltVon = spielername;
    }
    
    public GespielterCharakter(int lp, int schadensRate, String spielername){
        //Konstruktoraufruf der beerbten Klasse
        //Konstruktor der eigenen Klasse
        this(spielername);
        this.lebenspunkte = lp;
        this.schadensRate = schadensRate;
    }
    
    public String zeigeSpielerName(){
        
        return wirdGespieltVon;
    }
    public void anzeigeDesSpielers(){
        System.out.println("**********************");
        System.out.println("Der Charakter wird gespielt von: "+wirdGespieltVon);
        System.out.println("Aktuelle Lebenspunkte: " + this.lebenspunkte);
        System.out.println("Die Schadensrate ist: "+this.schadensRate);
        System.out.println("**********************");
    }
    @Override
    public String toString(){
        return "Spieler: "+wirdGespieltVon+" | Lebensunkte: "+lebenspunkte+" | Schadensrate: "+schadensRate;
    }
}
