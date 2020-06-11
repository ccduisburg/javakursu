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
public class LifeTimeMember extends Member {//concreate produxt

    @Override
    public void register() {
        System.out.println("LifeTime Member registered");
        
    }

    @Override
    public void notitfy() {
           System.out.println("LifeTime Member");
    }

    @Override
    public void savePersonalInfo() {
    
    }
    
}
