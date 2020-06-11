package vererbung;
/**
 * Beim Implementieren einer abstrakten Methode
 * und beim Überschreiben gelten folgende Regeln:
 * 
 * - Sichtbarkeit darf nicht verschärft werden
 * - Rückgabetyp darf nicht geändert werden (s. auch Kovarianz)
 * - Keine zusätzliche (breitere, allgemeinere) checked Exceptions
 *   dürfen deklariert werden
 * 
 */

/*
    implementieren
*/
interface Vergleichbar {
    int vergleicheMit(Vergleichbar v2);
}

class Auto implements Vergleichbar {

    @Override
    public int vergleicheMit(Vergleichbar v2) {
        return -1;
    }
}


/*
    überschreiben
*/
class Tier {
    void laufen() {
    }
}

class Hund extends Tier {

    @Override
    void laufen() {
    }
}

public class B03_overriding {

}
