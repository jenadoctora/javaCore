package javaCore.git.Lection06;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Weather {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https", "yandex.ru", 443, "/pogoda/saint-petersburg");
        InputStream in = url.openStream();

        URLConnection urlConnection = url.openConnection();
        in = urlConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, UTF_8));
        PrintWriter writer = new PrintWriter("weather.json");
        String current = null;
        while ((current = bufferedReader.readLine()) !=null) {
            writer.println(current);
        }
        writer.close();
        bufferedReader.close();

    }
}
