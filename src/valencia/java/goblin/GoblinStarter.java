package valencia.java.goblin;


import java.awt.*;
import java.util.ArrayList;
/*
public class GoblinStarter {
    // Question 2: Find the Goblin Furthest from origin.
    public static void question2() {
        Goblin[] gob = new Goblin[20];
        double dist = 0;
        double max_x = 0;
        double max_y = 0;
        for (int i = 0; i < 20; i++) {
            gob[i] = new Goblin();
        }

        for (Goblin goblin : gob) {
            if (goblin.getDistFromOrigin() > dist) {
                dist = goblin.getDistFromOrigin();
                max_x = goblin.get_x_pos();
                max_y = goblin.get_y_pos();
            }
        }
        System.out.println("Furthest Goblin is at: (" + max_x + ", " + max_y + ")\nWhich is " + dist + " units away from the origin.");
    }

    //Question 3: Instantiates 20 Goblins with a set minimum distance.
    public static ArrayList<Goblin> question3(int minimumDistance) {
        ArrayList<Goblin> goblins = new ArrayList<>();
        int goblinsCreated = 0;
        while (goblinsCreated < 20) {
            Goblin fred = new Goblin();

            if (goblinOutsideRange(fred, goblins, minimumDistance)) {
                goblins.add(fred);
                goblinsCreated++;
            }
        }
        return goblins;
    }

    public static boolean goblinOutsideRange(Goblin candidate, ArrayList<Goblin> goblins, int minimumDistance) {
        for (Goblin goblin : goblins) {
            if (candidate.findDistance(goblin) < minimumDistance) {
                return false;
            }
        }
        return true;
    }

    public static void question4(int minimumDistance) {
        ArrayList<Goblin> goblins = question3(minimumDistance);
        for (Goblin goblin : goblins) {
            valencia.java.turtleInheritance.Turtle.Turtle bob = new Turtle.Turtle(goblin.get_x_pos(), goblin.get_y_pos());
            bob.fillColor(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));
        }
    }

    public static void main(String[] args) {
        // Uncomment the lines below to run the code for the corresponding question.
        //question2();
        //question3(100);
        question4(100);
    }
}
*/