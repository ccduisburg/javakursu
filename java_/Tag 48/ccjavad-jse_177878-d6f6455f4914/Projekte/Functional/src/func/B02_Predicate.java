package func;

import java.util.function.Predicate;

public class B02_Predicate {

    public static void main(String[] args) {
        
        Predicate<String> p1 = new Predicate<String>() {
            public boolean test(String s) {
                return s.length() > 3;
            }
        };

        Predicate<String> p2 = s -> s.length() > 3;
        
    }
    
    
    
}
