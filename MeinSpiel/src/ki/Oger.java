
package ki;

import com.myGames.figuren.Charakter;

public class Oger extends Charakter{
    public Oger(){ //parameterlose konstrukter aufruf
    
     this.lebenspunkte=200;
     this.schadensRate=20;
    }
    @Override
    public String toString(){
    return "Öger: Leben: "+lebenspunkte;
    }
}
