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
    Some important things to note about "this"
*/
