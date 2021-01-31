package valencia.java;

public class AdditionPattern {
    private int startingNumber;
    private int val;
    private int currentNumber;
    public AdditionPattern(int startingNumber, int val) {
        this.startingNumber = startingNumber;
        this.val = val;
        currentNumber = startingNumber;
    }
    public int currentNumber() {
        return currentNumber;
    }
    public void next() {
        currentNumber += val;
    }
    public void prev() {
        if ((currentNumber-val) >= startingNumber) {
            currentNumber -= val;
        }

    }
}