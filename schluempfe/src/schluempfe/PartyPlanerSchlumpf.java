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
public class PartyPlanerSchlumpf extends Schlumpf {

    protected Schlumpf[] meinSchlumpfe = new Schlumpf[3];

    public PartyPlanerSchlumpf(String name) {
        super(name);
    }

    public void partyPlanen(){

        meinSchlumpfe[0] = new Schlumpf("Papa Schlumpf");
        meinSchlumpfe[1] = new Schlumpf("Schlumpfine");
        meinSchlumpfe[2] = new Schlumpf("Gargamel");
        Einladung einladung = new Einladung();

        for (Schlumpf gast : meinSchlumpfe) {
          
            try{
            einladung.einladen(gast);
            
            //Ausname wenn Gargamel auf der PArty erscheinen möchte  
            System.out.println("Der lieber Schlumpf " + gast.soHeissIch() + " wurde zu meiner Party eingeladen");
            } catch(NichtEingeladenException e)
            {
                System.out.println("Pass bitte auf, wen du einlädst");
                System.out.println("Papa Schlumpf: Gargamel hat es mal wieder versucht");
                System.out.println("Fehler: "+e.getMessage());
            }
        }

    }

}
