package func;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
    Aufgabe:

    Eine Hilfsklasse 'StringTransform' erstellen, die die
    gewünschten String-Transformationen vordefinieren lässt,
    um die so vorgefertigte Transformationen mit jedem beliebigen
    String durchzuführen.
*/

class StringTransform {
    
    private List< Function<String, String> > transformations = new ArrayList<>();
    
    public StringTransform addTransformation(Function<String, String> t) {
        transformations.add(t);
        return this;
    }
    
    public String process(String in) {
        for( Function<String, String> t : transformations ) {
            in = t.apply(in);
        }
        
        return in;
    }
}

public class B06_Aufgeschobene_Auswertung {

    public static void main(String[] args) {
        
        StringTransform t1 = new StringTransform()
        // Transformations-Einstellungen:
                .addTransformation( s -> s.toUpperCase() )
                .addTransformation( s -> s + "!" );
        
        String s = t1.process("Hallo");
        System.out.println("s = " + s);
        
        s = t1.process("Java ist toll");
        System.out.println("s = " + s);
    }
}
