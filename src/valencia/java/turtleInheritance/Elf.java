package valencia.java.turtleInheritance;

public class Elf extends Turtle {
    private int startingQuadrant;
    private String color;
    private String shape;

    Elf() {
        // Elves can appear in Quadrant 3.
        // So, from (-400,-400) to (0,0)
        super((Math.random()*400)-400, (Math.random() * 400)-400);
        this.fillColor("red");
        this.shape("triangle");
    }

    public void move() {
        // Elves always move UP
        this.setDirection(90);
        this.forward(Math.random()*100);
    }
}
