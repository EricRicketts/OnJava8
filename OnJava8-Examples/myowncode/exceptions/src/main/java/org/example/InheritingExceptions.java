package org.example;

public class InheritingExceptions {
    public void f() throws SimpleException {
        throw new SimpleException("This is a simple exception");
    }
}
