
package meinspiel;

import com.myGames.figuren.Charakter;

public class Start {

    public static void main(String[] args) {
        Charakter eins = new Charakter();
        Charakter zwei = new Charakter(30);
      
        eins.verwunden(zwei);
        zwei.verwunden(eins);
        zwei.verwunden(eins);
        zwei.verwunden(zwei);//????
        eins.verwunden(eins);//????
        System.out.println("Lebenspunkte Spieler eins: "+eins.getLebensPunkte());
        System.out.println("Lebenspunkte Spieler zwei: "+ zwei.getLebensPunkte());
        Charakter t = new Charakter("Trump");
        System.out.println("Trump: "+t.getLebensPunkte());
    }
    
}
