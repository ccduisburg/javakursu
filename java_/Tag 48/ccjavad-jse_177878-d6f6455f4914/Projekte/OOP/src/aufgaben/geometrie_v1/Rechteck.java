package aufgaben.geometrie_v1;

public class Rechteck {

    public static void anpassen(Rechteck r, int neueBreite, int neueHoehe) {
        r.breite = neueBreite;
        r.hoehe = neueHoehe;
    }
    
    
    private int breite, hoehe;

    public Rechteck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }
    
    @Override
    public String toString() {
        return "Rechteck " + breite + " X " + hoehe;
    }
    
    public void anpassen(int neueBreite, int neueHoehe) {
//        Rechteck r = this;
//        r.breite = neueBreite;
//        r.hoehe = neueHoehe;
        breite = neueBreite;
        hoehe = neueHoehe;
    }
}
