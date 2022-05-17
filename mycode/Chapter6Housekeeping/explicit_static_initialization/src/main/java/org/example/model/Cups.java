package org.example.model;

public class Cups {
    public static Cup cup1;
    public static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
}
