package Lesson14_4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car toyota = new Car("Toyota", 220, 25000);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D://hw4.txt"));
        objectOutputStream.writeObject(toyota);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://hw4.txt"));
        Car toyotaRestored = (Car) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(toyotaRestored.toString());

    }
}
