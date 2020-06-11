package ex;

import java.io.IOException;
import java.io.PrintWriter;

public class B09_rethrow {
    
    static void m1() throws IOException {
        try( PrintWriter out = new PrintWriter("tmp") ) {
            //schreiben hier...
            
        } catch(IOException e) {
            //hier den Fehler loggen...
            
            //rethrow:
            throw e;
        }
    }
    
    

    static void m2() throws IOException {
        try( PrintWriter out = new PrintWriter("tmp") ) {
            //schreiben hier...
        } catch(Exception e) {
            //hier den Fehler loggen...
            
            //rethrow:
            throw e;  // Auch OK, wenn nur IOException im try möglich ist
        }
    }
    
    static void m2a() throws IOException, InterruptedException {
        try( PrintWriter out = new PrintWriter("tmp") ) {
            //schreiben hier...
            throw new InterruptedException();
        } catch(Exception e) {
            //hier den Fehler loggen...
            
            //rethrow:
            throw e;  // Auch OK
        }
    }
    
    
    static void m3() throws IOException {
        throw new Exception(); // zu allgemein für die throws-Klausel
    }
    

    
    public static void main(String[] args) {
        
        
        
    }

}
