package org.example;

public class Demotion {
    private String f1(double x) { return "f1(double)"; }
    private String f2(float x) { return "f2(float)"; }
    private String f3(long x) { return "f3(long)"; }
    private String f4(int x) { return "f4(int)"; }
    private String f5(short x) { return "f5(short)"; }
    private String f6(byte x) { return "f6(byte)"; }
    private String f7(char x) { return "f7(char)"; }

    public String testDouble() {
        double x = 1.0;
        String[] tests = new String[]{f1(x), f2((float)x), f3((long)x), f4((int)x),
                f5((short)x), f6((byte)x), f7((char)x)};
        return String.join(" ", tests);
    }
}
