package vererbung;

interface KannBewegtWerden {}
interface KannFliegen extends KannBewegtWerden {} // KannFliegen IS-A KannBewegtWerden

class Base {}
class Derived extends Base {} // Derived IS-A Base

class X implements Runnable { // X IS-A Runnable
    public void run() {}
}

public class B01_extends_implements {
    public static void main(String[] args) {
        
    }
}
