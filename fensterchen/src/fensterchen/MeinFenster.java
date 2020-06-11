/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fensterchen;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author ckabakci
 */
public class MeinFenster extends JFrame {

    private int i = 0;
    //JFrame wuff =new JFrame("Mein erstes Fenster");
    private JButton ersteKnopf = new JButton("Drück mich");
    // private JButton erstemotion = new JButton("Drück mich auch");

    public MeinFenster() {

        super("Mein neues Fenster");
        System.out.println("Konstruktor");
        bauen();

    }

    private void bauen() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(ersteKnopf);

        MeinActionHandler ah = new MeinActionHandler();
        int i = 600;
        ersteKnopf.addActionListener(ah);
        // this.add(ersteKnopf1);
        ersteKnopf.addActionListener(new MeinActionHandler());
        // ersteKnopf.setText("Neuer Text Für alten Button");
        // ersteKnopf.addActionListener(new InnerHandler());

        class LokalerHandler implements ActionListener {

            int i = 17;

            @Override
            public void actionPerformed(ActionEvent e) {
                int i = -55;
                ersteKnopf.setText("Sowas, das geht ja auch " + (MeinFenster.this.i + 1) + " ten mal");
                //  ersteKnopf.setText("Sowas, das geht ja auch "+(this.i+1)+" ten mal");
                //  ersteKnopf.setText("Sowas, das geht ja auch "+(i+1)+" ten mal");
                i++;
                // ersteKnopf.setText(ah.toString());
            }

        }
        ersteKnopf.addActionListener((ActionEvent ae) -> {
            ersteKnopf.setText("gaaanz geheim");
        });

           ersteKnopf.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                  System.out.println("mouseClicked");
                 ersteKnopf.setText("mouseClicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                 System.out.println("mousePressed");
                 ersteKnopf.setText("mousePressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                 System.out.println("mouseReleased");
                 ersteKnopf.setText("mouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
         ersteKnopf.setText("mouseEntered");
                System.out.println("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouseExited");
                 ersteKnopf.setText("mouseExited");

            }

        });

        //  MeinMauseEvent me = new MeinMauseEvent();
        //   ersteKnopf.addMouseMotionListener(me);
    }

    private class InnerHandler implements ActionListener {

        private int i;

        private class TestKlasse {

            private int i;

            public void meth() {
                System.out.println("i?+" + i);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ersteKnopf.setText("Gevb vbvbv" + i);
        }

    }

    private class MeinMauseEvent implements MouseMotionListener {

        private int mX, mY;

        public MeinMauseEvent() {

        }

        @Override
        public void mouseMoved(MouseEvent me) {
            mX = (int) me.getPoint().getX();
            mY = (int) me.getPoint().getY();
            System.out.println("I like To moved moved...X: " + mX + "Y: " + mY);

        }

        @Override
        public void mouseDragged(MouseEvent me) {
            mouseMoved(me);
        }

    }
}
