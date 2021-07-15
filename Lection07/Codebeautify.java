package javaCore.git.Lection07;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Codebeautify {
    @JsonProperty
        private String Date;
    @JsonIgnore
        private float EpochDate;
    @JsonIgnore
        Temperature TemperatureObject;

        Day DayObject;

        Night NightObject;
        ArrayList <Codebeautify> codebeautify = new ArrayList < Codebeautify > ();
        private String MobileLink;
        private String Link;


        // Getter Methods

        public String getDate() {
            return Date;
        }

        public float getEpochDate() {
            return EpochDate;
        }

        public Temperature getTemperature() {
            return TemperatureObject;
        }

        public Day getDay() {
            return DayObject;
        }

        public Night getNight() {
            return NightObject;
        }

        public String getMobileLink() {
            return MobileLink;
        }

        public String getLink() {
            return Link;
        }

        // Setter Methods

        public void setDate(String Date) {
            this.Date = Date;
        }

        public void setEpochDate(float EpochDate) {
            this.EpochDate = EpochDate;
        }

        public void setTemperature(Temperature TemperatureObject) {
            this.TemperatureObject = TemperatureObject;
        }

        public void setDay(Day DayObject) {
            this.DayObject = DayObject;
        }

        public void setNight(Night NightObject) {
            this.NightObject = NightObject;
        }

        public void setMobileLink(String MobileLink) {
            this.MobileLink = MobileLink;
        }

        public void setLink(String Link) {
            this.Link = Link;
        }
    }