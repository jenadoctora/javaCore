package javaCore.git.Lection03;

public class Fruit {

    protected String name;
    protected float weight;

    public Fruit(String name, float weightF) {
        this.name = name;
        this.weight = weightF;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }
}
