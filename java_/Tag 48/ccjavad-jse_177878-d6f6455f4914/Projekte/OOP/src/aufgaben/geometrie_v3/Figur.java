package aufgaben.geometrie_v3;

public abstract class Figur {
    int x, y;
    
    void bewegen(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    abstract double getFlaeche();
//    double getFlaeche() {
//        return -1;
//    }
}
