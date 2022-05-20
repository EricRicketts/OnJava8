package org.example;

import org.example.hiding.Cake;

public class App {
    public static void main( String[] args ) {
        System.out.println(new Cake().f());
        System.out.println(new Cake().g());
    }
}
