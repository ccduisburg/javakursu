
package com.myGames.figuren;


public class Hexer extends GespielterCharaktr{
    private int zauberkraft=15;
    public Hexer(String wirdGespieltVon) {
    super(wirdGespieltVon);
    }
        
   
    
    @Override
    public void verwunden(Charakter fremder)
    {
     fremder.verwundetWerden(schadensRate+zauberkraft);
    }
}
