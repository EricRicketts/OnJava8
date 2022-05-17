package org.example.model;

public class Cupboard {
    private Bowl bowl3 = new Bowl(3);
    private String constructorString;
    public static Bowl bowl4 = new Bowl(4);

    public Cupboard() {
        constructorString = bowl4.f1(1);
    }

    public static Bowl bowl5 = new Bowl(5);

    public Bowl getBowl3() {
        return bowl3;
    }

    public void setBowl3(Bowl bowl) {
        this.bowl3 = bowl;
    }

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
