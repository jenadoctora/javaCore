package javaCore.git.Lection04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueWords {

    public static void main(String args[]) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Яблоко");
        arrayList.add("Морковь");
        arrayList.add("Черешня");
        arrayList.add("Виноград");
        arrayList.add("Персик");
        arrayList.add("Арбуз");
        arrayList.add("Банан");
        arrayList.add("Абрикос");
        arrayList.add("Морковь");
        arrayList.add("Тыква");
        arrayList.add("Морковь");
        System.out.println(arrayList);
        String[] arr = new String[arrayList.size()];
        arrayList.toArray(arr);
        Set<String> set = new HashSet<>();

        for (int i = 1; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        int ununiq = arr.length - set.size();
        System.out.println(ununiq);
        }

    }

