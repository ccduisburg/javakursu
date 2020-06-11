/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufdembild;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ckabakci
 */
public class AufdemBild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
           try {
               
               if(true){
               int height=55;
               count= count+1;
               }
        
          //  method_1();
        } catch (MyException ex) {
            Logger.getLogger(RuntimeException.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hier spricht Main");
    }
    public void method_1()throws MyException{
        try{
            method_2();
        }catch(MyException me){
            System.out.println("Das hat ja schon fast geklappt");
            System.exit(-1); //Beendet sofort die virtuelle Maschine
        }
        catch(Exception e){
            System.out.println("Der Arzt kommt...");
            //throw new MyException("tada");
        }
        System.out.println("Hier spricht Method_1");
    }
    public void method_2()throws Exception{
        risky_method();
       
        System.out.println("Hier spricht Method_2");
    }
    public void risky_method(){
        boolean somethingWrong=true;
        if(somethingWrong){
            throw new MyException("Fehler");
        }
        System.out.println("Hier spricht Risky Method");
    }

class MyException extends RuntimeException{
    public MyException(String str){
        super(str);
    }
}}
