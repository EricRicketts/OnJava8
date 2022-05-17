package org.example.model;

public class Mug {
    private int marker;

    public Mug(int marker) { this.marker = marker; }

    public int getMarker() {
        return marker;
    }

    public void setMarker(int marker) {
        this.marker = marker;
    }

    public String f(int marker) {
        return "f(" + marker + ")";
    }
}
