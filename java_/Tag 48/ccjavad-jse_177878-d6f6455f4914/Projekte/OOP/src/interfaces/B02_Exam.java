package interfaces;

interface MyInterface {
    void m(); // implizit public
}

class MyClass implements MyInterface {
    void m() {} // Achtung! Sichbarkeit verschärft
}

public class B02_Exam {

}
