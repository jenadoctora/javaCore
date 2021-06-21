package javaCore.git.Lection01;

public class robot {

    private float maxRun;
    private float maxJump;

    robot (float maxRun, float maxJump) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public void jump() {System.out.println("Robot jump");}
    public void run() {System.out.println("Robot run");}
}
