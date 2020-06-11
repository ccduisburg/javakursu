
package com.myGames.figuren;


public class Kriger extends GespielterCharaktr{
    protected int koerperkraft;
    public Kriger(String spieler)
    {
      super(spieler);
    }
    public Kriger(String spieler, int koeperkraft)
    {
     this(spieler);
     this.koerperkraft=koeperkraft;    }
    
    @Override
    public void verwundetWerden(int schaden){
    super.verwundetWerden(schaden);
    
    this.lebenspunkte+=this.koerperkraft;
        System.out.println("HUUUUUUAAAAAAAAAAAAAAAA");
    }
        
}
