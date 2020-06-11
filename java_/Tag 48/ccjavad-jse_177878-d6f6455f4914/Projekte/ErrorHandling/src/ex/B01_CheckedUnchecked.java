package ex;

import java.io.IOException;

public class B01_CheckedUnchecked {
    
    // checked:
    static void m1() throws Exception {}
    static void m2() throws Throwable {}
    static void m3() throws IOException {}
    
    public static void main(String[] args) {
        
        // m1(); // Compilerfehler (checked Exception deklariert)
        
        // m2(); // Compilerfehler (Throwable is auch checked)

        
        try { } catch (NullPointerException e) {} //uncheckt, keine extra-Compilerkontrollen
        try { } catch (Exception e) {} // geht auch, wenn keine Exceptions geworfen werden
        try { } catch (Throwable e) {} // geht auch, wenn keine Exceptions geworfen werden
        // try { } catch (IOException e) {}  // Compilerfehler: keine solche checked Exception möglich
        
    }

}
