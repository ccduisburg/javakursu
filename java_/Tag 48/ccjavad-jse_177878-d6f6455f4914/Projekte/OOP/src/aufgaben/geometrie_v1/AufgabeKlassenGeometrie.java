package aufgaben.geometrie_v1;

import java.util.Random;

public class AufgabeKlassenGeometrie {

    public static void main(String[] args) {
        System.out.println("--- 100 Rechtecke: ");
        
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            
            int breite = r.nextInt(20) + 1;
            int hoehe = r.nextInt(20) + 1;
            Rechteck rechteck = new Rechteck(breite, hoehe);
            System.out.println( i + 1 + ". " + rechteck);
        }
        
        System.out.println("-------------------");
        
        Kreis k1 = new Kreis(5);
        System.out.println("k1: " + k1);
        
        System.out.println("-------------------");
        
        Rechteck r1 = new Rechteck(2, 3);
        System.out.println("r1: " + r1); // 
        
        Rechteck.anpassen(r1, 4, 5);
        System.out.println("r1: " + r1); // 

    }
    
}
