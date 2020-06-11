
package samlungen;

public class Kunde {

    public Kunde(String name, double rechnungsBetrag) {
        this.name = name;
        this.rechnungsBetrag = rechnungsBetrag;
    }  
    
    
    public String getName() {
        return name;
    }

    public double getRechnungsBetrag() {
        return rechnungsBetrag;
    }
        
            private String name;
            private double rechnungsBetrag;

    public void setName(String name) {
        this.name = name;
    }

    public void setRechnungsBetrag(double rechnungsBetrag) {
        this.rechnungsBetrag = rechnungsBetrag;
    }

    
            
    
}
