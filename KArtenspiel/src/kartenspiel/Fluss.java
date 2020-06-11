/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ckabakci
 */
public class Fluss extends JPanel {

    JComponent[] enten = new JComponent[5];
    JLabel ueberschrift = new JLabel("Wochentage");
    JLabel wochenTage = new JLabel("Ihr Auswahl");

    public Fluss() {
        //Standart-Layout des Janels
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));// Java Doc?
        bauen();
    }

    LocalDate now = LocalDate.now();

 

    private void bauen() {

        ueberschrift.setFont(new Font("Helvetica", Font.BOLD, 35));
        ueberschrift.setForeground(Color.WHITE);
        this.add(ueberschrift);
        
        wochenTage.setFont(new Font("Helvetica", Font.BOLD, 35));
        wochenTage.setForeground(Color.BLUE);
       
        this.add(wochenTage);

        for (int i = 0; i < enten.length; i++) {

            enten[i] = new JButton(now.plusDays(i).getDayOfWeek().toString());
        }
        for (JComponent knopf : enten) {

            ((JButton) knopf).addActionListener(ae -> {
                System.out.println("Ausgewählt: " + ae.getActionCommand());
                wochenTage.setText(ae.getActionCommand());
            });
            this.add(knopf);
        }
    }

}
