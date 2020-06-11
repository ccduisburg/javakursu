package com.myGames.figuren;

public class Charakter {

    protected int lebenspunkte;
    protected int schadensRate;
    protected boolean darfSpielen = true;

    //Konstruktuoren
    public Charakter() {
        super();
        System.out.println("Das Objekt wird erstellt");

        double tmp = (Math.random() * 100) + 1;
        lebenspunkte = (int) tmp;
        tmp = (Math.random() * 10) + 1;
        schadensRate = (int) tmp;

    }

    public Charakter(int vipFaktor) {

        System.out.println("Ein VIP wird erzeugt ");
        double tmp = (Math.random() * 100) + 1;
        lebenspunkte = (int) tmp + vipFaktor;
        tmp = (Math.random() * 10) + 1;
        schadensRate = (int) tmp;

    }

    /*   
   public  Charakter(String name)
    {
       if (name.equals("Trump")) {
            int malus = -100;
            System.out.println("Ein Trump wird erzeugt");
            double tmp = (Math.random() * 100) + 1;
            lebenspunkte = (int) tmp + malus;
            tmp = (Math.random() * 10) + 1;
            schadensRate = (int) tmp;
        } else {
            System.out.println("Das Objekt wird erstellt");
            //Ein zufällige Zahl soll erzeugt werden
            //Math.random
            double tmp = (Math.random() * 100) + 1;
            lebenspunkte = (int) tmp;
            tmp = (Math.random() * 10) + 1;
            schadensRate = (int) tmp;
    
    }}*/

    public Charakter(int vipFaktorLeben, int vipFaktorSchaden) {
        //Übung: i, j sollen lebenspunkte und schadensrate verbessern
        /* System.out.println("Ein VIP für Leben wird erzeugt ");
         System.out.println("Ein VIP für Schaden wird erzeugt ");
        double tmp=(Math.random()*100)+1;
        lebenspunkte=(int)tmp+vipFaktorLeben;
        tmp=(Math.random()*10)+1;
        schadensRate=(int)tmp+vipFaktorSchaden;*/
//bu basit cözüm

        this(vipFaktorLeben);
        this.schadensRate = +vipFaktorSchaden;

    }

    public void verwundetWerden(int schaden) {
        lebenspunkte = lebenspunkte - schaden;
        if (lebenspunkte <= 0) {
            darfSpielen = false;
            System.out.println("Das was's...");
        }

    }

    public void verwunden(Charakter fremder) {

        if (this != fremder) {
            fremder.verwundetWerden(schadensRate);

        } else {
            System.out.println("Das mach ich nicht!");
        }
    }

    public void geheiltWerden(int heilung) {
        lebenspunkte += heilung;
    }

    public boolean istNochDabbei() {

        return darfSpielen;
    }

    public int getLebensPunkte() {
        return lebenspunkte;
    }

    public boolean istNochDabei() {
        return darfSpielen;
    }
}
