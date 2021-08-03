package javaCore.git.Lection03;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        Apple apple = new Apple("apple", 1f);
        Orange orange = new Orange("orange", 1.5f);
        Box appleBox = new Box(0, 0);
        Box orangeBox = new Box(0, 0);

        Fruit[] fruit = {apple, apple, apple, orange, apple, orange, apple, orange, apple, apple,};

        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i] == orange) {
                orangeBox.weight += orange.weight;
                orangeBox.quantity += 1;
            } else {
                appleBox.weight += apple.weight;
                appleBox.quantity += 1;
            }
        }
        System.out.println(appleBox.weight);
        System.out.println(appleBox.quantity);
        System.out.println(orangeBox.weight);
        System.out.println(orangeBox.quantity);

        appleBox.compare(orangeBox);
        orangeBox.compare(appleBox);



    }
}

