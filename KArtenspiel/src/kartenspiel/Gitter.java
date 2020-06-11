/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ckabakci
 */
public class Gitter extends JPanel {

    private int spalten = 3;
    private int zeilen = 10;
    private JComponent[] felder = new JComponent[zeilen * spalten];

    public Gitter() {

        this.setLayout(new GridLayout(zeilen, spalten, 5, 5));
        bauen();
    }

    private void bauen() {
        for (int i = 0; i < felder.length; i++) {
            if (i % 3 == 0) {
                felder[i] = new JTextField();
            } else {
                felder[i] = new JButton();

                ((JButton) felder[i]).setText("Klick");
                if (i == 2) {
                    felder[i] = new JPanel();
                    felder[i].add(new JButton("Ok"));
                    felder[i].add(new JButton("abrechen"));
                }

            }
            add(felder[i]);
        }
    }
}
