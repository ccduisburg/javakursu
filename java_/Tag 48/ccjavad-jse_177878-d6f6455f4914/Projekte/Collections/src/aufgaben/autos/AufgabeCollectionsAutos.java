package aufgaben.autos;

import java.util.*;

public class AufgabeCollectionsAutos {
    public static void main(String[] args) {
        /*
            A2, A3
        
            VW. Modell: Golf, Baujahr 1990
            BMW. Modell: Z4, Baujahr 2000
        */
        VW vw1 = new VW("Golf", 1990);
        VW vw2 = new VW("Polo", 2011);
        VW vw3 = new VW("Golf", 1977);
        System.out.println(vw1);
        
        BMW bmw1 = new BMW("Z4", 2000);
        BMW bmw2 = new BMW("Z6", 2015);
        System.out.println(bmw1);
        
        /*
            A4, A5
        */
        LinkedList<VW> listVW = new LinkedList<>();
        listVW.add(vw1);
        listVW.add(vw2);
        listVW.add(vw3);
        
        print(listVW); // <? extends Auto> = <VW>;
        
        HashSet<VW> setVW = new HashSet<>(listVW);
        setVW.add(new VW("Golf", 1990));
        
        print(setVW);
        
        /*
            A6
        */
        ArrayList<BMW> listBMW = new ArrayList<>();
        listBMW.add(bmw1);
        listBMW.add(bmw2);
        
        print(listBMW);
        
        HashSet<BMW> setBMW = new HashSet<>();
        setBMW.addAll(listBMW);
        
        print(setBMW);
        
        /*
            A7, A8
        */
        System.out.println("### A7, A8");
        System.out.println("bmw1: " + bmw1);
        
        boolean gefunden = setBMW.contains(bmw1);
        System.out.println("setBMW.contains(bmw1): " + gefunden); // true
        
        bmw1.setBaujahr(3000);
        System.out.println("nach bmw1.setBaujahr(3000)");
        
        gefunden = setBMW.contains(bmw1);
        System.out.println("setBMW.contains(bmw1): " + gefunden); // false
        
        /*
            A9, A10, A11
        */
        System.out.println("### A9, A10, A11");
        listVW.add(0, new VW("Polo", 2200));
        
        Collections.sort(listVW); // muss seine, wenn binarySearch verwendet wird
        print(listVW);

        // List<? extends Comparable<? super T>> list = LinkedList<VW>
        int pos = Collections.binarySearch(listVW, new VW("Polo", 2200));
        
        System.out.println("Polo 2200. pos = " + pos);
        
        
        /*
            A12
        */
        System.out.println("### A12");
        Comparator<VW> cmp = Collections.reverseOrder();
        Collections.sort(listVW, cmp);
        
        print(listVW);
        
        /*
            A13, A14
        
            Achtung! Falls die Liste nicht natürlich sortiert wurde
        */
        pos = Collections.binarySearch(listVW, new VW("Polo", 2200), cmp);
        System.out.println("Polo 2200. pos = " + pos);
        
        pos = Collections.binarySearch(listVW, new VW("Polo", 3300), cmp);
        System.out.println("Polo 3300. pos = " + pos);

    } // end of main
    
    private static void print(Collection<? extends Auto> autos) {
        
        // autos.add(new VW("", 0));
        // autos.add(new BMW("", 0));
        
        System.out.println("*** Collection: " + autos.getClass());
        
        for( Object a : autos ) {
            System.out.println(a);
        }
    }
}
