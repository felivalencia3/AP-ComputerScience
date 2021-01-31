package valencia.java.turtleInheritance;

public class Hobbit extends Turtle {
    private int startingQuadrant;
    private String color;
    private String shape;

    Hobbit() {
        // Hobbits can appear in Quadrant 2.
        // So, from (-400,400) to (0,0)
        super((Math.random()*400)-400, (Math.random() * 400));
        this.fillColor("green");
        this.shape("circle");
    }

    public void move() {
        // Hobbits always move RIGHT
        this.setDirection(0);
        this.forward(Math.random()*100);
    }
}
