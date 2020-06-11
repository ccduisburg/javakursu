package cctld;

/**
 *
 * @author André
 */
public class FunctionSet {
    
    public static void laenderSucheMit1Buchstaben(String eingabe) {
        
        String eingabeGross = eingabe.toUpperCase();
        String eingabeKlein = eingabe.toLowerCase();
        
        System.out.println("Folgende Länderkürzel beginnen mit dem Buchstaben \'" + eingabe + "\':");
        System.out.println("\nLÄNDERKÜRZEL\tLAND");
        
        for (CCTLD land : CCTLD.values()) {
            
            if (land.toString().substring(0, 1).equals(eingabeGross)) {
                System.out.println("" + land.toString().toLowerCase() + "\t\t" + new Lander_Gebiete().laender[land.ordinal()] );
            }
        }
        System.out.println("------------------------------------------------");
        
        System.out.println("Folgende Länderkürzel enden mit dem Buchstaben \'" + eingabe + "\':");
        System.out.println("\nLÄNDERKÜRZEL\tLAND");
        
        for (CCTLD land : CCTLD.values()) {
            
            if (land.toString().substring(1, 2).equals(eingabeGross)) {
                System.out.println("" + land.toString().toLowerCase() + "\t\t" + new Lander_Gebiete().laender[land.ordinal()] );
            }
        }
    }
        
    public static void laenderSucheMit2Buchstaben(String eingabe) {
        
        String eingabeGross = eingabe.toUpperCase();
        String eingabeKlein = eingabe.toLowerCase();
        
        for (CCTLD land : CCTLD.values()) {
            
            if (land.toString().equals(eingabeGross)) {
                System.out.println("Das Länderkürzel " + eingabeKlein + " gehört zu dem Land " + new Lander_Gebiete().laender[land.ordinal()] );
                break;
            }
        }
        System.out.println("Das eingegebene Länderkürzel konnte nicht gefunden werden. Bitte überprüfen sie ihre Eingabe.");        
    }    
}
