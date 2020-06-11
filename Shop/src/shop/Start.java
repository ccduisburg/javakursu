package shop;

import gui.Konsole;
import logic.Service;


public class Start {

    public static void main(String[] args) {
        Service s = new Service();
        Konsole gui = new Konsole(s);
    }

}     