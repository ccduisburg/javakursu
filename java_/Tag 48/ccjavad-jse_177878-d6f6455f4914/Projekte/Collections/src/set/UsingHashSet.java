package set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UsingHashSet {
    
    public static void main(String[] args) {
//        testStrings();
//        testIntegers();

        testPersonen();
    }
    
    static void testPersonen() {
        
        Person p1 = new Person("Tom", 5);
        
        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p1);
        System.out.println("p1.hashCode: " + p1.hashCode());
        System.out.println("1. size: " +set.size());
        
        Person p2 = new Person("Tom", 5);
        set.add(p2);
        
        System.out.println("2. size: " + set.size());
        System.out.println("p2.hashCode: " + p2.hashCode());
        
    }
    
    
    static void testIntegers() {
        Set<Integer> set = new HashSet<>();
        
        set.add(11);
        set.add(11);
        set.add(11);
        set.add(11);
        
        System.out.println("1. size: " + set.size()); // 1
        
        set.add(new Integer(11));
        
        System.out.println("2. size: " + set.size()); // 1
        
        set.add(-7);
        set.add(99);
        set.add(-13);
        set.add(17);
        
        System.out.println("3. size: " + set.size()); // 5
        
        System.out.println("set: " + set); // keine Ordnung
    }

    static void testStrings() {
        Collection<String> set = new HashSet<>();
        
        set.add("aa");
        set.add("aa");
        set.add("aa");
        set.add("aa");
        
        System.out.println("1. size: " + set.size()); // 1
        
        set.add(new String("aa"));
        System.out.println("2. size: " + set.size()); // 1
        
        set.add("hh");
        set.add("nn");
        set.add("pp");

        System.out.println("3. size: " + set.size()); // 4
        
        System.out.println("set: " + set); // keine Ordnung (wenn schon, dann nur zufällig)
    }
}
