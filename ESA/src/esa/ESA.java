/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esa;
import static esa.PlanetenImSonnensystem.ERDE;
/**
 *
 * @author ckabakci
 */
public class ESA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Planet pluto=new Planet("Pluto",0,0);
        for (PlanetenImSonnensystem plan:PlanetenImSonnensystem.values()){
            System.out.println("Planet: "+plan);
            System.out.println("Datentyp: "+plan.getClass());
        
        }
      PlanetenImSonnensystem test=PlanetenImSonnensystem.ERDE;*/
        
        double gewichtAufDerErde = 75;
        double masse = gewichtAufDerErde / PlanetenImSonnensystem.ERDE.oberflaechenSchwerkraft();
        
        for (PlanetenImSonnensystem planet : PlanetenImSonnensystem.values()) {
            System.out.println("Auf Dem Planeten " + planet.toString() + " wiegst du " + planet.oberflachenGewicht(masse)+" kg");
        }
    }
    
}
