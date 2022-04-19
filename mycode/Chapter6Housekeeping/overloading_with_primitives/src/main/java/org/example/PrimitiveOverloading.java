package org.example;

public class PrimitiveOverloading {
    private String f1(char x) { return "f1(char)"; }
    private String f1(byte x) { return "f1(byte)"; }
    private String f1(short x) { return "f1(short)"; }
    private String f1(int x) { return "f1(int)"; }
    private String f1(long x) { return "f1(long)"; }
    private String f1(float x) { return "f1(float)"; }
    private String f1(double x) { return "f1(double)"; }

    private String f2(byte x) { return "f2(byte)"; }
    private String f2(short x) { return "f2(short)"; }
    private String f2(int x) { return "f2(int)"; }
    private String f2(long x) { return "f2(long)"; }
    private String f2(float x) { return "f2(float)"; }
    private String f2(double x) { return "f2(double)"; }

    private String f3(short x) { return "f3(short)"; }
    private String f3(int x) { return "f3(int)"; }
    private String f3(long x) { return "f3(long)"; }
    private String f3(float x) { return "f3(float)"; }
    private String f3(double x) { return "f3(double)"; }

    private String f4(int x) { return "f4(int)"; }
    private String f4(long x) { return "f4(long)"; }
    private String f4(float x) { return "f4(float)"; }
    private String f4(double x) { return "f4(double)"; }

    private String f5(long x) { return "f5(long)"; }
    private String f5(float x) { return "f5(float)"; }
    private String f5(double x) { return "f5(double)"; }

    private String f6(float x) { return "f6(float)"; }
    private String f6(double x) { return "f6(double)"; }

    private String f7(double x) { return "f7(double)"; }

    public String testChar() {
        char x = 'x';
        String[] tests = new String[]{f1(x), f2(x), f3(x), f4(x), f5(x), f6(x), f7(x)};
        return String.join(" ", tests);
    }

    public String testByte() {
        byte x = 1;
        String[] tests = new String[]{f1(x), f2(x), f3(x), f4(x), f5(x), f6(x), f7(x)};
        return String.join(" ", tests);
    }

    public String testShort() {
        short x = 1;
        String[] tests = new String[]{f1(x), f2(x), f3(x), f4(x), f5(x), f6(x), f7(x)};
        return String.join(" ", tests);
    }

    public String testInt() {
        int x = 1;
        String[] tests = new String[]{f1(x), f2(x), f3(x), f4(x), f5(x), f6(x), f7(x)};
        return String.join(" ", tests);
    }

    public String testLong() {
        long x = 1L;
        String[] tests = new String[]{f1(x), f2(x), f3(x), f4(x), f5(x), f6(x), f7(x)};
        return String.join(" ", tests);
    }

    public String testFloat() {
        float x = 1.0F;
        String[] tests = new String[]{f1(x), f2(x), f3(x), f4(x), f5(x), f6(x), f7(x)};
        return String.join(" ", tests);
    }

    public String testDouble() {
        double x = 1.0;
        String[] tests = new String[]{f1(x), f2(x), f3(x), f4(x), f5(x), f6(x), f7(x)};
        return String.join(" ", tests);
    }
}
