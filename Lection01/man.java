package javaCore.git.Lection01;

public class man {


    private float maxRun;
    private float maxJump;

    man (float maxRun, float maxJump) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public void jump() {System.out.println("Man jump");}
    public void run() {System.out.println("Man run");}
}
