package org.example.model;

public class Mugs {
    private Mug mug1;
    private Mug mug2;
    private String constructorString;

    public Mugs() {
        constructorString = "constructor called";
        mug2.setMarker(3);
    }

    public String getConstructorString() {
        return constructorString;
    }

    public Mug getMug1() { return mug1; }
    public Mug getMug2() { return mug2; }

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
    }
}
