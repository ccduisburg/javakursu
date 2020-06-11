package ex;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class B05_try_with_resource_Autocloseable_effectively_final {

    public static void main(String[] args) throws FileNotFoundException {
        
        try( PrintWriter out = new PrintWriter("tmp") ) {
           // out = null; // Compilerfehler: effectively final
        }
        
    }
    
}
