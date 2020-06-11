package aufgaben.personen;

public class Person implements Comparable<Person> {

    private String vorname, nachname;

    public Person() {
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }
    
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }

    /*
        p1 = new Person("Paul", "Smith"),
        p2 = new Person("Paul", "Black"),
        p1.compareTo(p2)
    */
    @Override
    public int compareTo(Person p2) {
        int erg = nachname.compareTo(p2.nachname);
        
        if(erg==0) {
            erg = vorname.compareTo(p2.vorname);
        }
        
        return erg;
    }
    
    
}
