package com.arnab.jlc.basic.serialization;

import java.io.*;



public class TestSerialVersionId {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Product product =new Product(123,"suraj");
        System.out.println(product);

        //serialization
        FileOutputStream fileOutputStream = new FileOutputStream("serial.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(product);

        //deserialization



    }
}

class TestDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("serial.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Product productFromFile = (Product) objectInputStream.readObject();
        System.out.println(productFromFile);
    }
}

 class Product implements Serializable {


    private double id;
    private String name;

     public Product(double id, String name) {
         this.id = id;
         this.name = name;
     }

     public double getId() {
         return id;
     }

     public void setId(double id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     @Override
     public String toString() {
         return "Product{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 '}';
     }
 }
