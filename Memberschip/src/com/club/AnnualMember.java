/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.club;

import com.club.Member;

/**
 *
 * @author CC-Student
 */
public class AnnualMember extends Member{//concreate produxt

    @Override
    public void register() {
        System.out.println("AnnualMember registered");
    }

    @Override
    public void notitfy() {
        System.out.println("AnnualMember");
    }

    @Override
    public void savePersonalInfo() {
    }
}
