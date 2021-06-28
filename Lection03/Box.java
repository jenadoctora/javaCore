package javaCore.git.Lection03;

public class Box {

    protected float weight;
    protected int quantity;

    protected Box(float weight, int quantity) {
        this.weight = weight;
        this.quantity = quantity;
    }

    protected boolean compare(Box enemy) {
        if (this.weight != enemy.weight) {
            System.out.println("Масса коробок не равна");
            return false;
        } else {
            System.out.println("Масса коробок равна");
            return true;
        }
    }
}