package org.example.model;

public class Bath {
    private String s1 = "Happy";
    private String s2;
    private String s3;
    public Bath(String s) {
        this.s2 = s;
    }
    { s3 = "Sad"; }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public String getS3() {
        return s3;
    }
}
