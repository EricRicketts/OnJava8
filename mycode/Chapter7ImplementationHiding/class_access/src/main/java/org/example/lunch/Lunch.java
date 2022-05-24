package org.example.lunch;

public class Lunch {
    public String testSoup1() {
        Soup1 soup = Soup1.makeSoup();
        return soup.f();
    }

    public boolean testSoup2() {
        Soup2 soup1 = Soup2.access();
        Soup2 soup2 = Soup2.access();
        return soup1 == soup2;
    }
}

class Soup1 {
    private Soup1() {}
    public static Soup1 makeSoup() {
        return new Soup1();
    }
    public String f() { return "f() in Soup1"; }
}

class Soup2 {
    private Soup2() {}
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() { return ps1; }
    public String f() { return "f() in Soup2"; }
}
