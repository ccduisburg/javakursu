package func;

import java.util.function.Function;

public class B05_Function {

    public static void main(String[] args) {
        
        Function<Integer, String> f1 = new Function<Integer, String>() {
            @Override
            public String apply(Integer t) {
                return String.valueOf(t);
            }
        };
        
        Function f2 = t -> String.valueOf(t) ;
        
    }
}
