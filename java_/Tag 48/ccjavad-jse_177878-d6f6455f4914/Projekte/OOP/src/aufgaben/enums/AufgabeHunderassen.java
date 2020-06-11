package aufgaben.enums;

enum Hunderasse {
    DACKEL(.5), COLLIE, DOGGE(1.5);
    
    private double maxGroesse = 1;

    /*
        der Konstruktor ist auch private:
    */
    Hunderasse(double maxGroesse) {
        this.maxGroesse = maxGroesse;
    }

    private Hunderasse() {
        //this.maxGroesse = 1; // vom Compiler kopiert
    }

    public double getMaxGroesse() {
        return maxGroesse;
    }

    @Override
    public String toString() {
        String name = name();
        name = name.charAt(0) + name.substring(1).toLowerCase();
        return name + ", max. Größe: " + maxGroesse;
    }
}

public class AufgabeHunderassen {

    public static void main(String[] args) {
        
        Hunderasse h1 = Hunderasse.COLLIE;
        
        Hunderasse[] values = Hunderasse.values();
        for (Hunderasse hr : values) {
            System.out.println(hr);
        }
        
    }
    
}
