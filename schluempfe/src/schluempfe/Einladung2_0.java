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
public class Einladung2_0 extends Einladung{
    @Override
    public void einladen(Schlumpf schlumpf) throws NichtEingeladenException{
    
        System.out.println("Einladung zu wlan Party");
        try{
        super.einladen(schlumpf);
        }catch(NichtEingeladenException e){
            System.out.println("Fehler erledigt....");
        }
        
    }
    
}
//Einladung2_0->Einladng->Objekt