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
public class Memberschip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MemberschipManager mm=new IstanbulMembershipManager();
       Member  kk= mm.createMember("LifeTime");
       // mm.createMembershipManager("LifeTime");
       kk.notitfy();
    }
    
}
