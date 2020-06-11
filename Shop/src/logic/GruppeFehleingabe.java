/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author CC-Student
 */

public class GruppeFehleingabe extends Exception{
    public GruppeFehleingabe (){
        super ("Diese Produktgruppe exestiert nicht! \n Bitte geben Sie die ID der Warengruppe ein: " );
    }
}
