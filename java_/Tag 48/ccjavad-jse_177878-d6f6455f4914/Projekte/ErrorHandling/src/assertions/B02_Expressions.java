package assertions;

public class B02_Expressions {

    
    public static void main(String[] args) {
        
        int x = 0;
        
        assert x==0; // Expression1
        
        assert x==0 : "Fehlemeldung"; // Expression1 & Expression2 (optional)
        
        assert x==0 : 2 * 3; // 6 taucht auf in der Fehlermeldung (im Falle vom AssertionError)
        
        // assert x==0 : System.out.println(22); // Compilerfehler, da println void liefert
        
        
        System.out.println("end of main");
        
    }
    
}
