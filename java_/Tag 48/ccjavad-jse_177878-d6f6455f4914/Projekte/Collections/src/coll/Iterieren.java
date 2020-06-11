package coll;

import java.util.*;

public class Iterieren {
    
    public static void main(String[] args) {
        
        Collection<String> coll = new ArrayList<>();
        
        coll.add("a");
        coll.add("b");
        coll.add("c");
        
        
        System.out.println("--- mit foreach iterieren: ");
        for(String s : coll) {
            System.out.println(s);
        }
        
        System.out.println("--- mit dem Iterator iterieren: ");
        Iterator<String> it = coll.iterator();
        while( it.hasNext() ) {
            String s = it.next();
            System.out.println(s);
        }

    }

}
