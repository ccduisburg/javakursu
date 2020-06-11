
package com.myGames.figuren;

public class GespielterCharaktr extends Charakter {
    protected String wirdGespieltVon;
    
    public GespielterCharaktr(String spielername)
    {
        super();
      wirdGespieltVon=spielername;
    }
    public GespielterCharaktr(int lebenspunkte, int schadensRate)
    {
     this.lebenspunkte=lebenspunkte;
     this.schadensRate=schadensRate;
     
    }
    
     
    public String zeigeSpielerName()
    {
      return wirdGespieltVon;
    }
    public void anzeigeDesSpielers(){
    
        System.out.println("**************************");
        System.out.println("Der Charakter wird gespielt von: "+wirdGespieltVon);
        System.out.println("Aktuelle Lebenspunkter: "+this.lebenspunkte);
         System.out.println("Aktuelle schadensRate: "+this.schadensRate);
        System.out.println("***************************************");
    
    }
    
    @Override
    public String toString(){
    return "Spieler: "+wirdGespieltVon+" |Lebenspunkte :"+lebenspunkte+ "| Schadensrate: "+schadensRate;
    
    }
    
}
