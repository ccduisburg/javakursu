package interfaces;

/*
        Achtung! Alle Elemente sind public
*/
interface I1 {
    
    /*
        public static final Attribute
    */
    int A1 = 1;  // public static final 
    
    /*
        public abstract Methoden
    */
    void m1(); 
    
    /*
        public default-Methoden
    */
    default void m2() {
        System.out.println("default-Methode");
    }
    
    /*
        public static Methoden
    */
    static void s1() {
        System.out.println("static-Methode");
    }
    
    /*
        public nested Typen
    */
    class C1 {}
    interface I2 {}
    
}

public class B01_Elemente_In_Interface {

}
