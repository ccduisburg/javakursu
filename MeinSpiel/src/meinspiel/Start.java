/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meinspiel;

import com.myGames.figuren.Charakter;
import com.myGames.figuren.GespielterCharaktr;
import com.myGames.figuren.Hexer;
import com.myGames.figuren.Kriger;
import ki.Oger;

//import static com.myGames.waffen.

/**
 *
 * @author ckabakci
 */
public class Start {

    public static void main(String[] args) {
        /* Charakter eins = new Charakter();
        Charakter zwei = new Charakter(30);
      
        eins.verwunden(zwei);
        zwei.verwunden(eins);
        zwei.verwunden(eins);
        zwei.verwunden(zwei);//????
        eins.verwunden(eins);//????
        System.out.println("Lebenspunkte Spieler eins: "+eins.getLebensPunkte());
        System.out.println("Lebenspunkte Spieler zwei: "+ zwei.getLebensPunkte());
       // Charakter t = new Charakter("Trump");
       // System.out.println("Trump: "+t.getLebensPunkte());
        Charakter vipCar= new Charakter(100,20);
        System.out.println("Al sana hain düsman "+vipCar.getLebensPunkte());
        
        GespielterCharaktr justus =new GespielterCharaktr("Justus Jonas");
        justus.anzeigeDesSpielers();
        Hexer lili =new Hexer("ggg");
        lili.anzeigeDesSpielers();
         */

        Oger hauDrauf = new Oger();
        Kriger ichRetteDieWelt = new Kriger("Jutzus Jonas");
        System.out.println("Oger: " + hauDrauf);
        System.out.println("Kriger: " + ichRetteDieWelt);
        hauDrauf.verwunden(ichRetteDieWelt);
        ichRetteDieWelt.verwunden(hauDrauf);
        System.out.println(hauDrauf);
        System.out.println("Kriger: " + ichRetteDieWelt);

        
        Charakter figur =new Kriger("Peter Shaw");
        Object nurSo=new Kriger("Bob Andrews");
        
       
         Charakter refFuerNurSo=(Charakter)nurSo;
         System.out.println("Objekt:  "+nurSo.toString());
         System.out.println("Das selbe Objekt mit neuer Referenz:  "+refFuerNurSo);
         refFuerNurSo.verwunden(hauDrauf);
         System.out.println(hauDrauf);
        
       
         
         
         
        
    }

}
