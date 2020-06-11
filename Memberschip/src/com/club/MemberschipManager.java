/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.club;

/**
 *
 * @author CC-Student
 */
public abstract class MemberschipManager {// Standart
   
    public abstract Member createMember(String type);//Factory Method
   public void createMembershipManager(String type){
    Member m;
    m=createMember("AnnualMember");
    m.register();
    m.notitfy();
    }
    
}
