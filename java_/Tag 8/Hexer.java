
package com.myGames.figuren;

public class Hexer extends GespielterCharakter{
    private int zauberkraft=15;
    public Hexer(String wirdGespieltVon){
        super(wirdGespieltVon);
    }
    public Hexer(){
        super("NoN");
    }
    //public void verwunden(Charakter fremder) {
    
    @Override
    public void verwunden(Charakter fremder){
        fremder.verwundetWerden(schadensRate+zauberkraft);
    }
}
 