package aufgaben.geometrie_v4;

public class Kreis implements Figur {
    int radius;

    public Kreis(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Kreis{" + "radius=" + radius + '}';
    }
    
    public double getFlaeche() {
        return radius * radius * Math.PI;
    }
}
