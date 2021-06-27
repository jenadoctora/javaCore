package javaCore.git.Lection03;

public class Array {

    public static int[] array;


    public static void main(String[] args) {

        addArray(5);
        outArray();
        System.out.println();
        swapPlaces(4,1);
        outArray();

    }

    public static int[] addArray(int x){
        array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void swapPlaces(int a, int b) {
        int ar;
        ar =array[a];
       array[a] = array[b];
       array[b] = ar;
    }

    public static void outArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }






}
