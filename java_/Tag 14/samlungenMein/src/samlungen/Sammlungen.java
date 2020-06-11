/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samlungen;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Sanne
 */
public class Sammlungen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Object[] objs = new Object[3];
        System.out.println("Objs hat aktuell "+ objs.length + " Elemente");
        Collection  sammlung1 = new ArrayList();
        System.out.println("Sammlung1 hat aktuell: "+sammlung1.size()+" Elemente");
        sammlung1.add("Hallo");
        sammlung1.add(objs);
        System.out.println("Sammlung1 hat aktuell: "+sammlung1.size()+" Elemente");
        sammlung1.add("Hallo");
        System.out.println("Sammlung1 hat aktuell: "+sammlung1.size()+" Elemente");
        sammlung1.add(objs);
        System.out.println("Sammlung1 hat aktuell: "+sammlung1.size()+" Elemente");
        for(Object o : sammlung1){
            System.out.println("Element in der Sammlung1: "+o);
        }
        //sammlung1.add(3.1415);//?? Wieso klappt das? 3.1415 ist double, kein Objekt
        //Wrapper-Klassen
        //Wrapper Double
       /* Double wrapperPi = new Double(3.1415);
        System.out.println("Der Wert von wrapperPi ist: "+wrapperPi.doubleValue());
        double pi = wrapperPi.doubleValue();
        wrapperPi = new Double("3.1415");
        wrapperPi = 3.1415;//Autoboxing
        pi = wrapperPi;//Autounboxing
        double quadrat = wrapperPi * wrapperPi;
        //Wrapper zu float
        Float f = new Float(2.34);
        //Wrapper zu int:
        Integer zahl = new Integer("0345");
        int zahlInt = 0x345abf;
        System.out.println("Neue Zahl ist: "+ zahl);
        System.out.println("Neue Zahl ist: "+ zahlInt);
        zahl=new Integer('a');
        System.out.println("Neue Zahl ist: "+ (char)zahl.intValue());
        Character c1 = new Character('x');
        System.out.println("Der neue Buchstab ist: "+c1);
       Object[] objsVergleich = new Object[3];
       boolean b = sammlung1.contains(objsVergleich);
       System.out.println("Ist hallo in der Sammlung? "+b);
       sammlung1.remove(objs);
       for(Object o : sammlung1){
            System.out.println("Element in der Sammlung1: "+o);
        }
       sammlung1.remove(objs);
       for(Object o : sammlung1){
            System.out.println("Element in der Sammlung1: "+o);
        }
        System.out.println(sammlung1.remove("Welt"));
       for(Object o : sammlung1){
            System.out.println("Element in der Sammlung1: "+o);
        }*//*
        List sammlung2 = new ArrayList();
        sammlung2.add("Hallo");
        sammlung2.add("Welt");
        sammlung2.add(3.1415);
        sammlung2.add(new Scanner(System.in));
        Scanner eingabe = new Scanner(System.in);
        sammlung2.add(eingabe);
        System.out.println("Anzahl der Elemente in sammlung2 " + sammlung2.size());
        for (int i = 0; i < sammlung2.size(); i++) {

            System.out.println("Das Element mit dem Index " + i + "ist: " + sammlung2.get(i));
        }
        sammlung2.remove(sammlung2.size() - 1);
        for (int i = 0; i < sammlung2.size(); i++) {

            System.out.println("Das Element mit dem Index " + i + "ist: " + sammlung2.get(i));
        }

        for (int i = 0; i < sammlung2.size(); i++) {
            if (sammlung2.get(i).equals("Welt")) {
                sammlung2.remove(i);
            }

        }
        for (int i = 0; i < sammlung2.size(); i++) {

            System.out.println("Das Element mit dem Index " + i + "ist: " + sammlung2.get(i));
        }

        int i = sammlung2.indexOf("Hallo");
        System.out.println("Das Element \"Hallo\" ist an der Stelle: " + i);
          i = sammlung2.indexOf("XXX");
        System.out.println("Das Element \"Hallo\" ist an der Stelle: " + i);
        
      //  ----------------------------Kunde---------------
        Kunde wichtig =new Kunde("Justus Jonas",-1000);
        Kunde interressant=new Kunde("Peter Shaw",0);
        Kunde langweilig=new Kunde("Bob Andrews",100);
        
        Stamkunde gaehn=new Stamkunde(10,"Walter",-10);
        List<Kunde> alleKunden=new ArrayList<Kunde>();
        alleKunden.add(wichtig);
        alleKunden.add(interressant);
        alleKunden.add(langweilig);
       // alleKunden.add("Hans im Glück");
        alleKunden.add(new Kunde("Hans Göteller",5));
        
        for(Kunde o:alleKunden){
        
            System.out.println("Kundenguthaben ist: "+o.getRechnungsBetrag());
        }
        *//*
        Set<String> namen=new TreeSet<>();
        namen.add("Justus");
        namen.add("Peter");
        namen.add("Bob");
        namen.add("Peter");
       
        for(String name:namen){
        
            System.out.println("Name ist: "+name);
        }
         Set <Integer> n= new TreeSet<>();
           n.add(10);
           n.add(0);
           n.add(11);
           n.add(new Integer(3));
        
        for(Integer i:n){
        
            System.out.println("Name ist: "+i);
        }
        Map<Integer,String> sammlung3=new HashMap<>();
        
        sammlung3.put(17, "C");
        sammlung3.put(3,"D");
        sammlung3.put(1, "A");
        sammlung3.put(2,"B");
        sammlung3.put(4,"A");
        sammlung3.put(3,"?");
        for(String s: sammlung3.values()){
            System.out.println("Wert: "+s);
        
        }
        
        Map<String,Kunde> meineKunden=new HashMap<>();
        meineKunden.put("ID 1", new Kunde("Justus", 20));// Kunde class oldugu icin input bu sekilde yapiyoruz.
        */
        
        
        Customer kunde1=new Customer("Justus","Jonas",LocalDate.parse("1990-02-17"));
        Customer kunde2=new Customer("Justus","Jonas",LocalDate.of(1990,02,17));
         Customer kunde3=new Customer("Justus","Jonas",LocalDate.of(1990,02,17));
        if(kunde1==kunde2){
            System.out.println("Die beiden Kunden sind gleich ");
        }
        else
        {
            System.out.println("==:Die beiden Kunden sind verschieden ");
            System.out.println("Kunde 1: "+kunde1);
            System.out.println("Kunde 1: "+kunde2);
            if(kunde1.equals(kunde2))
                System.out.println("Equals: Die beiden Kunden sind gleich ");
            else
                System.out.println("Equals: Die beiden Kunden sind doch ziemlich verschieden ");
            System.out.println("Hash Code von Kunde 1: "+kunde1.hashCode());
             System.out.println("Hash Code von Kunde 2: "+kunde2.hashCode());
             System.out.println("Hash Code von Kunde 2: "+kunde3.hashCode());
        }
    }

}
