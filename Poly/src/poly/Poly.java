/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author ckabakci
 */
public class Poly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kangal kangal = new Kangal();
        System.out.println("KAngal: " + kangal.toString());
        Hund hund = new Hund();
        System.out.println("hund " + hund.toString());
        //Hund hund=dackel;
        Tier tier = kangal;//Jeder Hund ist ein Tier
        System.out.println("Kangal :" + kangal.toString() + "|| hund: " + hund.toString() + " || tier: " + tier.toString());
        tier = hund;//Jeder Dackel ist ein Tier Zuweiseung con rechst nach links!
        System.out.println("Kangal :" + kangal.toString() + "|| hund: " + hund.toString() + " || tier: " + tier.toString());
        hund = (Hund) tier;  //Jedes Tier ist ein Hund:Behauptung: das Objekt(!) das jetz mit tier angesprochen wird.
         System.out.println("Kangal :" + kangal.toString() + "|| hund: " + hund.toString() + " || tier: " + tier.toString());
        if (tier == kangal) {
            System.out.println("jo");
        } else {
            System.out.println("No");
        }
        System.gc();
    }

}

class Tier {
   @Override
    public String toString(){return "ICh bin ein Tier";}
}

class Hund extends Tier {
    @Override
    public String toString(){return "ICh bin ein Hund";}
}

class Kangal extends Hund {
    @Override
    public String toString(){return "ICh bin ein Kangal";}
}
