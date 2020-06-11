/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author ckabakci
 */
public class TopFenster extends JFrame {

    private JMenuBar leiste = new JMenuBar();
    //Einträge in Menuleister:JMenu
    private JMenu layout = new JMenu("Layout");
    private JMenu andererKram = new JMenu("anderer Kram");

    private JMenuItem grid = new JMenuItem("Grid");
    private JMenuItem flow = new JMenuItem("Flow");
    private JMenuItem border = new JMenuItem("Border");

    private JTabbedPane karten = new Karten();

    public TopFenster() {
        this.setLayout(new BorderLayout(10, 10));
        menuErstellen();
        bauen();
    }

    private void menuErstellen() {
        layout.add(grid);
        layout.add(flow);
        layout.add(border);

        grid.addActionListener(ae -> {
            System.out.println("Grid wurde gewählt");
         karten.setSelectedIndex(2);
          
        });
        
         layout.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource()!=null){
                    
                   karten.setSelectedIndex(2);
                    System.out.println();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
          
            }

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        
        
        });
        
        leiste.add(layout);
        leiste.add(andererKram);

        this.setJMenuBar(leiste);

    }

    private void bauen() {

        /*
        JButton eins = new JButton("Eins");
        JButton zwei = new JButton("zwei");
       

        karten.add(eins);
        karten.add(zwei);
         */
        this.setSize(500, 300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(karten);
               

    }

    
}
