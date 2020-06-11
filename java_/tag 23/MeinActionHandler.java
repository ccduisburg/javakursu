
package fensterchen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeinActionHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae){
        System.out.println("Button wurde gedrückt" + ae);
        // ersterKnopf.setText("ich wurde gdrückt");
    }
}
