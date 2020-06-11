/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammlungen;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Sanne
 */
public class Sammlungen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] objs = new Object[3];
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
        }
    }
    
}
