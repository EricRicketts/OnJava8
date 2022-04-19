package org.example;

// methods can be overloaded by virtue of the argument positions
// In this case arguments are the same but reversed in order
public class OverloadingOrder {
    static String f(String s, int i) {
        return "String is: " + s + " int is: " + i;
    }

    static String f(int i, String s) {
        return "Int is: " + i + " String is: " + s;
    }
}