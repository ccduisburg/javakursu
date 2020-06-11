package ex;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class B02_try_with_resources {

    public static void main(String[] args) throws FileNotFoundException {
        
        /*
            Ressourcen sollten immer geschlossen werden:
        
                Connection, IO-Streams...
        */
        
        /*
            So wurde eine Ressource früher geschlossen:
            (bevor es try-with-resources gab)
        */
        PrintWriter out = null;
        try {
            out = new PrintWriter("farben.txt");

            //...
            out.println("rot");
            out.println("grün");
        
        } finally {
            if(out!=null) {
                out.close();
            }
        }
        
        
        /*
            So geht es mit try-with-resources
        */
        try( PrintWriter pw = new PrintWriter("sizes.txt") ) {
            pw.println("big");
            pw.println("small");
        } // hier gibt es den impliziten finally-Block
          // in dem pw sicher geschlossen wird
        
        
        
    }
    
}
