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
public class IstanbulMembershipManager extends MemberschipManager{

   
    @Override
    public Member createMember(String type) {
    Member m;
     if (type.equals("LifeTime"))
    {
    m=new LifeTimeMember();
    }
    else if(type.equals("Tempory Member"))
    {
        m= new TemporyMember();
    }
    else {
    m= new AnnualMember();
    }
    return m;
    
    
}
}
