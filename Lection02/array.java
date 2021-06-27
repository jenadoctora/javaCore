package javaCore.git.Lection02;

import java.util.Scanner;

public class array {
    public static String[][] array1;
    public static int[][] array2;
    public static int i;
    public static int j;
    public static int err_i;
    public static int err_j;
    public static int sum;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            addArray1();
        } catch (ArrayIndexOutOfBoundsException еx) {
            System.out.println("Ошибка индексации массива: " + еx);
        }
        makeArray1();
        try {
            sum();
        } catch (NumberFormatException еx) {
            System.out.println("Ошибка конвертирования элементов массива: " + еx);
            System.out.println("Ошибочный элемент массива: " + "[" + err_i + "]"+ "[" + err_j + "]");
        }
    }

    public static String[][] addArray1() {

        System.out.print("Input a number: ");
        i = in.nextInt();
        System.out.print("Input a number: ");
        j = in.nextInt();
        if (i != 4 && j != 4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array1 = new String[i][j];
        return array1;
    }

    public static String[][] makeArray1() {
        for (int x = 0; x < array1.length; x++) {
            for (int y = 0; y < array1.length; y++) {
                array1[x][y] = in.next();
            }
        }
        return array1;
    }

    public static void sum() {
        array2 = new int[i][j];
        for (int x = 0; x < array1.length; x++) {
            for (int y = 0; y < array1.length; y++) {
                if (isDigit(array1[x][y])) {
                    array2[x][y] = Integer.parseInt(array1[x][y]);
                    sum = sum + array2[x][y];
                }
                else{
                    err_i = x;
                    err_j=y;
                    throw new NumberFormatException();
                }
            }
        }
        System.out.println("Сумма значений элементов массива= " + sum);
    }

        public static boolean isDigit (String z) throws NumberFormatException {
            try {
                Integer.parseInt(z);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

