package func;

import java.util.function.Consumer;

public class B03_Consumer {

    public static void main(String[] args) {
        
        Consumer<Integer> c1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        };
        
        c1.accept(22);
        
        
        Consumer<Integer> c2 = t -> System.out.println(t);
        
        c2.accept( 22 );
        
    }
    
}
