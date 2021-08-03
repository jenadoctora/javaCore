package javaCore.git.Lection04;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phone {
    public static HashMap<Integer, String> phone = new HashMap<>();
    public static Scanner in = new Scanner(System.in);
    public static String name = "";

    public static void main(String args[]) {

        phone.put(78767, "Иванов");
        phone.put(45654, "Сидоров");
        phone.put(56654, "Сидоров");
        phone.put(56432, "Петров");
        phone.put(59059, "Пупкин");

        for (Map.Entry<Integer, String> o : phone.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        phone.put(56432, "Rjirby");

        System.out.println("Номер " + phone.get(56432));
        System.out.println();
        add();

        for (Map.Entry<Integer, String> o : phone.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        System.out.println();
        get();


    }

    public static void add() {
        int a = 0;
        System.out.println( "Введите номер: ");
        a = in.nextInt();
        System.out.println( "Введите имя: ");
        name = in.next();
        phone.put(a, name);
    }

    public static void get() {
        System.out.println( "Введите имя для поиска: ");
        name = in.next();
        for (Map.Entry<Integer, String> o : phone.entrySet()) {
            if (name.equals( o.getValue())) {
                System.out.println(o.getKey() + ": " + o.getValue());
                break;
            }
        }
}
}
