package com.data.structure.datastructure.keywords;

// Java program to demonstrate transient keyword
// Filename Test.java

import java.io.*;

class TransientKeyWord implements Serializable {
    // Use of transient has no impact here
    static int l = 40;
    transient final int m = 50;
    // Normal variables
    int i = 10, j = 20;
    // Transient variables
    transient int k = 30;

    public static void main(String[] args) throws Exception {
        TransientKeyWord input = new TransientKeyWord();
        System.out.println("K "+ input.k);

        // serialization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);

        // de-serialization
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TransientKeyWord output = (TransientKeyWord) ois.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        System.out.println("l = " + l);
        System.out.println("m = " + output.m);
    }
}

