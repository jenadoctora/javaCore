package javaCore.git.Lection01;


public class cat {

    private float maxRun;
    private float maxJump;

    cat (float maxRun, float maxJump) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public void jump() {System.out.println("Cat jump");}
    public void run() {System.out.println("Cat run");}

}
