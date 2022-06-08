package org.example.bar;

public class Bar {
    private int i;
    static private int z;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static int getZ() {
        return z;
    }

    public static void setZ(int z) {
        Bar.z = z;
    }
}
