package org.example;

public class MyException extends Exception {
    private int x;
    MyException() {}
    MyException(String msg) { super(msg); }
    MyException(String msg, int x) {
        super(msg);
        this.x = x;
    }
    public int val() { return this.x; }
    @Override
    public String getMessage() {
        return "Detail Message: " + this.val() + " " + super.getMessage();
    }
}
