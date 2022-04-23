package org.example;

public class Flower {
    int petalCount = 0;
    String s = "initial Value";
    String singleArgConstrInt;
    String singleArgConstrStr;
    String twoArgConstructor;
    String zeroArgConstructor;

    Flower(int petals) {
        petalCount = petals;
        singleArgConstrInt = "constructor with single argument, int only, petalCount = " + petalCount;
    }

    Flower(String ss) {
        s = ss;
        singleArgConstrStr = "constructor with single argument, String only, s = " + ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        twoArgConstructor = "two argument constructor with a String followed by an int";
    }

    Flower() {
        this("hi", 47);
        zeroArgConstructor = "Zero argument constructor calls two argument constructor";
    }
}
/*
    Some important things to note about "this", normally "this" refers to the current object as it
    does in the two argument constructor beginning in line 21.  However, we see on line 22 "this" can
    refer to something else when used inside the body of a constructor.  "this" can refer to another
    constructor.  In the case of line 22 it refers to the single argument constructor with an int parameter.
    When used in such a manner, "this" can only be used to call one constructor and it must be the first statement
    in the constructor.
*/
