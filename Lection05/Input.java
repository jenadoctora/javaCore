package javaCore.git.Lection05;

import java.io.BufferedReader;
import java.io.FileReader;

public class Input {

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("writer.csv"))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line:" + line);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
