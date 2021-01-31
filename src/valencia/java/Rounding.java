package valencia.java;

import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double to round");
        double d = sc.nextDouble();
        double x = ((int)((d*100)+0.5))/100.0;
        System.out.println(x);
    }
}
