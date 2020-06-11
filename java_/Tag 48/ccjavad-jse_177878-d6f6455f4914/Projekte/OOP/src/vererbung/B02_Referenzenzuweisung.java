package vererbung;

/*
    Damit die referenzzuweisung kompiliert
    muss zwischen den Operandentypen die IS-A-Beziehung
    existieren (von rechts nach links gelesen)
*/
public class B02_Referenzenzuweisung {
    public static void main(String[] args) {
        String s = null;
        Integer i = null;
//        s = i;       // Compilerfehler

        Number n = null;
//        i = n;        // Compilerfehler
        n = i;          // Integer IS-A Number (extends)

        Comparable c = null;
        c = i;          // Integer IS-A Comparable (implements)
    }
}
