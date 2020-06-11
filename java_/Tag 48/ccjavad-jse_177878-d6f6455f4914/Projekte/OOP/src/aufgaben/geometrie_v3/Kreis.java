package aufgaben.geometrie_v3;

public class Kreis extends Figur {
    int radius;

    public Kreis(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Kreis{" + "radius=" + radius + '}';
    }
    
    
    double getFlaeche() {
        return radius * radius * Math.PI;
    }
}
