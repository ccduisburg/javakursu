/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionbeispiele;

/**
 *
 * @author ckabakci
 */
public class ExceptionBeispiele {

    public void Kontrol(int a, int b) throws MeineFehler, DeineFehler {

        if (a == 0) {

            throw new MeineFehler("a ist \"0\"");

        }

        if (b == 0) {

            throw new DeineFehler("b ist \"0\"");

        }

        if ((a < 0) || (b < 0)) {

            throw new DeineFehler("(a oder b ) ist minus "); // kotu, aciklama yok

        }

        int sonuc = a - b; // hesaplama islemi

        if (sonuc < 0) {

            throw new MeineFehler("sonuc ist minus", 2);

        } else if (sonuc == 0) {

            throw new MeineFehler("sonuc ist \"0\"", 1);

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------------------");

        try {

            ExceptionBeispiele it = new ExceptionBeispiele();

            it.Kontrol(2, 0);

        } catch (MeineFehler ex1) {

            System.out.println("Eine Fehler aufgetreten-1:" + ex1.getMessage());

            System.out.println(ex1.getLocalizedMessage());

            System.out.println(ex1.getNummer());

        } catch (DeineFehler ex2) {

            System.out.println("Eine Fehler aufgetreten-2:" + ex2);

        }

        System.out.println("----------------------");

        try {

            ExceptionBeispiele it = new ExceptionBeispiele();

            it.Kontrol(0, 0);

        } catch (MeineFehler ex1) {

            System.out.println("Eine Fehler aufgetreten-1:" + ex1.getMessage());

            System.out.println(ex1.getLocalizedMessage());

            System.out.println(ex1.getNummer());

        } catch (DeineFehler ex2) {

            System.out.println("Eine Fehler aufgetreten-2:" + ex2);

        }

        System.out.println("----------------------");

        try {

            ExceptionBeispiele it = new ExceptionBeispiele();

            it.Kontrol(1, -124);

        } catch (MeineFehler ex1) {

            System.out.println("Eine Fehler aufgetreten-1:" + ex1.getMessage());

            System.out.println(ex1.getLocalizedMessage());

            System.out.println(ex1.getNummer());

        } catch (DeineFehler ex2) {

            System.out.println("Eine Fehler aufgetreten-2:" + ex2);

        }

    }
}
