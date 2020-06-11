
package com.myGames.waffen;

import com.myGames.figuren.Charakter;
import com.myGames.figuren.Hexer;
import com.myGames.figuren.Krieger;
import ki.Oger;

public class Schwert {
    private int id;
    private static int zaehler;//Gehört NICHT zum Objekt
    private Charakter besitzer;
   
    public Schwert(){
        System.out.println("Ein Schwert wurde geschmiedet");
        System.out.println("Anzahl der Schwerter: "+zaehler);//ToDO
        zaehler++;//ToDO
    }
    
    public void gebeSchwertAnNeuenBesitzer(Charakter besitzer){
        this.besitzer = besitzer;
        System.out.println("Das Schwert hat einen neuen Besitzer");
        if(besitzer instanceof Oger){
            System.out.println("Ah, das Schwert wird zum Zahnstocher");
            return;//Method wird beendet
        }
        if(besitzer instanceof Hexer){
            System.out.println("Oh, was soll ein Hexer mit einem Schwert?");
        }
        if(besitzer instanceof Krieger){
            System.out.println("Endlich, das hat gefehlt");
        }
        
    }
    public static int sovieleSchwerter(){//Gehört nicht zum Objekt, sondern zur Klasse
        return zaehler;
    }
}
