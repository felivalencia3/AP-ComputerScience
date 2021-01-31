package valencia.java.turtleInheritance;

public class Goblin extends Turtle {
    private int startingQuadrant;
    private String color;
    private String shape;

    Goblin() {
        // Goblins can appear in Quadrant 1.
        // So, from (0,0) to (400,400)
        super(Math.random() * 400, Math.random() * 400);
        this.fillColor("blue");
        this.shape("square");
    }

    public void move() {
        // Goblins always move DOWN
        this.setDirection(270);
        this.forward(Math.random()*100);
    }
}
