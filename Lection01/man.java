package javaCore.git.Lection01;

public class man {


    private float maxRun;
    private float maxJump;

    man (float maxRun, float maxJump) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public void jump(float maxJump) {System.out.println("Man jump");}
    public void run(float maxRun) {System.out.println("Man run");}
}
