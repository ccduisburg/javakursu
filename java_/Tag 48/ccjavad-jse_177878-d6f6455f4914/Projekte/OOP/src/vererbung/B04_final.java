package vererbung;
/*
    Von einer final-Klasse darf nicht geerbt werden.
*/
// Compilerfehler:
// class MyString extends String {}

/*
    final-methoden dürfen nicht überschrieben werden.
*/
class A {
    final void m() {}
}
class B extends A {
    // void m() {}  // Compilerfehler
}

/*
    final und abstract sind nicht kombinierbar
*/
abstract class C {
    // abstract final void m();     //Compilerfehler
}

public class B04_final {

}
