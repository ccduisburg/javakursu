/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionbeispiele;

/**
 *
 * @author ckabakci
 */
public class MeineFehler extends Exception {   
        
  private int nummer ; 

  public MeineFehler() {

  }

  public MeineFehler(String Kommentar) {

    super(Kommentar); // dikkat

  }

  public MeineFehler(String Kommentar , int Nummer) {

    super(Kommentar); //dikkat

    this.nummer = Nummer ;

  }


  public String getLocalizedMessage() { // iptal etme (override)

          

    switch(nummer) {

      case 0 : return " kein Problem " ;

      case 1 : return " Fehler " ;

      case 2 : return "! wichtige Fehler !" ; 

      default: return " unbekante Fehler ";

    }

  }
  public int getNummer() {

    return nummer;

  }

}
    

