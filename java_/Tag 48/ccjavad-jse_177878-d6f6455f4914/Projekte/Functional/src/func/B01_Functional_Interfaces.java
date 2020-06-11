package func;

/*
    - Functional Interface hat nur eine abstrakte Methode.

    - @FunctionalInterface-Annotation ist optional.

    - Java-Standardbibliothek hat viele funktionale Interfaces.
        Einige findet man in dem Package java.lang.function:
        https://docs.oracle.com/javase/8/docs/api/?java/util/function/package-summary.html
*/
interface X {
    void m();
}


@FunctionalInterface
interface Y {
    void m();
    // void m2(); // Compilerfehler mit der Annotation FunctionalInterface
}


public class B01_Functional_Interfaces {

    public static void main(String[] args) {
        
        /*
            Einige Vorteile von dem funktionalen Programmieren:
        */
        // - Funktionen als Daten verwenden        
        // - Der Code ist kompakter als bei den anonymen Klassen
        // - deferred evaluation (Aufgeschobene Auswertung)
        //      (s. dafür das Beispiel für Function)
        
        X var = () -> {};
        
        Y var2 = () -> {};
        
    }
    
}
