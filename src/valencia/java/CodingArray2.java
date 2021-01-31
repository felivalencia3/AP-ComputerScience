package valencia.java;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingArray2 {
    //Question 1
    public static boolean palindromeChecker(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // Question 2
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[arr.length - 1 - i] = arr[i];
        }
        return reversed;
    }

    // Question 3
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (i < arr.size() - 1 && arr.get(i).equals(arr.get(i + 1))) {
                arr.remove(i + 1);
                i--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Testing
        int[] array = {1, 8, 8, 7, 7, 3, 8};
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer foo : array) {
            list.add(foo);
        }

        //Method Calls
        System.out.println(palindromeChecker(array));
        System.out.println(Arrays.toString(reverse(array)));
        System.out.println(removeDuplicates(list));
    }
}

