/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samlungen;

/**
 *
 * @author ckabakci
 */
public class Stamkunde extends Kunde {
    private int bonus;

    public Stamkunde(String name, double rechnungsBetrag) {
        super(name, rechnungsBetrag);
    }

    public Stamkunde(int bonus, String name, double rechnungsBetrag) {
        super(name, rechnungsBetrag);
        this.bonus = bonus;
    }
    
    
}
