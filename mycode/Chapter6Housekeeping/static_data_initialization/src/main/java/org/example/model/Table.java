package org.example.model;

public class Table {
    private String constructorString;
    static Bowl bowl1 = new Bowl(1);

    public Table() {
        constructorString = bowl2.f1();
    }
    static Bowl bowl2 = new Bowl(2);

    public String getConstructorString() {
        return constructorString;
    }

    public void setConstructorString(String constructorString) {
        this.constructorString = constructorString;
    }

    public String f2(int marker) {
        return "f2(" + marker + ")";
    }
}
