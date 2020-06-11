/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fensterchen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author msauer2
 */
public class MeinFenster extends JFrame {

    private JButton ersterKnopf = new JButton("Drück mich");
    //private JButton zweiterKnopf = new JButton("Drück mich auch");

    public MeinFenster() {
        super("Mein neues Fenster");
        bauen();
    }

    private void bauen() {

        this.setSize(300, 200); //Pixel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(ersterKnopf);
        //this.setResizable(false);
        /*MeinActionHandler ah= new MeinActionHandler();
        ersterKnopf.addActionListener(ah);*/
        //alternativ mit anonymem objekt:
        //ersterKnopf.addActionListener(new MeinActionHandler());
        //ersterKnopf.setText("Neuer Text für den alten Button");

        //***Mit innerer Klasse***
        ersterKnopf.addActionListener(new InnerHandler());
        //ersterKnopf.addMouseMotionListener(new MouseHandler());
        ersterKnopf.addMouseListener(new AndererMouseHandler());
    }

    private class InnerHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ersterKnopf.setText("Gedrückt...Gedrückt");
        }

    }

    private class MouseHandler implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            ersterKnopf.setText("Huiuiuiui!");
        }

    }

    private class AndererMouseHandler implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("BANG");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("WAIT FOR IT...");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Pooof");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Aaaw, eine MAUS!");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Aaah, bleib da!");
        }

    }

}
