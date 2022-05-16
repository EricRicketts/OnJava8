package org.example.model;

public class Bowl {

    private int instanceMarker;
    public Bowl(int marker) {
        instanceMarker = marker;
    }

    public int getInstanceMarker () {
        return instanceMarker;
    }

    public void setInstanceMarker(int marker) {
        instanceMarker = marker;
    }

    public String f1(int marker) {
        return "f1(" + marker + ")";
    }
}
