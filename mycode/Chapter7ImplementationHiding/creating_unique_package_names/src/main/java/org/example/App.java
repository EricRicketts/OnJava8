package org.example;

import org.example.mypackage.List;
import org.example.mypackage.Vector;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class App {
    public static void main( String[] args ) {
        ClassLoader classLoaderList = List.class.getClassLoader();
        ClassLoader classLoaderVector = Vector.class.getClassLoader();
        System.out.println(classLoaderList.getResource("org/example/mypackage/List.class"));
        System.out.println(classLoaderVector.getResource("org/example/mypackage/Vector.class"));

        String classpath = System.getProperty("java.class.path");
        String[] classpathValues = classpath.split(File.pathSeparator);
        for (String classPath:classpathValues) {
            System.out.println(classPath);
        }
    }
}
