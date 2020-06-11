package junit_nicht_in_der_pruefung;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyMathTest {

    @Test
    public void testAdd() {
        int expected = 5;
        int actual = MyMath.add(2, 3);
        
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addThrowsExceptionOnIntOverflow() {
        int a = 1;
        int b = Integer.MAX_VALUE;

        MyMath.add(a, b);
        
//        try {
//            MyMath.add(a, b);
//            
//            throw new AssertionError("add sollte bei 1 + Integer.MAX_VALUE eine IllegalArgumentException werfen");
//        } catch(IllegalArgumentException e) {
//            //expected!
//        }
    }
}
