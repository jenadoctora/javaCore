package javaCore.git.Lection07;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


 public class DailyForecasts {

    public static void main(String[] args) throws IOException {



        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode universityName = objectMapper
                .readTree("weather.json")
                .at("/Temperature/Minimum/Value");

        System.out.println(universityName.asText());
        DailyForecasts[] weatherResponse = objectMapper.readValue(new File("weather.json"), DailyForecasts[].class);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        System.out.println(weatherResponse[0]);
        System.out.println(weatherResponse[1] );
        System.out.println(weatherResponse[2] );
        System.out.println(weatherResponse[3] );
        System.out.println(weatherResponse[4] );

    }

}
