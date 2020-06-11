/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babies;

/**
 *
 * @author ckabakci
 */
public class BabyFeed {
    public void BabyFeed(BabyFood babyfood) throws CantEatException{

        if (babyfood.getFoodName().equalsIgnoreCase("Türkische Kaffe")) {
         
            
               
                throw new CantEatException();
           
        }
        System.out.println("I want to feed My Chield with " + babyfood.getFoodName());
    }
    
}
