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
 * @author Sanne
 */
public class MeinFenster extends JFrame {
//    JFrame wuff = new JFrame("Mein erstes Fenster");

    private JButton ersterKnopf = new JButton("Drück mich");
    private int i = 0;
    // private JButton zweiterKnopf = new JButton("Drück mich auch");

    public MeinFenster() {
        super("Mein neues Fenster");
        bauen();
    }

    private void bauen() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(ersterKnopf);
        MeinActionHandler ah = new MeinActionHandler();
        int i=600;
        //ersterKnopf.addActionListener(ah); 
        //ersterKnopf.addActionListener(new MeinActionHandler());
        //ersterKnopf.setText("neuer Text für alten Button"); 
        //ersterKnopf.addActionListener(new InnerHandler());
        class LokalerHandler implements ActionListener {

            int i = 17;

            @Override
            public void actionPerformed(ActionEvent e) {
                int i = -55;
                ersterKnopf.setText("Sowas, das geht ja auch zum " + (MeinFenster.this.i + 1) + "ten Mal");
                // ersterKnopf.setText("Sowas, das geht ja auch zum "+(this.i+1)+"ten Mal");
                //  ersterKnopf.setText("Sowas, das geht ja auch zum "+(i+1)+"ten Mal");
                i++;
                // ersterKnopf.setText(ah.toString());
            }
        }
        //ersterKnopf.addActionListener(new LokalerHandler());
        ersterKnopf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                ersterKnopf.setText("gaaanz geheim");
            }
        });
        ersterKnopf.addActionListener( ae ->{
                ersterKnopf.setText("gaaanz schön unheimlich"+ae.getID());
            } 
        );
        //ersterKnopf.addMouseMotionListener(new MyMouseHandler()); 
        ersterKnopf.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ersterKnopf.setText("Maus im Haus");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ersterKnopf.setText("Maus aus dem Haus");
            }
            
        }); 

    }

    private class InnerHandler implements ActionListener {
        private int i;
        private class TestKlasse{
            private int i;
            public void meth(){
                System.out.println("i?+"+i);
            }
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            ersterKnopf.setText("Gedrückt...Gedrückt"+i);
        }
    }

    // AUFGABE:
    //Beim Bewegen der Maus wird das MouseEvent ausgelöst
    //Interface MouseMotionListener
    //Events vom Typ MouseEvent auffangen und ausgeben
    private class MyMouseHandler implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        int anzahl = 0;

        @Override
        public void mouseMoved(MouseEvent e) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            System.out.println("Du hast die Maus " + anzahl++ + " Mal bewegt und befindest dich an der Position x=" + x + ", y=" + y);
        }

    }
}
