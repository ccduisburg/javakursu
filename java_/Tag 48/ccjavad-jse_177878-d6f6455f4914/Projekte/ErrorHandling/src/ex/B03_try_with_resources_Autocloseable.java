package ex;

public class B03_try_with_resources_Autocloseable {
    
    static class MyResource implements AutoCloseable {
        public void close() throws Exception {
            System.out.println("close");
        }
    }
    
    public static void main(String[] args) {
        
        try( MyResource r = new MyResource() ) {
            System.out.println("try");
        } catch(Exception ex) {
            System.out.println("catch");
        } // implizit finally-Block, wo r.close() aufgerufen wird 
          //(in Wirklichkeit werden alle Ressourcen VOR den expliziten 
          // catch/finally)
        
        System.out.println("main");
    }

}

//Ausgaben: try close main