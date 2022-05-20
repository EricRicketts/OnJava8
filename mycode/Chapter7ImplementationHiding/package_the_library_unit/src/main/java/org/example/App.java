package org.example;

import java.util.ArrayList;

public class App {
    public static void main( String[] args ) {
        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<String> secondList = new java.util.ArrayList();
        firstList.add("foo");
        secondList.add("bar");
        System.out.println(firstList.get(0) + "\n" + secondList.get(0));
    }
}
