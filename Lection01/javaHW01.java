package javaCore.git.Lection01;


public class javaHW01 {

    public static void main(String[] args) {

        float distance;

        cat cat = new cat(10, 12);
        man man = new man( 9, 7);
        robot robot = new robot( 15, 13);
        wall wall = new wall(10);
        track track = new track(10);


        barrier[]  barrier = {wall, track};
    }
}