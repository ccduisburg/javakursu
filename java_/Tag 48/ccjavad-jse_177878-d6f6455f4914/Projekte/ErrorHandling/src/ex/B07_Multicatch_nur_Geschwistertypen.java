package ex;

public class B07_Multicatch_nur_Geschwistertypen {

    public static void main(String[] args) {
        // Multicatch mit Geschwistertypen:
        try {
            //...
        } catch( ArithmeticException | IllegalArgumentException e ) {
            //...
        }
        
        
        // Es ist nicht erlaubt bei Multicatch die Exceptions
        // aufzulisten, die voneinander erben (Compiilerfehler).
        //
        // NumberFormatException extends IllegalArgumentException
        try {
            //...
        } catch( NumberFormatException | IllegalArgumentException e ) {
            //...
        }
        
        
    }
    
}
