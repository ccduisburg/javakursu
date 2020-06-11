/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schiffeversenken;

import java.util.Scanner;

/**
 *
 * @author maggo
 */
public class ShipUserInteraction implements Interactive {

    private static final Scanner scn = new Scanner(System.in);

    //Methode, um Spielerwahl zu erfragen
    //TODO Schiffsplatzierung
    //Schiffklassen mit verschienden Formen?
    //spieler parent, shipAI extends
    //Interaktionsmethoden
    
    //TODO Interaktion auf Spieler Objekt, implements output
    @Override
    public int requestShot(FieldNode target) {

        //Text ausgeben für die Frage
        //Wert auslesen
        //-1=Wasser
        //-2=Treffer
        //-3=Versenkt
        int result = -1;

        //Klassisches Modell: A1, B2 usw.
        //A=41
        //TODO Korrekte Konvertierung und Code finden!
        final int wertVonA = 41;
        //String coord1 = (char) (wertVonA + target.getxCoord()) + "";

        String coord1 = target.getxCoord() + "";

        String coord2 = target.getyCoord() + "";

        boolean eingabeIstKorrekt = false;

        while (!eingabeIstKorrekt) {
            System.out.println("***********************");
            System.out.println("Schuss auf " + coord1 + " " + coord2);
            System.out.println("***********************");
            System.out.println();
            System.out.println("Was ist das ergebnis?");
            System.out.println("wasser/1, treffer/2, treffer versenkt/3?");

            String readLine = scn.nextLine().toLowerCase();

            /*
        Bedeutung der Zahlen:
        1 für wasser
        2 für treffer
        3 für treffer versenkt
             */
            switch (readLine) {

                case ("1"): {

                }

                case ("wasser"): {
                    result = -1;
                    eingabeIstKorrekt = true;
                    break;
                }

                case ("2"): {

                }

                case ("treffer"): {
                    result = -2;
                    eingabeIstKorrekt = true;
                    break;
                }

                //TODO Mehrere Eingaben möglich, Fallthrough für mehrere Eingaben
                //mit gleicher Bedeutung
                case ("3"): {

                }

                case ("treffer versenkt"): {

                }

                case ("versenkt"): {
                    result = -3;
                    eingabeIstKorrekt = true;
                    break;
                }

                default: {
                    //Falsche Eingabe, erneut abfragen
                    //TODO Abbruch mittendrin möglich machen?
                    System.out.println("Die Eingabe " + readLine + " wird nicht akzeptiert.");
                }
            }
        }

        return result;

    }

    /** Bis jetzt nur zu testzwecken
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //AiBoardStatus wuff=new AiBoardStatus(3,3);
        final int sizeX = 10, sizeY = 10;

        
        
        ShipAI wuff = new ShipAI(sizeX, sizeY, new ShipUserInteraction());

        wuff.testMethode();

        AiBoardStatus status = wuff.updateCoordPriorities();

        System.out.print("y= ");
        for (int y = 0; y < sizeY; y++) {
            System.out.print(y + "  ");
        }
        System.out.println();
        for (int x = 0; x < status.getSizeX(); x++) {
            System.out.print("  ");
            for (int y = 0; y < status.getSizeY(); y++) {
                int miau = status.getStatus(x, y);
                String blubb = status.getStatus(x, y) + " ";

                if (miau >= 0) {
                    blubb = "+" + blubb;
                }
                System.out.print(blubb);
            }
            System.out.println("x=" + x);
        }

        //System.out.println((char) (0065));
    }

}
