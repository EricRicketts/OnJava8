package org.example;

public class ExtraFeatures {
    public static void f() throws MyException {
        throw new MyException();
    }

    public static void g() throws MyException {
        throw new MyException("Originated in g()");
    }

    public static void h() throws MyException {
        throw new MyException("Originated in h()", 47);
    }
}
