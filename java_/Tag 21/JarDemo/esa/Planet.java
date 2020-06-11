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
public class Planet {
    private String name;
    private double masse;
    private double radius;
    public Planet(String name,double masse, double radius)
    {
    this.name=name;
    this.masse=masse;
    this.radius=radius;
    
    }
    public String getName(){
    return name;
    }
    
}
