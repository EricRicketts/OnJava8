package org.example.model;

public class Cup {
    private int marker;

    public Cup(int marker) {
        this.marker = marker;
    }

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
