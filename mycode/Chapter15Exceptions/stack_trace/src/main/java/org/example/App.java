package org.example;

import org.example.exceptions.WhoCalled;

public class App {
    public static void main( String[] args ) {
        WhoCalled.f();
        System.out.println("***************************************");
        WhoCalled.g();
        System.out.println("***************************************");
        WhoCalled.h();
        // the stack trace will print the method names, the order is
        // the bottom of the stack trace which corresponds to the last method in the array of method calls.
    }
}
