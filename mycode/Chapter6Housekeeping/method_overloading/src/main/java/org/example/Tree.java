package org.example;

public class Tree {
    private int height;

    public Tree() { this.height = 0; }
    public Tree(int height) { this.height = height; }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String info() { return "The tree is " + this.getHeight() + " feet tall."; }

    public String info(String message) {
        return message + this.info();
    }
}
