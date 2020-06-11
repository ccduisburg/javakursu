package aufgaben.geometrie_v4;

public class AufgabeIterfacesGeometrie {
    public static void main(String[] args) {
        
    }
    
    static void printFlaechen(Figur[] figuren) {
        
        for (Figur f : figuren) {
            System.out.println(f);
            System.out.println("  Fläche: " + f.getFlaeche());
        }
        
    }
    
}
