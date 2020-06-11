/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fensterchen;

import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;



/**
 *
 * @author ckabakci
 */
public class MeinMauseEvent extends JFrame implements MouseMotionListener{
   private int mX, mY;  
  public MeinMauseEvent() {
    addMouseMotionListener(this);
    setVisible(true);

}
   public void mouseMoved(MouseEvent me) {
    mX = (int) me.getPoint().getX();
    mY = (int) me.getPoint().getY();
       System.out.println("I like To moved moved...");
  }
 
 public void mouseDragged(MouseEvent me) {
    mouseMoved(me);
  }
  
  }