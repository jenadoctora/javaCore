package javaCore.git.Lection07;

import java.util.ArrayList;

public class Maximum {


        private float Value;
        private String Unit;
        private float UnitType;

    ArrayList<Maximum> maximum = new ArrayList <> ();
        // Getter Methods

        public float getValue() {
            return Value;
        }

        public String getUnit() {
            return Unit;
        }

        public float getUnitType() {
            return UnitType;
        }

        // Setter Methods

        public void setValue(float Value) {
            this.Value = Value;
        }

        public void setUnit(String Unit) {
            this.Unit = Unit;
        }

        public void setUnitType(float UnitType) {
            this.UnitType = UnitType;
        }
    }

