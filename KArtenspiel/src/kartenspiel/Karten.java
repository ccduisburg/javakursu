/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author ckabakci
 */
public class Karten extends JTabbedPane {

    private JPanel rot = new Fluss();//JPanel();
    private JPanel blau = new Gitter();
    private JPanel pink = new Grenzen();//new JPanel();
    private JPanel gelb = new JPanel();
    

    public Karten() {
        zusammenstellen();
    }
  
   

    private void zusammenstellen() {
        rot.setBackground(Color.RED);
        blau.setBackground(Color.BLUE);
        pink.setBackground(Color.PINK);
        gelb.setBackground(Color.YELLOW);

        this.add("Fluss",rot);
        this.add("Blau", blau);
        this.add("Pink", pink);
        this.add("Gelb", gelb);

    }


}
