package org.example.model;

public class InitialValuesAndConstructor {

    long lng = 1;
    boolean bool = false;

    public InitialValuesAndConstructor() {}
    public InitialValuesAndConstructor(long lng, boolean bool) {
        this.lng = lng;
        this.bool = bool;
    }

    public long getLng() {
        return lng;
    }

    public boolean getBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public void setLng(long lng) {
        this.lng = lng;
    }
}
