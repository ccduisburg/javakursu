/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author ckabakci
 */
public class Grenzen extends JPanel {
   JButton oben=new JButton("oben");
   JButton unten=new JButton("unten");
   JButton rechts=new JButton("rechts");
   JButton links=new JButton("links");
    JButton mitte=new JButton("mitte");
   
    JButton schlingel =new JButton("Hab nur Unsinn im Kopf");
public Grenzen(){
 this.setLayout(new BorderLayout(10,10));
    bauen();
}

private void bauen(){
this.add(unten,BorderLayout.SOUTH);
this.add(links,BorderLayout.WEST);


//this.add(schlingel,BorderLayout.WEST);
this.add(mitte,BorderLayout.CENTER);

//this.add(new Gitter());

this.add(rechts,BorderLayout.EAST);
//this.add(schlingel,BorderLayout.EAST);
this.add(oben,BorderLayout.NORTH);
//this.add(,BorderLayout.SOUTH);
schlingel.setFont(new Font("Verdana",Font.ITALIC,30));
this.add(schlingel,BorderLayout.NORTH);



}

}
