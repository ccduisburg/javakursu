package func;

import java.util.function.Supplier;

public class B04_Supplier {

    public static void main(String[] args) {
        
        Supplier<String> s1 = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello from Supplier";
            }
        };
        
        String x = s1.get();
        System.out.println("x = " + x);

        
        Supplier<String> s2 = () -> "Hello nochmal" ;
        
        String y = s2.get();
        System.out.println("y = " + y);
    }
    
}
