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