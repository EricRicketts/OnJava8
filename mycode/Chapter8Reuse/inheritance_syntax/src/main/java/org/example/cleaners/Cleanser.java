package org.example.cleaners;


public class Cleanser {
    private String s = "Cleanser";
    public void append(String str) { s += str; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    @Override
    public String toString() { return s; }
}
