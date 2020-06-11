
package schluempfe;

import java.time.LocalDate;

public class Einladung {

    public void einladen(Schlumpf schlumpf) throws NichtEingeladenException{

        if (schlumpf.soHeissIch().equalsIgnoreCase("Gargamel")) {
         //   NichtEingeladenException neDuNicht = new NichtEingeladenException();
            
               // throw neDuNicht;
                throw new NichtEingeladenException("fdfdf");
           
        }
        if(schlumpf.soHeissIch().equalsIgnoreCase("Azman"))
        {
        
        throw new NichtEingeladenException2_0("Azman, der fiese Kater darf auch nicht ");
        }
        
        System.out.println("Die Einladung an " + schlumpf.soHeissIch() + " wurde am " + LocalDate.now() + " verschick");
    }
}
