package org.example.exceptions;

class EBase1 extends Exception {
    EBase1(String msg) { super(msg); }
}
class Except1 extends EBase1 {
    Except1() { super("Except1"); }
}
class EBase2 extends Exception {
    EBase2(String msg) { super(msg); }
}
class Except2 extends EBase2 {
    Except2() { super("Except2"); }
}
class EBase3 extends Exception {
    EBase3(String msg) { super(msg); }
}
class Except3 extends EBase3 {
    Except3() { super("Except3"); }
}
class EBase4 extends Exception {
    EBase4(String msg) { super(msg); }
}
class Except4 extends EBase4 {
    Except4() { super("Except4"); }
}

public class SameHandler {
    void x() throws Except1, Except2, Except3, Except4 { throw new Except1(); }
    public void f() {
        try {
            x();
        } catch (Except1 e) {
            System.out.println(e.getMessage());
        } catch (Except2 e) {
            System.out.println(e.getMessage());
        } catch (Except3 e) {
            System.out.println(e.getMessage());
        } catch (Except4 e) {
            System.out.println(e.getMessage());
        }
    }
}
