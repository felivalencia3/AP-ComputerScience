package valencia.java;

import java.util.Arrays;

public class BubbleAndInsertionSort {
    //Question 1
    /*
    I have drawn out, by hand, the steps of a bubble sort on the array you provided and uploaded them here:
    https://drive.google.com/drive/folders/1oqWAHZscqakj8UKOFWd-05Kb0MbAbdjv?usp=sharing
    (You'll need your dwight global account to access it.)
     */
    //Question 2
    public static void bubbleSort(int arr[]) {
        boolean didSwap;
        for (int i = 0; i < arr.length-1; i++) {
            didSwap = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    didSwap = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if(!didSwap) {
                break;
            }
        }
    }
    /*
    Question 3:
    To prove that the complexity of bubble sort is O(n^2),
    To begin I will use the following array: [6,5,4,3,2,1].
    When bubble sort is run on the array, the 6 moves 5 spaces to the right until it reaches the end.
    So, the array would be [5,4,3,2,1,6]
    Then, the 5 moves 4 spaces to the right to make: [4,3,2,1,5,6]
    Then, the 4 moves 3 spaces to the right to make: [3,2,1,4,5,6]
    As you can see there is a pattern here.
    In the first "loop" of the algorithm, given an array size n, the algorithm makes n-1 swaps.
    In the second loop, the algorithm makes n-2 swaps.
    Then, n-3,n-4, and so on.
    So, in total the number of swaps and comparisons will be:
    (n-1)+(n-2)+(n-3)+(n-4).... (All the way down to zero)
    This sequence can also be expressed as:
    n(n-1)/2 or n * (n-1) * 1/2.
    If we expand this expression we get:
    (n^2-n)/2.
    And, as you can see the highest exponent in the expression is two.
    So, the time complexity of bubble sort will be:
    O(n^2).
     */

    /*
    Question 4:
    I think I already made several optimizations in my code.
    Writing out the steps of bubble sort by hand made me see that it would be more efficient
    if the code stopped as soon as it went through the array and didn't make any changes.
    For that reason I implemented the didSwap variable. (Something I had never done before)
    This variable kept track of whether I had swapped a variable in the iteration.
    If the iteration completed without swapping any numbers, then I would know that the array is already sorted.
    And I would break the loop.
    Additionally, I defined the nested for loop, the one that updates the j variable, to go up to array.length-i-1.
    Since I was taught to do that the first time I learned bubble sort, I've kept it as a habit.
    However, once you think about it, it makes sense because it would be redundant to go over
    and compare the numbers that have already been sorted.
    .
     */

    // Q2: Insertion Sort
    /*
    Just like before, I have uploaded my hand written steps here:
    https://drive.google.com/drive/folders/1jVGfNa5wQUwqQiqu_lij7OlqgHURgZSk?usp=sharing

    Note: this time I did it differently.
    This time, I wrote a simple step by step explanation that shows the sorting algorithm more conceptually.
    And then, I made another, more complex and more detailed, explanation that actually follows the code.
    The simple explanation is titled: SimpleStepByStep.
    The detailed explanation is titled: DetailedStepByStep.
     */
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int unsorted = arr[i];
            int j = i - 1;
            if(i > 0) {
                while (j >= 0 && arr[j] > unsorted) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = unsorted;
            }
        }
    }

    /*
    Question 3:
    Once again I'll use an example array to demonstrate.
    Take this array: [4,3,2,1]
    When Insertion sort is run on this array it:
    Moves the 3, one step/index to the left,
    Moves the 2, two steps to the left
    Moves the 1, three steps to the left.
    This pattern repeats itself with any other array in descending order.
    So the rightmost element will be moved n-1 steps and compared n-1 times.
    This means that there are two operations going on every iteration: comparison and insertion.
    Similarly, the second to last element needs n-2 steps and n-2 comparisons and so on.
    Therefore the total number of operations is:
    2 * (n-1 + n-2 + n-3.....3+2+1).
    I am multiplying by 2 because, as I said before, each iteration performs two operations.
    Similar to the Bubble Sort expression we can rewrite this sequence as:
    2 * n * (n-1) * 1/2.
    When simplified that expression gives: (n^2-n)
    Since the highest power in the expression is n^2, the complexity of insertion sort is: O(n^2).
     */
    /*
    Question 4:
    There is an optimization that I realized I could do as I was writing the code, however I decided to leave it in so I could explain it here.
    I am referring to the fact that I needlessly checked i on line 85.
    The necessity for that if statement could have easily been avoided if I had simply started my for loop from 1 and not from 0.
    Like this: for (int i = 1; i < arr.length; ++i)
    As I said, I realized this while I coded, and could have easily fixed it, but I left it in to be able to explain it here.
     */
    public static void main(String[] args) {
        int[] forBubble = {8,1,3,9,7,3,2};
        int[] forInsertion = {8,1,3,9,7,3,2};
        // Bubble Sort
        bubbleSort(forBubble);
        System.out.println("Bubble Sort: "+Arrays.toString(forBubble));
        //Insertion Sort
        insertionSort(forInsertion);
        System.out.println("Insertion Sort: "+Arrays.toString(forInsertion));

    }
}
