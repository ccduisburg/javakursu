package entwurfsmuster;

public class WrapperKlassen {
    
    public static void main(String[] args) {
        
        /*
            Numerische Wrapper-KLassen wie Integer und Long
            erben von Number
        */
        
        Number n = new Integer(22);
        
        /*
            Wrapper-Klassen sind Comparable
        */
        Comparable<Integer> c = new Integer(22);
        
        
        /*
            Autoboxing, Autounboxing
        */
        Integer i1 = 12;                    //Autoboxing
        Integer i2 = Integer.valueOf(12);   //manuelles Boxing
        
        int i3 = i1;                        //Autounboxing
        int i4 = i2.intValue();             //manuelles Unboxing
        
        /*
            Exam
        */
        class Foo {
            Integer y;
            Foo(int x) {
                y = y + x; // y = Integer.valueOf( y.intValue() + x );
            }
        }
        // System.out.println( new Foo(5).y ); //NullPointerException im Konstruktor
        
        /*
            Aufgabe A. (5 Min)
        
            Bitte die Zeile A umschreiben und Autoboxin/Autounboxing
            durchs manuelle Boxing/Unboxing ersetzen.
        */
        Integer i5 = 22;
        //i5++; // Zeile A
        
        //i5 = i5 + 1;
        //i5 = i5.intValue() + 1;
        i5 = Integer.valueOf( i5.intValue() + 1 ); //nur Lernaufgabe. Keine Praxisempfehlung!
        System.out.println(i5); // 23
        
        
        /*
            Wrapper-Klassen-Objekte sind unveränderlich (immutable)
        */
        
        
        /*
            Byte, Short, Long und Integer haben ihre Konstanten-Pools
        */
        Integer i6 = 12; // Aus dem Cache-Array
        Integer i7 = 12; // Aus dem Cache-Array
        System.out.println("i6 == i7 -> " + (i6==i7)); // true
        
        Integer i8 = 1200;
        Integer i9 = 1200;
        System.out.println("i8 == i9 -> " + (i8==i9)); // false
        
    }

}
