
package schluempfe;

/**
 *
 * @author ckabakci
 */
public class Schluempfe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
        System.out.println("***************Party!*******");
        PartyPlanerSchlumpf pps=new PartyPlanerSchlumpf("Jokey");
        pps.partyPlanen();
        System.out.println("Viel Spaß!");       
        */
     PartyPlanerSchlumpf pps=new PartyPlanerSchlumpf("Jokey");
     Einladung2_0 wlan= new Einladung2_0();
     //wlan.einladen(pps);
     
     Einladung party =wlan;//party ist ein reference  //compilerside type
            
     //((Einladung2_0)party).einladen(pps);
     
     party= new Einladung();
       //((Einladung2_0)party).einladen(pps);
       
    }
    
}
