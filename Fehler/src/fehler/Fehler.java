/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fehler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author ckabakci
 */
public class Fehler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] texte=new String[3];// 1 Objekt, 3+1 Referencen
      //  texte[1]="";
      //  texte[4]="";
      //  System.out.println("In texte[0] steht: "+texte[0].toUpperCase());
       double i=1, j=0;
       
      try{
          FileInputStream fs=new FileInputStream("datei.dat");
          System.out.println("Der Anfang des Try-Catch-Blocks");
      double div=i/j;
      texte[0]="";
          System.out.println("In texte[0] steht: "+texte[0].toUpperCase());
      System.out.println(": "+div);
      int test=Integer.parseInt("a");
      for(;;){  
      System.out.println("XXX");
      break;
      }
    }
     catch(ArithmeticException ae){ 
         
         System.out.println("Folgende Fehler ist aufgetaucht "+ae.getMessage());
     }catch(NullPointerException ne){
          System.out.println("So nicht, bitte erst mal Objecte zuweisen");
     }
     
      catch(NumberFormatException ne){
          System.out.println("Bitte nur Ziffern eingeben: "+ne.getMessage());
      
      } 
      catch(FileNotFoundException e){//Bu exception en sonda yazilmali.
          System.out.println("Unbekanter Fehler "+e.getMessage()+" "+e.getClass().getName());
      }
      finally{
          System.out.println("Egal ob Fehler oder nicht, das kommt immer ");
      }
      System.out.println("Mein Program wird nicht durch die Ausname beendet, sondern weil alle passiert ist,");
    }
}
