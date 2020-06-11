package vererbung;

import java.io.IOException;

class FahrzeugException extends Exception {}


class Fahrzeug {
    void fahren() {}
    
    Fahrzeug getInstance() {
        return new Fahrzeug();
    }
}

class PKW extends Fahrzeug {
    // Überladen (keine Regeln zu beachten):
    private int fahren(int x) throws IOException { return x; }
    
    
    // int fahren() { return 2; }  // Rückgabetyp geändert
    // private void fahren() {}    // Sichtbarkeit verschärft
    // void fahren() throws FahrzeugException {}    // zus. checked Exception
    
    // OK:
    public void fahren() throws NumberFormatException {}
    
    // OK:
//    Fahrzeug getInstance() {
//        return new PKW();
//    }
    
    // OK (kovarianter Rückgabetyp, PKW ist Fahrzeug):
    PKW getInstance() {
       return new PKW();
    }
}

public class B03_override_Beispiele {
    
    public static void main(String[] args) {
        Fahrzeug f1 = new PKW();
        
        Fahrzeug f2 = f1.getInstance();
    }
    
}
