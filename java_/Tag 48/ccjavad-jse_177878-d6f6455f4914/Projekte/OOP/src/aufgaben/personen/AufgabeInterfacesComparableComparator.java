package aufgaben.personen;

import java.util.Arrays;
import java.util.Comparator;

class PersonReverseCmp implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.compareTo(o1);
    }
    
}

public class AufgabeInterfacesComparableComparator {

    public static void main(String[] args) {

        Person[] arr = {
            new Person("Paul", "Smith"),
            new Person("Paul", "Black"),
            new Person("John", "Smith"),
            new Person("John", "Black"),
        };
        
        print(arr);

          /*
            so in etwa wird die sort(Object[]) die Elemente
            aus dem Array vergleichen:
          */
//        Comparable c0 = (Comparable)arr[0];
//        if(c0.compareTo(arr[1]) > 0) {
//            //vertauschen
//        }

        Arrays.sort(arr); // aufsteigend 'natürlich'
        print(arr);
        
        
          /*
            so in etwa wird die sort(Object[], Comparator) die Elemente
            aus dem Array vergleichen:
          */
          
          /*
            Comparator mit der Toplevel-Klasse
          */
        //Comparator<Person> cmp = new PersonReverseCmp();
        
        /*
            oder mit der anonymen Klasse:
        */
//        Comparator<Person> cmp = new Comparator<Person>() {
//            public int compare(Person p1, Person p2) {
//                return p2.compareTo(p1);
//            }
//        };

        /*
            oder mit der Lambda:
        */
        Comparator<Person> cmp = (p1, p2) -> p2.compareTo(p1);
        Arrays.sort(arr, cmp); // alternative Sortierung
//        if(cmp.compare(e0, e1) > 0) {
//            //vertauschen
//        }

        print(arr);
        
        
        
        /*
            binarySearch(Object[], Object) geht von dem natürlich 
            sortiertem Array aus!
        */
        Arrays.sort(arr);
        print(arr);
        
        int pos = Arrays.binarySearch(arr, new Person("Paul", "Black"));
        System.out.println("pos von Paul Black: " + pos);
        
        pos = Arrays.binarySearch(arr, new Person("John", "Doe"));
        System.out.println("pos von John Doe: " + pos);

        
        /*
            binarySearch(Object[], Object, Comparator) geht von 
            dem sortiertem Array aus (Vergleiche mit dem Comparator)!
        */
        
        Arrays.sort(arr, cmp);
        print(arr);
        
        pos = Arrays.binarySearch(arr, new Person("Paul", "Black"), cmp);
        System.out.println("pos von Paul Black: " + pos);
    }
    
    
    static void print(Person[] arr) {
        System.out.println("------ Personen: ");
        for (Person person : arr) {
            System.out.println(person);
        }
    }
    
}
