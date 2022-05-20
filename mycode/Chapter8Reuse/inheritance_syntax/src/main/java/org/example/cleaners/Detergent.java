package org.example.cleaners;

public class Detergent extends Cleanser {
    @Override
    public void scrub() {
        append(" Detergent.scrub()"); // Detergent inherits the append method
        super.scrub(); // call the base class method using super keyword
    }

    public void foam() {
        append(" foam()");
    }
}

class Cleanser {
    private String s = "Cleanser";
    public void append(String str) { s += str; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    @Override
    public String toString() { return s; }
}
