package org.example.model;

public class OverloadingVarArgs {
    public static String f1(double i, String... args) {
        String s = String.join(" ", args);
        return i + " " + s;
    }
    public static String f1(char c, String... args) {
        String s = String.join(" ", args);
        return c + " " + s;
    }
}
