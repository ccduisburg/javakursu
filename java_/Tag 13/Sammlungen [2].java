/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammlungen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
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
        /*Object[] objs = new Object[3];
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
        System.out.println("Der neue Buchstab ist: "+c1);*/
 /* Object[] objsVergleich = new Object[3];
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
        }
       sammlung1.add(3);
       Integer wr = new Integer(2);
       int test=Integer.valueOf("3");
      // int array[2];
       int array[] = new int[2];
       array[0]=20;

        List sammlung2 = new ArrayList();
        sammlung2.add("Hallo");
        sammlung2.add("Welt");
        sammlung2.add(3.1415);
        sammlung2.add(new Scanner(System.in));
        Scanner eingabe = new Scanner(System.in);
        sammlung2.add(eingabe);
        double e = Math.E;
        sammlung2.add(3, e);
        System.out.println("Anzahl der Elemente in sammlung2" + sammlung2.size());
        for (int i = 0; i < sammlung2.size(); i++) {
            System.out.println("Das Element mit dem Index " + i + " ist: " + sammlung2.get(i));
        }
        sammlung2.remove(sammlung2.size() - 1);
        for (int i = 0; i < sammlung2.size(); i++) {
            System.out.println("Das Element mit dem Index " + i + " ist: " + sammlung2.get(i));
        }
        for (int i = 0; i < sammlung2.size(); i++) {
            if (sammlung2.get(i).equals("Welt")) {
                sammlung2.remove(i);
            }
        }
        for (int i = 0; i < sammlung2.size(); i++) {
            System.out.println("Das Element mit dem Index " + i + " ist: " + sammlung2.get(i));
        }
        int i = sammlung2.indexOf("Hallo");
        System.out.println("Das Element \"Hallo\" ist an der Stelle " + i);
        i = sammlung2.indexOf("XXX");
        System.out.println("Das Element \"XXX\" ist an der Stelle " + i);
        Kunde wichtig = new Kunde("Justus Jonas",-1000);
        Kunde interessant = new Kunde ("Peter Shaw",0);
        Kunde langweilig = new Kunde ("Bob Andrews",100);
        List alleKunden = new ArrayList();
        alleKunden.add(wichtig);
        alleKunden.add(interessant);
        alleKunden.add(langweilig);
        alleKunden.add("Hans im Glück");//Wollte ich eigentlich nicht :(
        alleKunden.add(new Kunde ("Hans im Glück",0));
        for(Object o : alleKunden){
            System.out.println("Kundengutehaben ist: "+((Kunde)o).getRechnungsBetrag());
        }
        List<Kunde> alleKunden = new ArrayList<>();//Generics
        Kunde wichtig = new Kunde("Justus Jonas", -1000);
        Kunde interessant = new Kunde("Peter Shaw", 0);
        Kunde langweilig = new Kunde("Bob Andrews", 100);
        Stammkunde gaehn = new Stammkunde(10, "Walter", -10);
        alleKunden.add(wichtig);
        alleKunden.add(interessant);
        alleKunden.add(langweilig);
        alleKunden.add(gaehn);
        //alleKunden.add("Hans im Glück");Nicht möglich Kpmpiler kontrolliert den Typ
        alleKunden.add(new Kunde("Hans im Glück", 0));
        for (Kunde o : alleKunden) {
            System.out.println("Kundengutehaben ist: " + -o.getRechnungsBetrag());
        }*/
        //Übung: Verwendung des Konstruktors: public ArrayList(int initialCapacity)
       // List<Kunde> alleKunden = new ArrayList<>();//Generics
       /* Set <Kunde> alleKunden = new TreeSet<>();
        Kunde wichtig = new Kunde("Justus Jonas", -1000);
        Kunde interessant = new Kunde("Peter Shaw", 0);
        Kunde langweilig = new Kunde("Bob Andrews", 100);
        
        alleKunden.add(wichtig);
        alleKunden.add(interessant);
        alleKunden.add(langweilig);
        System.out.println("Ganz ganz viel passiert...");
        alleKunden.add(interessant);
        
        for(Kunde k : alleKunden){
            System.out.println("Lieber Kunde "+ k.getName()+ " bitte kauf mal wieder, dein aktueller Rechnungsbtrag ist: "+k.getRechnungsBetrag());
        }
        
       Set<String> namen = new TreeSet<>();
       namen.add("Justus");
       namen.add("Peter");
       namen.add("Bob");
       namen.add("Peter");
       namen.add("30");
       namen.add("5");
        
       for(String name: namen){
           System.out.println("Name ist: "+name);
       }
       Set<Integer> zahlen = new TreeSet<>();
       zahlen.add(17);
       zahlen.add(3);
       zahlen.add(5);
       zahlen.add(new Integer(3)); 
       for(Integer i : zahlen){
           System.out.println(": "+i);
       }
      */
       Map<Integer,String> sammlung3 = new TreeMap<>();//Assosative Array
       sammlung3.put(17,"C");
       sammlung3.put(3, "D");
       sammlung3.put(1, "A");
       sammlung3.put(2, "B");
       sammlung3.put(4, "A");
       sammlung3.put(3,"?");
       for(String s : sammlung3.values()){
           System.out.println("Wert: "+s);
       }
       Map<String, Kunde> meineKunden = new HashMap<>();
       meineKunden.put("ID 1", new Kunde("Justus",20));
       List<Stammkunde> frageStammkunde = new ArrayList<>();
       List<? extends Kunde> frageKunde = new ArrayList<>();
       frageKunde=frageStammkunde;
       
       Kunde k;
       Stammkunde sk=null;
       k=sk;
       testFrage(frageKunde);
       testFrage(frageStammkunde);
    }
    public static void testFrage(List<? extends Kunde> kListe){
        for(Kunde k: kListe){
            ((Stammkunde)k).getRechnungsBetrag();
        }
    } 
}
