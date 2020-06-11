/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warengruppen;

/**
 *
 * @author CC-Student
 */
public enum Warengruppen {
    CPU(1), CASES(2), COOLING(3), GRAFIK(4), HDD(5), MAINBOARD(6), POWER(7), RAM(8);

    // private final String id;
    private final int nummer;

    private Warengruppen(int nummer) {

        this.nummer = nummer;

    }
    public int getNummer() {
        return nummer;
    }

    @Override
    public String toString() {
        String n = super.toString();
        n = n.toLowerCase();
        String eb = n.substring(0, 1);
        eb = eb.toUpperCase();
        n = n.replaceFirst(n.substring(0, 1), eb);
        return n;

    }

}
