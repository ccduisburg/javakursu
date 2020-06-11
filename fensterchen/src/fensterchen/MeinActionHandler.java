/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fensterchen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ckabakci
 */
public class MeinActionHandler implements ActionListener {
    

    @Override
    public void actionPerformed(ActionEvent ae){
        System.out.println("Button wurde gedrückt"+ae);
        MeinFenster mf=new MeinFenster();
        //ersterKnopf.setText("gfgfgdfgfdgfd");
       // MeinMauseEvent me=new MeinMauseEvent();
    }
         
}
