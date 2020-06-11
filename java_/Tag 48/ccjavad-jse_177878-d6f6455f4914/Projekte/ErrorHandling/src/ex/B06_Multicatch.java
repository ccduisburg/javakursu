package ex;

public class B06_Multicatch {

    public static void main(String[] args) {

        // Bevor es Multicatch gab:
        try {
        } 
        catch(ArithmeticException e) {}
        catch(IllegalArgumentException e) {}
        // catch(NumberFormatException e) {} // unreachable catch-Block


        // Bevor es Multicatch gab:
        try {
        } 
        catch(ArithmeticException e) {}
        catch(NumberFormatException e) {}
        catch(IllegalArgumentException e) {}


        // Bevor es Multicatch gab:
        try {
        } 
        catch(ArithmeticException e) {}
        catch(IllegalArgumentException e) {}
        
        // Bevor es Multicatch gab:
        try {
        } 
        catch(IllegalArgumentException e) {}
        catch(ArithmeticException e) {}
        
        // Aufgabe: IllegalArgumentException und ArithmeticException
        //          abfangen und gleich behandeln
        //
        // Lösung bevor es Multicatch gab -
        // catch für den Basistyp:
        try {
        } 
        catch(RuntimeException e) {}
        
        
        
        
        // Aufgabe: IllegalArgumentException und ArithmeticException
        //          abfangen und gleich behandeln
        //
        // Lösung mit Multicatch:
        try {
        } 
        catch(IllegalArgumentException | ArithmeticException e) {}

    } // 
    
    
}
