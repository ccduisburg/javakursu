/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textkullanimi;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author CC-Student
 */
public class BenimPencerem extends JFrame{
    private JButton gosterBtn=new JButton("Göster Bakalim");
    private  JTextField txtIsim=new JTextField(15);
    
    public BenimPencerem(){
    super("Benim Yeni Pencerem");
    olustur();
    
    }
    
    private void olustur(){
    this.setSize(300,200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.getContentPane().setLayout(new FlowLayout());
    txtIsim.setSize(100,20);
    this.add(gosterBtn);
    this.getContentPane().add(txtIsim);
    this.getContentPane().add(gosterBtn);
    gosterBtn.addActionListener((ActionEvent ae)->{
    gosterBtn.setText("heeee");
    });
    
    txtIsim.addActionListener((ActionEvent ae)->{
    txtIsim.setText("heeee");
    });
    


    
    }
    
    
}
