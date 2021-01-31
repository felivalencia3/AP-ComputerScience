package valencia.java;

import java.util.Scanner;

class PalindromeBaseTwo {
    // Made a reusable method to reverse a string
    public static String reverseString(String str) {
        String reverseString = "";
        for (int i = str.length(); i > 0; i--) {
            reverseString += str.substring(i - 1, i);
        }
        return reverseString;
    }

    public static void main(String[] args) {
        // Q1: Write code that prompts the user to input a word and then determines if
        // the word is a palindrome.
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease enter a string:");
        String str = scan.nextLine();
        String reverseString = "";
        if (str.equals(reverseString(str))) {
            System.out.println("\nThe word is a palindrome.");
        } else {
            System.out.println("\nThe word is not a palindrome");
        }


        //Q2: Write code that prompts the user to input a number in base two and then have it print out the number in base 10.
        System.out.println("\nEnter a base two number:");
        int baseTwo = scan.nextInt();
        String baseTwoString = String.valueOf(baseTwo);
        int baseTwoLength = baseTwoString.length();
        int baseTen = 0;
        String reverseBaseTwo = reverseString(baseTwoString);
        for (int j = reverseBaseTwo.length(); j > 0; j--) {
            int k = (int) Math.pow(2, j - 1);
            baseTen += k * Integer.parseInt(String.valueOf(reverseBaseTwo).substring(j - 1, j));
        }
        System.out.println("Your number in base ten is: "+baseTen);
    }
}