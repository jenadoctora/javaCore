package javaCore.git.Lection04;

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {

    public static void main(String args[]) {
        Set<String> set = new HashSet<>();
        set.add("Яблоко");
        set.add("Морковь");
        set.add("Черешня");
        set.add("Виноград");
        set.add("Персик");
        set.add("Арбуз");
        set.add("Банан");
        set.add("Абрикос");
        set.add("Черешня");
        set.add("Персик");
        set.add("Банан");
        set.add("Морковь");
        set.add("Тыква");
        set.add("Яблоко");

        System.out.println(set);
    }


}
