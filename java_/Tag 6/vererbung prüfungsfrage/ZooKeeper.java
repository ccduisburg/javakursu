package tag8;

class Mammal {

    private String name = "furry ";

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    String makeNoise() {
        return "generic noise";
    }
}

class Zebra extends Mammal {

    String name;//="stripes ";
    
    public String getName(){
        return this.name;
    }

    String makeNoise() {
        return "bray " + name;
    }

    Zebra() {
        super();

        this.name = "Stripes"; //zebra

    }
}

public class ZooKeeper {

    public static void main(String[] args) {
        new ZooKeeper().go();
    }

    void go() {
        Mammal m = new Zebra();
        System.out.println(m.getName());
        System.out.println(m.getName() + " " + m.makeNoise());
    }
}
/*
Mögliche Antworten:

-furry bray**
-stripes bray
-furry generic noise
-stripes generic noise
-comp fails
-exception at runtime
*/
