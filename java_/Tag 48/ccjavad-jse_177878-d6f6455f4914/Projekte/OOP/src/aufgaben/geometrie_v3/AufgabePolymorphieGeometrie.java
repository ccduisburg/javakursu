package aufgaben.geometrie_v3;

import java.util.Random;

public class AufgabePolymorphieGeometrie {
    
    public static void main(String[] args) {
        
        Rechteck r1 = new Rechteck(3, 4);
        System.out.println("r1-Fläche: " + r1.getFlaeche());
        
        Kreis k1 = new Kreis(3);
        System.out.println("k1-Fläche: " + k1.getFlaeche());

        /*
            Damit eine Referenzzuweisung kompiliert, muss
            zwischen den Typen eine IS-A-Beziehung existieren 
            (von rechts nach licnks gelesen)
        */
        Figur x;
        x = r1;
        x = k1;
        
        
        Figur[] figuren = new Figur[100];
        
        Random r = new Random();
        for (int i = 0; i < figuren.length; i++) {
            
            if(r.nextBoolean()) {
                figuren[i] = new Rechteck(2, 3);
            } else {
                figuren[i] = new Kreis(2);
            }
        }
        
        System.out.println("---------------------------");
        
        printFlaechen(figuren);
    } // end of main
    
    static void printFlaechen(Figur[] figuren) {
        
        for (Figur f : figuren) {
            System.out.println(f);
            System.out.println("  Fläche: " + f.getFlaeche());
        }
        
    }

}
