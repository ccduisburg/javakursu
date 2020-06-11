package vererbung;

class OS {
    String name;

    public OS(String name) {
        this.name = name;
    }
}

class Linux extends OS {
    // default-Konstruktor:
    // Linux() {
    //   super();   // <- der eigentliche Compilerfehler
    // }
}

public class B05_Konstruktoren_exam {

}
