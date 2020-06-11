
package kunden;

public class Kunde {
    //Attribute
    private String name;
    /**
     * enthält den Betrag in €, den der Kunde noch zu zahlen hat
     */
    private double rechnung;
    private boolean darfKontaktiertWerden;
    
    //Bereich, der noch gefüllt werden muss...
    
    //Methoden
    public void nameEingeben(String kundenName){//public void setName(String name)
        kundenName ="Herr "+kundenName; 
        name = kundenName;
    }
    public void bestellen(int id){
        //Bitte versuchen!
        switch(id){
            case 111:{
                System.out.println("Danke dass du einen Latte Macchiato bestellt hast");
                rechnung = rechnung + 4.11;
                break;
            }
            case 222:{
                System.out.println("Danke dass du einen Milchkaffe bestellt hast");
                rechnung = rechnung + 2.12;
                break;
            }
            case 333:{
                System.out.println("Danke dass du einen Cappuchino bestellt hast");
                rechnung = rechnung + 5;
                break;
            }
            default:{
                System.out.println("Haben wir aktuell nicht im Programm, dürfen wir dich kontaktieren, wenn es was Neues gibt?");
                //Vielleicht: den boolean darfKontaktiertWerden ändern
                break;//nur eine Stiel-Frage
            }
        }
        
    }
    public void bestellen(int id, int anzahl){
        //Bitte versuchen!
        switch(id){
            case 111:{
                System.out.println("Danke dass du einen Latte Macchiato bestellt hast");
                rechnung = rechnung + anzahl*4.11;
                break;
            }
            case 222:{
                System.out.println("Danke dass du einen Milchkaffe bestellt hast");
                rechnung = rechnung + anzahl*2.12;
                break;
            }
            case 333:{
                System.out.println("Danke dass du einen Cappuchino bestellt hast");
                rechnung = rechnung + anzahl*5;
                break;
            }
            default:{
                System.out.println("Haben wir aktuell nicht im Programm, dürfen wir dich kontaktieren, wenn es was Neues gibt?");
                //Vielleicht: den boolean darfKontaktiertWerden ändern
                break;//nur eine Stiel-Frage
            }
        }
        
    }
    
    public void bezahlen(){
        System.out.println("Die Rechnung beträgt aktuell "+rechnung+"€");
        rechnung=0;
    }
    
    public String gibDenNamenAn(){//public String getName()
        return name;
    }
    
    public double gibDenRechnungsbetragAn(){
        return rechnung;
    }
    
    public boolean darfGehen(){
        if(rechnung == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    //soll sagen ob er kontaktiert werden darf
    //bezahlen
}
