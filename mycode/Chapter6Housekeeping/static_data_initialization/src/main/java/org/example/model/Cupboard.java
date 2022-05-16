package org.example.model;

public class Cupboard {
    private Bowl bowl3 = new Bowl(3);
    private String constructorString;
    static Bowl bowl4 = new Bowl(4);

    public Cupboard() {
        constructorString = bowl4.f1();
    }

    static Bowl bowl5 = new Bowl(5);

    public String getConstructorString() {
        return constructorString;
    }

    public void setConstructorString(String constructorString) {
        this.constructorString = constructorString;
    }

    public String f3(int marker) {
        return "f3(" + marker + ")";
    }
}
