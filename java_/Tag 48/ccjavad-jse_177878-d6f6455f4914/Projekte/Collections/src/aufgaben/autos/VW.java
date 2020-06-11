package aufgaben.autos;

public class VW extends Auto implements Comparable<VW>{

    public VW(String modell, int baujahr) {
        super(modell, baujahr);
    }
    
    @Override
    public int compareTo(VW vw2) {
        int erg = modell.compareTo(vw2.modell);
        
        if(erg==0) {
            erg = baujahr - vw2.baujahr;
        }
        
        return erg;
    }
    
}
