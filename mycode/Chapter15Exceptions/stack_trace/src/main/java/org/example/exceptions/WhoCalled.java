package org.example.exceptions;

public class WhoCalled {
    public static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste: e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }
    public static void g() { f(); }
    public static void h() { g(); }
}
