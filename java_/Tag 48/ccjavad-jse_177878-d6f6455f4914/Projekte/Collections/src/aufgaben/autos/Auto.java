package aufgaben.autos;

public abstract class Auto {
    protected String modell;
    protected int baujahr;

    public Auto(String modell, int baujahr) {
        this.modell = modell;
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        String hersteller = getClass().getSimpleName();
        return hersteller + ". Modell: " + modell + ", Baujahr: " + baujahr;
    }
    
    @Override
    public int hashCode() {
        return baujahr + modell.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        
        if( !(obj instanceof Auto ) ) {
            return false;
        }
        
        if( getClass() != obj.getClass() ) {
            return false;
        }
        
        Auto a2 = (Auto)obj;
        return modell.equals(a2.modell) && baujahr == a2.baujahr;
    }
    
}
