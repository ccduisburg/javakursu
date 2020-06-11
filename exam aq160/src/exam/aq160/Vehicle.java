/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.aq160;

/**
 *
 * @author ckabakci
 */
public class Vehicle {
    int x;
    Vehicle(){
    this(10);
    }
    Vehicle(int x){
    this.x=x;
    }
}

class Car extends Vehicle {
int y;
Car(){    
super();

}
Car(int y){
this.y=y;
}
public String toStribg(){
return super.x+":"+this.y;
}
}
