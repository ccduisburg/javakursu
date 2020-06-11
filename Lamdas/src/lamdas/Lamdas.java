/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamdas;

/**
 *
 * @author ckabakci
 */
public class Lamdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lamdas l=new Lamdas();
        l.essenVerboten(d->{
        if(d.equals("China"))
                {
                    System.out.println("Es kommt nur auf die Gewürze an");
                
                }
        else{
                System.out.println("bähhhh");
        }
        });
        l.bemerken(katze->{
        if(katze.equals("Kitty")) return -7;
                else return 20;
        
        });
        
    }
    public void essenVerboten(Hund h){
    h.schmeckt("China");
    }
    
    public void bemerken(Katze k){
    int i = k.nervt("Kitty");
    }
    
    public void aufpassen(Maus m){
    m.klaut();
    
    }
}
