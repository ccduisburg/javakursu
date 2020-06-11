package aufgaben.geometrie_v3;

public class Rechteck extends Figur {
    int breite, hoehe;

    public Rechteck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }
    
    double getFlaeche() {
        return breite * hoehe;
    }

    @Override
    public String toString() {
        return "Rechteck{" + "breite=" + breite + ", hoehe=" + hoehe + '}';
    }
    
}
