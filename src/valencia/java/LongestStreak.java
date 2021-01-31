package valencia.java;

public class LongestStreak {
    public static void longestStreak(String str) {

        String letter = str.substring(0,1);

        int streak = 1;

        int localStreak = 1;

        for(int i = 0; i < str.length()-1; i++) {
            if(str.substring(i,i+1).equals(str.substring(i+1,i+2))) {
                localStreak += 1;
                if (localStreak > streak) {
                    letter = str.substring(i, i+1);
                    streak = localStreak;
                }
            }

            else {
                localStreak = 1;
            }


        }
        System.out.println(letter+" "+streak);
    }

    public static void main(String[] args) {
        longestStreak("FFFELIPEEE!");
    }
}
