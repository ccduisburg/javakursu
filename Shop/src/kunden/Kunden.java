package kunden;

import java.time.LocalDate;
import java.util.Objects;

public class Kunden {

    //Attribute
    private String name;
    private String vorname;
    private LocalDate geburtstag;
    /**
     * enthält den Betrag in €, den der Kunde bezahlen muss
     */
    private double rechnung;
    private boolean darfKontaktiertWerden;
    
    public Kunden(){}
    
    public Kunden(String kundenName, String kundenVorname){
        this.name = kundenName;
        this.vorname = kundenVorname;
       }

    //Methoden
    public void nameEingeben(String kundenName) {
        name = kundenName;
    }
    public void vornameEingeben(String kundenVorname) {
        vorname = kundenVorname;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj == null)) {
            return false;
        }
        if (!(obj instanceof Kunden)) {
            return false;
        }
        if (!this.vorname.equals(((Kunden) obj).vorname)) {
            return false;
        }
        if (!this.name.equals(((Kunden) obj).name)) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.vorname);
        return hash;
    }
    public void bezahlen() {
        System.out.println("Die Rechnung beträgt aktuell " + rechnung + "€");
        rechnung = 0;
    }
    public void darfKontaktiertWerden() {
        //soll sagen of er kontaktiert werden darf
        //bezahlen
    }
    public String ausgabeName() {
        return vorname +" "+ name;
       
    }
}
