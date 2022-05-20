package org.example.hiding;

public class IceCream {
    public String f() {
        return "Calling f() in IceCream which calls a Sundae method " + Sundae.makeSundae().getS();
    }
}

class Sundae {
    private Sundae() {}
    private String s = "foo";
    static Sundae makeSundae() {
        return new Sundae();
    }

    public String getS() {
        return s;
    }
}
/*
    It is important to understand what is going on here.  The Sundae constructor is private meaning it cannot be
    called outside the Sundae class, thus a method needs to be defined which will return a Sundae object.  Since
    the constructor is private it can be called within the Sundae class.

*/
