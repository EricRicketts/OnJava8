package org.example.exceptions;

import java.util.ArrayList;
import java.util.List;

public class FullConstructors {
    List<String> exceptionStatements = new ArrayList<>();
    public void f() throws MyException {
        exceptionStatements.add("Throwing MyException from f()");
        throw new MyException();
    }

    public void g() throws MyException {
        exceptionStatements.add("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }
}
