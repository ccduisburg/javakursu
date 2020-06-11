/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schluempfe;

/**
 *
 * @author ckabakci
 */
public class Einladung2_2 extends Einladung2_0{
     @Override
    public void einladen(Schlumpf schlumpf) throws NichtEingeladenException2_2,ClassCastException{
    
        System.out.println("Einladung zu wlan Party");
        try{
        super.einladen(schlumpf);
        }catch(NichtEingeladenException e){
            System.out.println("Fehler erledigt....");
        }
        
    }
    
    
    
}
//Einladung2_2->Einladung2_0->Einladung