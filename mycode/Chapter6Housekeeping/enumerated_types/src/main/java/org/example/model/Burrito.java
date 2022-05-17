package org.example.model;

public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) { this.degree = degree; }

    public Spiciness getDegree() {
        return degree;
    }

    public void setDegree(Spiciness degree) {
        this.degree = degree;
    }
}
