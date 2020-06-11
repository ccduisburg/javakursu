package aufgaben;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Function;

public class AufgbaneExceptionBuilder {

//    public static Exception build(String errMsg, Class<? extends Exception> clazz)
//            throws NoSuchMethodException, InvocationTargetException,
//            InstantiationException, IllegalAccessException, IllegalArgumentException {
//
//        Constructor<? extends Exception> c = clazz.getConstructor(String.class);
//
//        return c.newInstance(errMsg);
//    }
//
//    public static void main(String[] args) {
//        try {
//            RuntimeException e1 = (RuntimeException) build("error 1", RuntimeException.class);
//            System.out.println(e1);
//            
//        } catch (NoSuchMethodException
//                | InvocationTargetException
//                | InstantiationException
//                | IllegalAccessException
//                | IllegalArgumentException e) {
//
//            // handle exception
//        }
//    }

    public static <T extends Exception> T build(String errMsg, Function<String, T> exceptionSource) {
        return exceptionSource.apply(errMsg);
    }
    
    public static void main(String[] args) {
        
        // Function<String, Exception> exceptionSource = errMsg -> new RuntimeException(errMsg);
        RuntimeException e2 = build("error 2", errMsg -> new RuntimeException(errMsg));
        System.out.println(e2);
        
        // IllegalArgumentException::new ist Constructor-Reference (Method-Reference)
        IllegalArgumentException e3 = build("error 3", IllegalArgumentException::new);
        System.out.println(e3);
        
        // String e4 = build("hello", s -> new String(s)); // die Zeile darf nicht kompilieren 
        
    }
    
}
