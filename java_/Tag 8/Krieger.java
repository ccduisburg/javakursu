
package com.myGames.figuren;

public class Krieger extends GespielterCharakter{
   
    protected int koerperkraft;
    
    public Krieger(String spieler){
       super(spieler);
   }
    public Krieger(String spieler, int koerperkraft){
        this(spieler);
        this.koerperkraft = koerperkraft;
    }
    
    @Override
    public void verwundetWerden(int schaden){
        super.verwundetWerden(schaden);
        this.lebenspunkte+=this.koerperkraft;
        System.out.println("HUUUUUUUUUUUUUAAAAAAAAAAAAA");
    }
}
