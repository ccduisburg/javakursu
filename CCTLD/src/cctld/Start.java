package cctld;

import java.util.Scanner;

/**
 *
 * @author André
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner eingabe = new Scanner(System.in);
        System.out.print("CCTLD eingeben: ");
        String usereingabe = eingabe.nextLine();
        int anzahl = usereingabe.length();
        
        switch(anzahl) {
            case 0:
                System.out.println("Sie haben die Eingabe vergessen.");
                break;
            case 1: 
                FunctionSet.laenderSucheMit1Buchstaben(usereingabe);
                break;
            case 2:
                FunctionSet.laenderSucheMit2Buchstaben(usereingabe);
                break;
            case 3:
                System.out.println("Ihre Eingabe ist zu lang!");
            default: 
                System.out.println("Bitte die Eingabe überprüfen.");
        }
    }
}
