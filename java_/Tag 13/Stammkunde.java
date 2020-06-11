/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammlungen;

/**
 *
 * @author Sanne
 */
public class Stammkunde extends Kunde{
    private int bonus;

    public Stammkunde(String name, double rechnungsBetrag) {
        super(name, rechnungsBetrag);
    }

    public Stammkunde(int bonus, String name, double rechnungsBetrag) {
        super(name, rechnungsBetrag);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
}
