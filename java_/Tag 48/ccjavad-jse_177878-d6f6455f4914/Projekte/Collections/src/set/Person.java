package set;

public class Person implements Comparable<Person> {
    private String name;
    private int alter;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    @Override
    public int compareTo(Person p2) {
        int erg = name.compareTo(p2.name);
        return erg != 0 ? erg : alter - p2.alter;
    }

    /*
        - Korrekte hashCode liefert für gleiche Objekte denselben Hashcode
        - Sinnvolle hashCode sollte dieselben Attribute verwenden wie equals
    */
    @Override
    public int hashCode() {
        // return 7;                    // nicht sinnvoll, aber korrekt
        return name.hashCode() + alter; // sinnvoll
    }

    /*
        - Sinnvolle equals sollte die Objekte nach inhalten vergleichen
    */
    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof Person ) ) {
            return false;
        }
        
        Person p2 = (Person) obj;
        
        return alter == p2.alter && name.equals(p2.name);
    }

    @Override
    public String toString() {
        return name + " " + alter;
    }
    
}
