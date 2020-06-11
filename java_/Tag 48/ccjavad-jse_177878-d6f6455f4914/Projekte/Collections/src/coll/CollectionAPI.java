package coll;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAPI {
    public static void main(String[] args) {
        
        Collection<Integer> coll = new ArrayList<>();
        
        Integer i1 = 22;
        coll.add(i1);           // OK
        //coll.add("hello");    // Compilerfehler (s. die Parametriesierung der Variable coll)

        coll.remove(i1);
        coll.remove("hello");
        
        
        coll.add(13);
        coll.add(14);
        
        boolean istElementGefunden = coll.contains("hello");
        System.out.println("hello gefunden: " + istElementGefunden);
        
        istElementGefunden = coll.contains(13);
        System.out.println("13 gefunden: " + istElementGefunden);
        
        
    }
}
