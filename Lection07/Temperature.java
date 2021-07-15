package javaCore.git.Lection07;


import java.util.ArrayList;

public class Temperature {

Minimum MinimumObject;
    Maximum MaximumObject;

    ArrayList<Temperature> temperature = new ArrayList <> ();
    // Getter Methods

    public Minimum getMinimum() {
        return MinimumObject;
    }

    public Maximum getMaximum() {
        return MaximumObject;
    }

    // Setter Methods

    public void setMinimum(Minimum MinimumObject) {
        this.MinimumObject = MinimumObject;
    }

    public void setMaximum(Maximum MaximumObject) {
        this.MaximumObject = MaximumObject;
    }
}
