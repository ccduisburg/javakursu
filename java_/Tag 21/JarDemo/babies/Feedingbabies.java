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
public class Feedingbabies extends BabyFood {
    protected BabyFood[] food =new BabyFood[3];
    
    public Feedingbabies (String foodname){
    super(foodname);
    }
    
    public void Feedbaby(){
    
    food[0]=new BabyFood("Milsch");
    food[1]=new BabyFood("Water");
    food[2]=new BabyFood("Türkische Kaffe");
    BabyFeed fd=new BabyFeed();
    for (BabyFood f:food){
        try
        {
        fd.BabyFeed(f);
         System.out.println(" My Babby is drinking "+f.getFoodName());
        }catch(CantEatException e){
        System.out.println("Fehler: "+e.getMessage());
        }
    
    
    }
    
    }
}


    