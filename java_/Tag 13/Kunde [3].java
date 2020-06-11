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
public class Kunde {
    private String name;
    private double rechnungsBetrag;

    public Kunde() {
    }

    public Kunde(String name, double rechnungsBetrag) {
        this.name = name;
        this.rechnungsBetrag = rechnungsBetrag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRechnungsBetrag() {
        return rechnungsBetrag;
    }

    public void setRechnungsBetrag(double rechnungsBetrag) {
        this.rechnungsBetrag = rechnungsBetrag;
    }
    
    
}
