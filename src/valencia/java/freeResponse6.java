package valencia.java;

public class freeResponse6 {

    public static void endingInIng(String[] words) {
        for (String word : words) {
            if (word.substring(word.length() - 3).equals("ing")) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"butting","fading", "trailing", "batting", "Felipe"};
        endingInIng(words);
    }
}
