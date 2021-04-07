package valencia.java;

class Scratch {
    public static void main(String[] args) {
        //System.out.println(nonRecursive(50));
        //System.out.println(nontail(50));
        System.out.println(tail(50,1,0));

        //Question 4
        // Audio explanation here:
        // https://drive.google.com/file/d/1TFI90QVyi-TO59ZszlPrgPokdQousdO0/view?usp=sharing


        //Question 5
        /*
        We know that the stack overflow limit for the non-tail recursive method is in the range 51-55.
        nontail(50) works (albeit very slowly) and returns an answer.
        However, any number above that takes way too long.
        nontail(55) ran for 2 hours without finishing
        At which point repl.it shut the program down automatically.
         */

        //Question 6 and 7
        /*
        NOTE: Daniel and I have the same explanation for question 6 and 7:
        https://docs.google.com/document/d/1YZ4IsV0C1B6dtnrtDdySqkXQFRAzNvcxGIUvBjElFCk/edit?usp=sharing
         */

    }

    //Question 1
    public static int nonRecursive(int n) {
        // Uncomment to see stack trace
        //new Exception().printStackTrace();
        int first = 1, second = 0, temp = 0;
        for (int i = 1; i < n; i++) {
            temp = first;
            first += second;
            second = temp;
        }
        return first;

    }
    //Question 2
    public static int nontail(int n) {
        // Uncomment to see stack trace
        //new Exception().printStackTrace();
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return nontail(n - 1) + nontail(n - 2);
    }
    //Question 3
    public static int tail(int n, int primary, int secondary){
        // Uncomment to see stack trace
        //new Exception().printStackTrace();
        if (n == 1)
            return primary;
        return tail(n - 1, primary + secondary, primary);
    }


}
