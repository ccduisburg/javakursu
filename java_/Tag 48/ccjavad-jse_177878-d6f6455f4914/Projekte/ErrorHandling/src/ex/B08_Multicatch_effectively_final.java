package ex;

public class B08_Multicatch_effectively_final {

    public static void main(String[] args) {
        
        try {
            
        } catch(RuntimeException e) {
            e = new RuntimeException(); // Zuweisung: OK
        }
        
        try {
            
        } catch(ArithmeticException | NumberFormatException e) {
            e = new RuntimeException(); // Zuweisung: Compilerfehler
        }
        
    }
    
}
