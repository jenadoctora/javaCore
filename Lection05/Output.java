package javaCore.git.Lection05;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Output {

    public static void main(String[] args) {

        List<AppData> appDataList = new ArrayList<>();
        String[] header = new String[3];
        int[][] data = new int[2][3];
        data = new int[][]{{120, 123, 123}, {121, 122, 123}};


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("writer.csv"))) {
            for (int i = 1; i <= header.length; i++) {
                    bufferedWriter.write("value " + (i) + ";");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("writer.csv",true))) {
            bufferedWriter.newLine();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (j==2) {
                        bufferedWriter.write(data[i][j] + ";");
                        bufferedWriter.newLine();
                    } else {
                        bufferedWriter.write(data[i][j] + ";");
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
