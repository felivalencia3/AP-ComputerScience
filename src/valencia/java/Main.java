package valencia.java;

public class Main {
    public static boolean string_skip_checker(String s) {

        for(int i = 0; i <= s.length()-2; i++) {
            if (s.length()<3) {
                return false;
            }
            if(s.substring(i,i+1).equals(s.substring(i+2,i+3))) {

                return true;

            }

        }

        return false;

    }
    public static void main(String[] args) {
        System.out.println(string_skip_checker("a"));
        /*
        boolean rsvp = true;
        int selection = 1;
        if (rsvp && selection == 1) {
            System.out.println("Thanks for attending. You will be served beef.");
        } else if (rsvp && selection == 2) {
            System.out.println("Thanks for attending. You will be served chicken.");
        } else if (rsvp && selection == 3) {
            System.out.println("Thanks for attending. You will be served pasta.");
        } else if (rsvp) {
            System.out.println("Thanks for attending. You will be served fish");
        } else if (!rsvp) {
            System.out.println("Sorry you can't make it.");
        }

         */
    }
}
