package valencia.java.turtleInheritance;


public class Main {
    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Goblin firstGob = new Goblin();
        Goblin secondGob = new Goblin();
        Goblin thirdGob = new Goblin();

        Hobbit firstHob = new Hobbit();
        Hobbit secondHob = new Hobbit();
        Hobbit thirdHob = new Hobbit();

        Elf firstElf = new Elf();
        Elf secondElf = new Elf();
        Elf thirdElf = new Elf();

        int count = 0;
        // While loop will run ten times
        while(count < 10) {
            // First, the Goblins
            firstGob.move();
            secondGob.move();
            thirdGob.move();
            // Wait 1 second
            sleep();
            //Now the Hobbits will move
            firstHob.move();
            secondHob.move();
            thirdHob.move();
            // Wait 1 second again
            sleep();
            // Now the Elves move
            firstElf.move();
            secondElf.move();
            thirdElf.move();
            // Increase loop counter
            count++;
        }
    }
}
