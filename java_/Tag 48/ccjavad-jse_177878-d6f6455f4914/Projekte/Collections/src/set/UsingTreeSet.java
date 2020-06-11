package set;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

/*
    - TreeSet braucht Comparable-Elemente (oder Comparator).
    - TreeSet verwendet keine equals, sonder nur compareTo (oder compare)
*/
public class UsingTreeSet {

    public static void main(String[] args) {
//        mitInteger();
//        mitPersonen();

        mitStringsUndComparator();
    }

    static void mitStringsUndComparator() {
//        Comparator<String> cmp = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s2.compareTo(s1);
//            }
//        };
        
        Comparator<String> cmp = (s1, s2) -> s2.compareTo(s1);
        TreeSet<String> set = new TreeSet<>(cmp);
        
        set.add("aa");
        set.add("aa");
        set.add("aa");
        set.add("mm");
        set.add("ff");
        
        System.out.println("set: " + set); // [mm, ff, aa]
    }
    
    static void mitPersonen() {
        TreeSet<Person> set = new TreeSet<>();
        
        set.add(new Person("Tom", 22));
        set.add(new Person("Tom", 22));
        set.add(new Person("Tom", 22));
        
        System.out.println("1. size: " + set.size()); // 1
        
        set.add(new Person("Jerry", 3));
        set.add(new Person("Tom", 2));
        
//        Consumer<Person> consumer = new Consumer<Person>() {
//            @Override
//            public void accept(Person p) {
//                System.out.println(p);
//            }
//        };
        
//        Consumer<Person> consumer = (Person p) -> {
//                                        System.out.println(p);
//                                    };
        
        Consumer<Person> consumer = p -> System.out.println(p);

        set.forEach(consumer);
    }
    
    static void mitInteger() {
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(22);
        set.add(22);
        set.add(22);
        set.add(22);
        
        System.out.println("1. size: " + set.size());
        
        set.add(-4);
        set.add(543);
        set.add(2);
        
        System.out.println("2. size: " + set.size());
        
        System.out.println("set: " + set); // sortiert!
    }
}
