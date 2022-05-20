package org.example;
import org.example.hiding.MyClass;
public class App {
    public static void main( String[] args) {
        org.example.hiding.mypackage.MyClass lowerMyClass = new org.example.hiding.mypackage.MyClass();
        MyClass upperMyClass = new MyClass();
        System.out.println(lowerMyClass.f() + "\n" + upperMyClass.f());
    }
}
// the package names prevent name collisions, but note we could not import org.example.hiding.mypackage.MyClass
// as there would be a name collision for new MyClass() as the compiler would not which one to choose
// this is resolved by using a fully qualified package name for the lower level MyClass
