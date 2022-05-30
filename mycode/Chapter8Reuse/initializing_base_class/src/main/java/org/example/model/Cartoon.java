package org.example.model;

public class Cartoon extends Drawing {

    private String tvShow;

    public Cartoon(String tvShow) {
        super("computer graphics");
        this.tvShow = tvShow;
    }

    public String getTvShow() {
        return tvShow;
    }
}
