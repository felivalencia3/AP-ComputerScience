package valencia.java;

public class staticMethods {
    public static int getLargest() {
        int largest = 0;
        for (int i = 0; i < 20; i++) {
            int localRandom = (int) (Math.random()*100) + 1;
            //System.out.println(localRandom);
            if(localRandom > largest) {
                largest = localRandom;
            }
        }
        return largest;
    }

    public static int getSecondLargest() {
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < 20; i++) {
            int localRandom = (int) (Math.random()*100) + 1;
            //System.out.println(localRandom);
            if(localRandom > largest) {
                secondLargest = largest;
                largest = localRandom;
            }
            else if(localRandom > secondLargest) {
                secondLargest = localRandom;
            }
        }
        return secondLargest;
    }
    public static int getThirdLargest() {
        int largest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;
        for (int i = 0; i < 20; i++) {
            int localRandom = (int) (Math.random()*100) + 1;
            //System.out.println(localRandom);
            if(localRandom > largest) {
                secondLargest = largest;
                largest = localRandom;
            }
            if(localRandom < largest && localRandom > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = localRandom;
            }
            if(localRandom < secondLargest && localRandom > thirdLargest) {
                thirdLargest = localRandom;
            }
        }
        return thirdLargest;
    }
    public static void main(String[] args) {
        System.out.println("Largest: "+ getLargest());
        System.out.println("Second Largest: "+ getSecondLargest());
        System.out.println("Third Largest: "+ getThirdLargest());
    }
}
