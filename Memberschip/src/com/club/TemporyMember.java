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
public class TemporyMember extends Member{
     @Override
    public void register() {
           System.out.println("Temporary Type Member registered");
    }

    @Override
    public void notitfy() {
         System.out.println("Temporary Type Member");
    }

    @Override
    public void savePersonalInfo() {
    }
}
