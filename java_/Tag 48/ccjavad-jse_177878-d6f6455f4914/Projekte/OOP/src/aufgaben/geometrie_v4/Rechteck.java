package aufgaben.geometrie_v4;

public class Rechteck implements Figur {
    int breite, hoehe;

    public Rechteck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }
    
    public double getFlaeche() {
        return breite * hoehe;
    }

    @Override
    public String toString() {
        return "Rechteck{" + "breite=" + breite + ", hoehe=" + hoehe + '}';
    }
    
}
