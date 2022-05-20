package org.example.exceptions;

public class MultiCatch {
    void x() throws Except1, Except2, Except3, Except4 { throw new Except3(); }
    public void f() {
        try {
            x();
        } catch (Except1 | Except2 e) {
            System.out.println(e.getMessage());
        } catch (Except3 | Except4 e) {
            System.out.println(e.getMessage());
        }
    }
}
