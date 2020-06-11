/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textkullanimi;

/**
 *
 * @author CC-Student
 */
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


import javax.swing.WindowConstants;
public class TextKullanimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        BenimPencerem fn=new BenimPencerem();
       fn.setVisible(true);
        
        
        
        
      /*  
        // TODO code application logic here
 //Swing kütüphanesi J ile başlar.
JFrame bizimframe=new JFrame("Bizim For");
//Formun Büyüklüğünü belirliyoruz.
bizimframe.setSize(300, 100);

//Bu kodu koymazsak Jframe penceresini kapatsakta
//program kapanmaz sadece görünürlüğü false olur.
bizimframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//Button oluşturuyoruz.
JButton btnGoster=new JButton("Göster");
//TextField oluşturuyoruz.
//final olmasının sebebi addMouseListener içinde
//erişmek için.
final JTextField txtIsim=new JTextField(15);

//Buttonun olaylarını yakalıyoruz.
//İç sınıf tanımladık (MouseAdapter) ve metotlarından birini ezdik.
btnGoster.addMouseListener(new MouseAdapter() {
//Mouse tıklandığındaki olayı yakalar.
@Override
public void mousePressed(MouseEvent e) {
//txtIsim.getText() txtIsimdeki Texti getirir.
//txtIsim.setText() dediğimizde de text atayabiliriz.
JOptionPane.showMessageDialog(null, txtIsim.getText());
}

});

//Layout oluşturulan form nesnelerinin nasıl frame de
//yerleştirileceğini belirler.
 

//FlowLayout sıra ile koyar.
bizimframe.getContentPane().setLayout(new FlowLayout());
//Buttonu ve textfield ekliyoruz.
//Eğer kodları koymazsak Frame de gözükmezler.
bizimframe.getContentPane().add(txtIsim);
bizimframe.getContentPane().add(btnGoster);

//Frame i görünür haline getiriyoruz.
bizimframe.setVisible(true);
*/
}
}