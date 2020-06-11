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
public class DeineFehler extends Exception{
    public DeineFehler() {

  }

  public DeineFehler(String Kommentar) {

    super(Kommentar); // dikkat

  }
}
