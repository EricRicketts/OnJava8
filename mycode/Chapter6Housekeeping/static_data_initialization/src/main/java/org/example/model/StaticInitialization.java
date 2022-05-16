package org.example.model;

public class StaticInitialization {
    private Cupboard cupboardOne;
    private Cupboard cupboardTwo;
    private String tableString;
    private String cupboardString;

    public StaticInitialization() {
        cupboardOne = new Cupboard();
        cupboardTwo = new Cupboard();
        tableString = table.f2(1);
        cupboardString = cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

    public Cupboard getCupboardOne() {
        return cupboardOne;
    }

    public Cupboard getCupboardTwo() {
        return cupboardTwo;
    }

    public String getTableString() {
        return tableString;
    }

    public String getCupboardString() {
        return cupboardString;
    }
}
