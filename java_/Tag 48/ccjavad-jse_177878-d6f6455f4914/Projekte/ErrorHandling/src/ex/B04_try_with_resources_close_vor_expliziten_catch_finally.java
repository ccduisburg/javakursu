package ex;

/*
    Exam:

    Alle AutoCloseable Ressourcen
    werden VOR den expliziten catch/finally 
    Blöcken geschlossen
*/
public class B04_try_with_resources_close_vor_expliziten_catch_finally {

    
    static void m1() {
        class MyRes implements AutoCloseable {
            public void close() {
                System.out.println("close");
            }
        }
        
        try(  MyRes r = new MyRes() ) {
            System.out.println("try");
        } finally {
            System.out.println("finally");
        }
        
    } // end of m1
    
    
    static void m2() {
        class MyRes implements AutoCloseable {
            public void close() {
                System.out.println("close");
            }
        }
        
        try(  MyRes r = new MyRes() ) {
            throw new RuntimeException("ex");
        } catch(RuntimeException e) {
            System.out.println("exception");
        } finally {
            System.out.println("finally");
        }
        
    } // end of m2
    
    public static void main(String[] args) {
        
        //m1(); // Ausgabe: try close finally
        
        m2(); // Ausgabe: close exception finally
    }
    
}
