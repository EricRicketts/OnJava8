package org.example.hiding;

public class Cake {
    public String f() {
        return "f() in Cake calls " + new Pie().f();
    }

    public String g() {
        return "g() in the Cake calls " + new Pastry().f() + " " + new Cookie().f();
    }
}

/*
    Note both class Cake and its methods must be public so I can call them at the top level when I invoke
    the main method in the App class.  However, note I can call any class and any method on any class within
    the same package, as I demonstrate in the f() and g() methods in class Cake.

    The above code demonstrate the default access or package access in Java.
*/
