package valencia.java;

public class BinarySearch {
    //Question 1
    public static int binarySearch(int[] arr, int toFind) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int middle = (min + max) / 2;
            if (arr[middle] > toFind) {
                max = middle-1;
            }
            else if (arr[middle] == toFind) {
                return middle;
            }
            else {
                min = middle+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Question 2
        int[] foo = {1,2,3,4,5,6};
        System.out.println("Find the index of 1. Should return 0:");
        System.out.println(binarySearch(foo,1));
        System.out.println("\nFind the index of 6. Should return 5:");
        System.out.println(binarySearch(foo,6));
        System.out.println("\nFind the index of 7. Should return -1:");
        System.out.println(binarySearch(foo,7));
    }
    //Question 3
    /*
        Number of operations for worst case scenarios.
        1) For n = 8:
        (1) 8/2 = 4
        (2) 4/2 = 2
        (3) 2/2 = 1
        So, the code had to split the array 3 times to find the element.
        In other words, the while loop ran 3 times.

        2) For n = 32:
        (1) 32/2 = 16
        (2) 16/2 = 8
        (3) 8/2 = 4
        (4) 4/2 = 2
        (5) 2/2 = 1

        The code had to split the array 5 times to find the element.

        3) For n = 64
        (1) 64/2 = 32
        (2) 32/2 = 16
        (3) 16/2 = 8
        (4) 8/2 = 4
        (5) 4/2 = 2
        (6) 2/2 = 1

        This time the code had to split the array 6 times.
        A pattern is starting to emerge.
        The number of items in the array is equal to 2 to the power of the times that the array is split.
        In other words, the number of operations is the log, base 2, of the number of elements.
        So log2(64) = 6, the number of times the array is split.

        With that in mind we know that:

        4) The code runs 7 times when n = 128.
        5) The code runs 8 times n = 256.
     */

    //Question 4
    /*
    So, if I were to plot the number of operations vs the array size I would be plotting:
    (8,3)
    (32,5)
    (64,6)
    (128,7)
    (256,8)

    // Note: I wasn't too sure what you meant by plot.
    I didn't know if you wanted me to make a graph of n vs number of operations.
    So I did it anyway just in case.
    You can find it here:
    https://www.desmos.com/calculator/vlwrpqahhn
     */
}
