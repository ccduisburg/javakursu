package assertions;

import java.util.Random;

/*
    Assertions müssen aktiviert werden:

    Kommandozeile (mit Oprion -ea):
        java -ea assertions.B01_Assertion_Expressions

    Netbeans:
        Projekt Properties/Run/VM Options
*/
public class B01_Assertions_aktivieren {

    private static void myMethod(int x) {
        assert x!=0; // Ich gehe davon aus, dass x ungleich 0 sein wird
        
        // System.out.println(100 / x);
    }
    
    
    public static void main(String[] args) {
        
        int x = new Random().nextInt(3) + 1; // 1 | 2 | 3
        myMethod(x);
        
        myMethod(0); // java.lang.AssertionError
        
        System.out.println("end of main");
    }
    
}
