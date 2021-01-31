package valencia.java;

public class PasswordGenerator {
    private static int count = 0;
    private String password;
    private int length;

    //Constructors
    public PasswordGenerator(int length, String prefix) {
        this.length = length;
        this.password = prefix + ".";
    }

    public PasswordGenerator(int length) {
        this.length = length;
        this.password = "A.";
    }

    //Methods
    public String pwGen() {
        count += 1;
        String digits = "";
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * 10);
            digits += Integer.toString(random);
        }
        return password + digits;
    }

    public int pwCount() {
        return count;
    }
}
