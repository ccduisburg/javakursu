
package diebohne;//Das ist das Verzeichnis, in dem sich diese Datei befindet

import java.util.Scanner;



/**
 * Diese Klasse hat die Aufgabe meine Cafe-Anwendung zu strukurieren
 * @author Sanne
 */
public class DieBohne {//Datei die über "publíc" für jeden sichtbar ist

    /**
     * Dokumentationskommentar endet * /
     * @param args Hier landen die Befehlszeilenargumente 
     */
    public static void main(String[] args) {
       /* //int: Ganzahlen im positiven und negativen Bereich
        int anzahlDerBestelltenKaffees;//Variablendeklaration: Typ und Name Konvention: erste Buchstabe klein!!!
        anzahlDerBestelltenKaffees = 10+17*2;//Initialisierung: Erste Zuweisung 
        //double: Fließkommazahl
        double gesamtPreis = anzahlDerBestelltenKaffees * 2.11;//Variablendefinition
        
        //Datentyp String (eigentich eine Klasse...)
        String nameMeinesCafes = "Die Bohne";//Immer mit doppelten Hochkommata
        
        System.out.println("Mein neues Cafe heißt "+nameMeinesCafes);//Abkürzung: sout und tab-Taste
        System.out.println("Was ich heute schon an Kaffees hatte: "+anzahlDerBestelltenKaffees);
        System.out.println("Dann muss ich: " + gesamtPreis + "€ bezahlen");
        
        int id1 = 111;//Möglich auch andere Darstellung der Zahl, zB als Hexadezimalzahl
        int id2 = 222;
        int id3 = 333;
        
        //andere Ganzzahlen, immer sowhl positiv als auch negativ
        byte kurzeZahl = 22;
        short auchNeKurzeZahl = 44;
        
        //ande Fließkommazahlen:
        float kleinereFliesskommaZahl = 11.6f;//Mit einem f am Ende wird ein float kein Double erzeugt
        
        System.out.println("Die gewähte id ist: "+id3);
        
       // Zeilenkommentar: Endet am Ende der Zeile*/
       /*
       Blockkomentar endet mit * /
  
       // Hier schon Vorgriff, nur für den Spaß...
       Scanner eingabe = new Scanner(System.in);
        System.out.println("Hallo Willkommen in der Bohne, wie heißt du?");
        String kundenName = eingabe.nextLine();
        System.out.println("Schön, dass du da bist "+kundenName);
        String sorte1 = "Latte Macchiato";
        String sorte2 = "Milchkaffe";
        String sorte3 = "Cappuchino";
        
        int id1 = 111;
        int id2 = 222;
        int id3 = 333;
        
        double preis1 = 4.11;
        double preis2 = 2.12;
        double preis3 = 5f;//Einem double wird ein float zugewiesen: Automatische "konvertieren"
        
        
        
        System.out.println("Unser Kaffee " + sorte1 + " wird bestellt mit der id: "+id1 + "und kostet:"+preis1+"€");
        System.out.println("Unser Kaffee "+sorte2+" wird bestellt mit der id: "+id2 + "und kostet:"+preis2+"€");
        System.out.println("Unser Kaffee "+sorte3+" wird bestellt mit der id: "+id3 + "und kostet:"+preis3+"€");
        
        System.out.println("Welche Sorte soll es sein?");
        int gewaehlteSorte =eingabe.nextInt();
        System.out.println("Gewählt wurde: "+gewaehlteSorte);
        
        //Wahrheitswerte als Datentyp
        boolean eingabeKorrekt = true;
        eingabeKorrekt = 3<4;
        eingabeKorrekt = gewaehlteSorte == 111;
        //System.out.println("War die eingegebene Id 111? "+eingabeKorrekt);
        if(eingabeKorrekt){
            System.out.println("Vielen Dank für die Wahl des: "+sorte1);
        }
        else{
            if(gewaehlteSorte== 222){
                System.out.println("Vielen Dank für die Wahl des: "+sorte2);
            }
            System.out.println("Auf jeden Fall wurde kein "+sorte1+" gewählt.");
        }  
        /* Zwischenbemerkung zu casten und umwandeln
        int test= (int)3.9415;//Explizit casten
        System.out.println("Test: "+test);
        float test2=(float)3.1415; 
        System.out.println("Test: "+test2);
        double test3 = (double)3;//Unnötig, auch implizit möglich
        
       //Experimentieren!
        System.out.println("Unser Kaffee wird in 3 Größen angeboten, klein, mittel und groß");
        char klein ='k';//dahinter steckt ein int
        char mittel = 'm';
        char gross = 'g';
        System.out.println("Welche Größe soll es sein? Bitte bestellen mit: k, m oder g");
        System.out.println("Der Buchstabe k: "+(int)klein);
        System.out.println("Der Buchstabe m: "+(int)mittel);
        int zahl= mittel + gross;
        System.out.println("Errechnet wurde: "+(char)(zahl));
        zahl=mittel/6;//Division von int / int -> int
        double d = mittel/6.0; //Division durch double -> double
       // zahl = -111;//Bitte aufpasse, eigentlich KEINE negative Zahlen in Buchstaben umwandeln!
        System.out.println("Errechnet wurde: "+(char)(zahl)+ " oder als Zahl: "+(int)zahl);
        
        
        //Operatoren
        String str="hallo"+"welt";//Große Ausnahme, alle anderen Operatoren nur für primitive Datentypen
        //+, - / *:
        int l = 3+4;
        
        // &: Logische Verknüpfung: und
        boolean b1=true;
        boolean b2=false;
        boolean verknuepft= b1 & b2; //verknuepft ist nur wahr, wenn beide Operanden true sind
        verknuepft = b1 && b2; //Abkürzung: b2 wird nur überprüpft(ausgeführt), wenn b1 true
        
        // | Logische Verknüpfung: oder
        verknuepft = b1 | b2; //verknuepft ist wahr, wenn b1 oder b2 wahr ist, oder beide
        verknuepft = b1 || b2; //Abkürzung: b2 wird nur überprüpft(ausgeführt), wenn b1 false
        
        // ^ Logische Verknüpfung entweder oder
        verknuepft = b1 ^ b2; //verknuepft ist wahr, wenn b1 oder b2 wahr ist, aber nicht beide
        
        // ! Logische Verknüpfung nicht
        verknuepft = !b1; //verknuepft ist wahr, wenn b1 falsch ist
        
        
        // % Modulo-Operator: Restklassen-Operator: Gibt den Rest einer ganzzahligen Divison aus
        int zahl1 = 16;
        int zahl2 = 6;
        int mod = zahl1%zahl2; // ergibt: 4
        
        //TESTEN TESTEN TESTEN
        //Wenn i später noch verwendet werden soll: 
        int i=0;
        //Schleifen ( i = i+1 => i++; i 0 i-1 => i--
        for(i=0;i<6;i++){
            System.out.println("Gezählt: "+i);
            for(int j=0;j<15 && i>0;j++){
                if(j%i==0){
                    System.out.println(j+" ist durch "+ i + " teilbar");
                }
            }
        }
        System.out.println("Welchen Wert hat i jetzt? "+i);//Vorsicht
        //Schritt1: int i=0
        //Schritt2: i<6 falls -> true
        //Schritt3:  System.out.println("Gezählt: "+i);
        //Schritt4: i++
        //Schritt5: i<6 falls -> true
        //Schritt6:  System.out.println("Gezählt: "+i);
        //Schritt7: i++
        //Schritt8: i<6 falls -> true
        //Schritt9:  System.out.println("Gezählt: "+i);
        //Schritt10: i++
        //usw
        
        //Bedingte Schleife: Kopfgesteuerte, Fußgesteuerte
        //Kopfgesteuert:
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben");
        int gelesen=eingabe.nextInt();
        //While: während eine Bendingung wahr ist
        while(gelesen<6){
            System.out.println("Eingegeben wurde: "+gelesen);
            gelesen=eingabe.nextInt();
        }
        //Schritt1: ist gelesen<6, dann Schleifendurchlauf
        //Schritt2: System.out.println("Eingegeben wurde: "+gelesen);
        //Schritt3: Einlesen einer neuen Zahl
        //Schritt4: prüfen ob die neue Zahl gelesen<6, dann Schleifendurchlauf
        //Schritt5: System.out.println("Eingegeben wurde: "+gelesen);
        //usw
        //Bedinget, fußgesteuerte Schleife: do-while Schleife
        int fGelesen=0;
        do{
            System.out.println("Bitte eine Zahl eingeben:");
            fGelesen = eingabe.nextInt();
            System.out.println("Gelesen wurde: "+ fGelesen);
        }while(fGelesen>10);//Semikolon schließt fußgestuerte Schleife ab
        //Schritt 1: Führe ersten Schleifendurchlauf aus
        //Schritt 2: Überprüfe Bedingung: fGelesen>10
        //Schritt 3: Falls Bedingung wahr ist: nächster Schleifendurchlauf
*/
       //int z1, z2, z3, z4, z5;keine schöne Lösung
       /*
        if(counter ==1){
                    z1=i;
                }
                if(counter == 2){
                    z2=i;
                }
       *///Ende der unschönen Lösung...
       //Schöner: Array: Sammlung gleichartiger Variablen, Arrays haben eine feste Größe
       int anzahlGeraderZahlen = 5;
       int[] sammlung; //Deklaration eines Arrays
       sammlung = new int[anzahlGeraderZahlen];//Initialisierung eines Arrays: Schlüsselwort new
       //int[] sammlung= new int[anzahlGeraderZahlen];
       int counter=0;
       for(int i=0; i<30;i++){
          
           if(i%2==0){
               System.out.println("I : "+i);
               sammlung[counter]=i;//Zugriff auf die einzelnen Element des Arrays mit dem Index. Kleinster Index: 0
               counter++;
               
           }
           if(counter==anzahlGeraderZahlen){
               break;//Beendet die Schleife
           }
       }
       for(int i =0; i<10; i=i+2){
           System.out.println("anders: I: "+i);
       }
       
        for(int i=0; i<5;i++){//So muss bekannt sein, wieviele Schleifendurchläufe ich genau brauche
            System.out.print(" " + sammlung[i] +" ");
        }
        System.out.println();
        for(int i=0; i<=sammlung.length; i++){
            System.out.print(" " + sammlung[i] +" ");
        }
         System.out.println();
    }
    
}
