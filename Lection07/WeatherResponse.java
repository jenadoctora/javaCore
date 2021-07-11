package javaCore.git.Lection07;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class WeatherResponse {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherResponse[] weatherResponse = objectMapper.readValue(new File("weather.json"), WeatherResponse[].class);
        System.out.println(weatherResponse[0] );
        System.out.println(weatherResponse[1] );
        System.out.println(weatherResponse[2] );
        System.out.println(weatherResponse[3] );
        System.out.println(weatherResponse[4] );

    }

}
