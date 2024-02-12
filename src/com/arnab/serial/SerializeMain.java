package com.arnab.serial;

import java.io.*;

public class SerializeMain {

    public static void main(String[] args) throws IOException {

        Animal animal= new Animal(1,"Dog");

        FileOutputStream fileOutputStream = new FileOutputStream("animal.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(animal);





    }
}
