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
public interface Maus {
    
    void klaut();
    default void dasKlapptso(){
        System.out.println("Hier spricht den Interface");
    }
    
    
}
