/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esa;

/**
 *
 * @author ckabakci
 */
public enum PlanetenImSonnensystem {
    MERKUR(0,0), VENUS(1,2), ERDE(2,2),MARS(3,3),JUPITER(4,4),SATURN(5,5),URANUS(6,6),NEPTUN(7,7);
    private final double masse;
    private final double radius;
    public static final double G =6.67300E-11;
    
   private  PlanetenImSonnensystem(double masse,double radius){
    this.masse=masse;
    this.radius=radius;
    }
   public double oberflaechenSchwerkraft(){
   return G*masse/(radius*radius);
   }
   
   public double oberflachenGewicht(double gewicht){
   return gewicht*oberflaechenSchwerkraft();
   }
  @Override
   public String toString(){
   String besser =super.toString();//Enum da toString @Override önceden yapildigi icijn. Biz burda onu enumdan tekrar cagiriyoruz
   besser=besser.toLowerCase();
   String eb=besser.substring(0,1);
   eb=eb.toUpperCase();
   besser=besser.replaceFirst(besser.substring(0,1),eb);
       return besser;
   }
}
