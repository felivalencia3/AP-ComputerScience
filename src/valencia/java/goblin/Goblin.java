package valencia.java.goblin;

public class Goblin {
    private static int numGoblins;
    private int id;
    private double x_pos;
    private double y_pos;

    public Goblin(double x_pos, double y_pos) {
        numGoblins += 1;
        id = numGoblins;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
    }

    public Goblin() {
        numGoblins += 1;
        id = numGoblins;
        x_pos = (Math.random() * 800) - 400;
        y_pos = (Math.random() * 800) - 400;
    }

    public static int getNumGoblins() {
        return numGoblins;
    }

    public int get_id() {
        return id;
    }

    public double get_x_pos() {
        return x_pos;
    }

    public double get_y_pos() {
        return y_pos;
    }

    public double getDistFromOrigin() {
        return Math.sqrt(Math.pow(x_pos, 2) + Math.pow(y_pos, 2));
    }

    public void print() {
        System.out.println("ID: " + id + "\nX Position: " + x_pos + " Y Position: " + y_pos);
        System.out.println("Distance From Origin: " + this.getDistFromOrigin());
    }

    public double findDistance(Goblin otherGoblin) {
        double delta_y = Math.abs(this.y_pos - otherGoblin.get_y_pos());
        double delta_x = Math.abs(this.x_pos - otherGoblin.get_x_pos());
        return Math.sqrt((delta_x*delta_x) + (delta_y*delta_y));
    }
}
