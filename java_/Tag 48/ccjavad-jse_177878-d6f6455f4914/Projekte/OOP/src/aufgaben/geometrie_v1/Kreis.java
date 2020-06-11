package aufgaben.geometrie_v1;

public class Kreis {
    private int radius;

    public Kreis(int radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "Kreis. R = " + radius;
    }
    
}
