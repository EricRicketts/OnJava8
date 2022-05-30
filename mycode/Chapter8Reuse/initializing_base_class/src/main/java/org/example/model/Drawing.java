package org.example.model;

public class Drawing extends Art {

    private String instrument;

    public Drawing(String instrument) { this.instrument = instrument; }

    public String getInstrument() {
        return instrument;
    }
}
