package javaCore.git.Lection07;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

import java.io.File;
import java.io.IOException;


public class DailyForecasts {

    public static void main(String[] args) throws IOException {

        Codebeautify codebeautify = new Codebeautify();
        Date date = new Date();
        Day day = new Day();
        Night night = new Night();
        Temperature temperature = new Temperature();
        Maximum maximum= new Maximum();
        Minimum minimum = new Minimum();


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        codebeautify = objectMapper.readValue(new File("weather.json"), Codebeautify.class);
        objectMapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
        System.out.println("В городе Санкт-Петербург на дату " + codebeautify.getDate() + " ожидается температура " + codebeautify.TemperatureObject);

    }

}
