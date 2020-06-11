package junit_nicht_in_der_pruefung;

public class MyMath {

    /*
        JUnit-Tests finden Sie in den 'Test Packages'
    */
    public static int add(int a, int b) {
        long erg = (long)a + b;
        
        if(erg > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("result is bigger as Integer.MAX_VALUE");
        }
        if(erg < Integer.MIN_VALUE) {
            throw new IllegalArgumentException("result is lower as Integer.MIN_VALUE");
        }
        
        return (int)erg;
    }
    
}
