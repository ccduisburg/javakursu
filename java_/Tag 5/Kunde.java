
package kunden;

public class Kunde {
    //Attribute
    private String name;
    /**
     * enthält den Betrag in €, den der Kunde noch zu zahlen hat
     */
    private double rechnung;
    private boolean darfKontaktiertWerden;
    
    //Methoden
    public void nameEingeben(String kundenName){
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
    
    public void bezahlen(){
        System.out.println("Die Rechnung beträgt aktuell "+rechnung+"€");
        rechnung=0;
    }
    
    //soll sagen ob er kontaktiert werden darf
    //bezahlen
}
