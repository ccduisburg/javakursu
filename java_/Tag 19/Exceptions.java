package exceptions;

import java.util.Scanner;

/**
 *
 * @author Murat Vatandas
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * ArtithmeticException
         */
//        try{
//            int a = 20, b = 0;
//            int c = a/b;
//            System.out.println(c);
//        } catch (ArithmeticException e){
//            System.out.println("Eine Division durch 0 ist mathematisch nicht definiert");
//        }
//    }

        /**
         * IndexOfBoundException
         */
//        try{
//            String s = "Man ist das Wetter heute gut";
//            System.out.println(s.length());
//            char c = s.charAt(20); // Der Buchstabe e wird ausgegeben
//            System.out.println(c);
//            char ch = s.charAt(25);
//            System.out.println("Ich liege innerhalb des IndexOutOfBound");
//            char chars = s.charAt(30);
//        } catch (StringIndexOutOfBoundsException e){
//            System.out.println("Ich liege ausserhalb des IndexOutOfBound und daher der Fehler: StringIndexOutOfBoundException");
//        }
//    }
//        int a[] = new int[2];
//        try {
//            System.out.println("Access element three :" + a[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown  :" + e);
//        } finally {
//            a[0] = 6;
//            System.out.println("First element value: " + a[0]);
//            System.out.println("The finally statement is executed");
//        }
//    }

//        String meinString = "123";
//        int meinInteger = Integer.parseInt(meinString);
//        System.out.println(meinString + 7 + ": Die Zahl 7 wurde dem String nur angehängt");
//        System.out.println(meinInteger + ": Ich bin nur \"meinInteger\" ");
//        System.out.println(meinInteger + 7 + ": Nachdem ich zu einem Int geparst wurde, durfte ich hinzuaddiert werden" );
//    
        
        
//        String meinString2 = "123abc";
//        try{
//        int meinInteger2 = Integer.parseInt(meinString2);
//        System.out.println(meinString2 + 7 + ": Die Zahl 7 wurde dem String nur angehängt");
//        System.out.println(meinInteger2 + ": Ich bin nur \"meinInteger\" ");
//        System.out.println(meinInteger2 + 7 + ": Nachdem ich zu einem Int geparst wurde, durfte ich hinzuaddiert werden" );
//        } catch(NumberFormatException e){
//            System.err.println("Ds folgende konnte nicht ausgeführt werden");
//            System.out.println(meinString2);
//        }
//    }
   
//        try {
//            testFall();
//        } catch (DummeException e){
//            e.printStackTrace();
//        }
         //Neue EingabeException
        Scanner eingabe = new Scanner(System.in);
        int x = 1;
        do{
        try{
        System.out.println(" Bitte eine Zahl eigeben");
        int n1 = eingabe.nextInt();
        System.out.println(" Bitte gebe eine weitere Zahl ein");
        int n2 = eingabe.nextInt();
        int summe = n1/n2;
        System.out.println(summe);
        x = 2;
        } catch(Exception e){
            System.out.println("Das ist leider nicht erlaubt");
        }
        }while (x ==1);
    }
        
    }
//        public static void testFall() throws DummeException{
//            int i = 5 + 5;
//            if(i == 10){
//                throw new DummeException(); // Es 
//            }
//            System.out.println("Das passiert leider nie");
//        }
    


