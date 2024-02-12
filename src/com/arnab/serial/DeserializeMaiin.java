package com.arnab.serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMaiin {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("animal.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Animal animal = (Animal) objectInputStream.readObject();

        System.out.println(animal);

    }
}
