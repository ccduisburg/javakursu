package vererbung;

/*
    - jede Klasse hat immer mindestens einen Konstruktor
    (z.B. den default-Konstruktor)

    - sobald ein konstruktor selbst geschrieben ist, bietet 
        der compiler nicht mehr den default konstruktor

    - Jeder Konstruktor wird direkt oder indirekt:
        - super-Konstruktor aufrufen
        - alle Attribute initialiesieren

    - Direkte Attributenzuweisungen finden in Wirklichkeit im 
        Konstruktor statt

    - inhalte der Init-Blöcke werden in die Konstruktoren übertragen
*/

class Kurs {
    int nummer;
    
    //Hier gibt es den unsichtbaren default-Konstruktor:
    // Kurs() {
    //   super();
    //   this.nummer = 0;
    // }
}

class JavaKurs extends Kurs {
    int dauer;
    
    JavaKurs() {
        // super();             // vom Compiler generiert
        // this.dauer = 0;      // vom Compiler generiert
    }
}

class CppKurs extends Kurs {
    int schwierigkeit;

    public CppKurs(int s) {
        // super();              // vom Compiler generiert
        this.schwierigkeit = s;
    }

    public CppKurs() {
        super();
        //this.schwierigkeit = 0; // vom Compiler generiert
    }
    
    public CppKurs(String s) {
        this();
    }
}


class ScalaKurs extends Kurs {
    int maxTN = 22;
    
    {
        System.out.println("init 1");
    }
    {
        System.out.println("init 2");
    }
    
    // default-Konstruktor vom Compiler generiert:
    // ScalaKurs() {
    //   super();
    //   this.maxTN = 22;
    //   System.out.println("init 1");
    //   System.out.println("init 2");
    // }
}


public class B05_Konstruktoren_bei_Vererbung {

    public static void main(String[] args) {
        
        ScalaKurs sk = new ScalaKurs();
        
        System.out.println("sk.maxTN: " + sk.maxTN);
        
    }
    
}
