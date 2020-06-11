package assertions;

/*
    evtl. nicht in der Prüfung
*/
public class B03_assertions_appropriate {

    // Sinnvoll: Argumente in privaten Methoden kontrollieren
    private static void m1(int x) {
        assert x > 0;
    }
    
    // NICHT Sinnvoll: Argumente in public Methoden kontrollieren
    public static void m2(int x) {
        assert x > 0; // NICHT sinnvoll
    }
    
    // doch Sinnvoll: Argumente in public Methoden kontrollieren,
    // wenn zu einem AssertionError gar nicht kommen kann.
    public enum Color { RED, BLUE }
    public static void m2a(Color x) {
        switch(x) {
            case RED: /*...*/ break;
            case BLUE: /*...*/ break;
            default: assert false;
        }
    }
    
    
    static int ATT;
    // NICHT Sinnvoll: Nebeneffekte mit Assertions
    static void m3() {
        assert ++ATT == 1; // nicht sinnvoll
    }
    
    

    // NICHT Sinnvoll: Argumente in der main kontrollieren
    public static void main(String[] args) {
        assert args.length == 1; // nicht sinnvoll        
    }
    
}
