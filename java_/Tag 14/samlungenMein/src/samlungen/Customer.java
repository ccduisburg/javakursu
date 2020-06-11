/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samlungen;

import java.time.LocalDate;

/**
 *
 * @author ckabakci
 */
public class Customer {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private double amount;
    
    public Customer(){}
    public Customer(String firstName, String lastName,LocalDate birthdate){
    this.firstName=firstName;
    this.lastName=lastName;
    this.birthdate=birthdate;
    }
    public void buy(double price){
    amount-=price;
    }
    public void pay(double money){
    amount+=money;
    }
    public double getAmount(){
    return amount;
    }
    @Override
    public String toString(){
    return "Name: "+this.firstName+" "+lastName+ " Geburststag: "+birthdate;
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        
    if (!(obj instanceof Customer)){
        return false;
    }
    if(!this.firstName.equals(((Customer)obj).firstName)){
        return false;
    }
    if(!this.lastName.equals(((Customer)obj).lastName)){
        return false;
    }
    if(!this.birthdate.equals(((Customer)obj).birthdate)){
        return false;
    }
    return true;
}
    @Override
    public int hashCode(){
    int hash=0;
    // Relevante Attribute: firstName, lastName;
    // Attribute, die auch in der eqals-Methode verglichen werden.
    int hFirstName=firstName.hashCode();
    int hlastName=lastName.hashCode();
    int hBirthDate=birthdate.hashCode();
    
    hash=(37*hFirstName)+(41*hlastName)+(47*hBirthDate);
    
    return hash;
    
    
    }

}
