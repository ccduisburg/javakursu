package gui;

import java.util.Scanner;
import kunden.Kunden;
import logic.GruppeFehleingabe;
import logic.Service;
import logic.Waren;

import warengruppen.Warengruppen;

/**
 *
 * @author CC-Student
 */
public class Konsole extends GruppeFehleingabe {

    private Service s;
    private Scanner eingabe;
    private Waren verkaufen;

    public Konsole(Service s) {
        this.s = s;
        eingabe = new Scanner(System.in);

        // * try {
        navigation();
        // } catch (GruppeFehleingabe ex) {
        //System.out.println("Diese Produktgruppe exestiert nicht! \n Bitte geben Sie die ID der Warengruppe ein: ");

    }

    // TODO code application logic here
    private void produktWahl(Kunden kunde1) throws GruppeFehleingabe {
        int produktWahl = eingabe.nextInt();

        //Produktwahl    
        int ja = 1;
        int nein = 2;
        {

            if (produktWahl == 1) {

                for (Warengruppen warengruppen : Warengruppen.values()) {
                    System.out.println("Produktgruppen " + warengruppen + " ID " + warengruppen.getNummer());
                }
                //private warengruppen.getNummer();
                System.out.println("Bitte geben Sie die ID der Warengruppe ein: ");
                int kundeHatGewaehlt = eingabe.nextInt();
                System.out.println("gewählt..."+kundeHatGewaehlt);
                switch (kundeHatGewaehlt) {
                    case 1: {
                        System.out.println("CPU");
                        //   System.out.println(warengruppen.Warengruppen);
                        break;                    }
                    case 2: {
                        System.out.println("Cases");
                        break;                    }
                    case 3: {
                        System.out.println("Cooling");
                        break;                    }
                    case 4: {
                        System.out.println("Grafikkarten");
                        break;                    }
                    case 5: {
                        System.out.println("HDD's");
                        break;                    }
                    case 6: {
                        System.out.println("Mainboard's");
                        break;                    }
                    case 7: {
                        System.out.println("Netzteile");
                        break;                    }
                    case 8: {
                        System.out.println("Sie haben RAM gewählt");
                        break;                    }
                    default:
                        throw new GruppeFehleingabe();               }
            } else {
                if (produktWahl == 2) {
                    System.out.println("vielen Dank für Deinen Besuch " + kunde1.ausgabeName());
                }

            }
        }
    }

    private void navigation() {

        String nameDesShops = "Michas Hardwarebude";

        //Begrüßung
        System.out.println("Hallo Willkommen in " + nameDesShops + ", wie heißt du?");
        Kunden kunde1 = new Kunden();
        System.out.println("Nachname:");
        kunde1.nameEingeben(eingabe.nextLine());
        System.out.println("Vorname:");
        kunde1.vornameEingeben(eingabe.nextLine());

        {
            System.out.println("schön dass du da bist " + kunde1.ausgabeName() + ", möchtest du eine Auswahl der Produkte sehen? " + "1=ja 2=nein");

        }
        try {
            produktWahl(kunde1);
            System.out.println("ddeee");
        } catch (GruppeFehleingabe ex) {
            System.out.println (getMessage());
            
            try {
                produktWahl(kunde1);
            } catch (GruppeFehleingabe ex1) {
                System.out.println("vielen Dank für Deinen Besuch " + kunde1.ausgabeName());
            }
            
        }
    }
}
