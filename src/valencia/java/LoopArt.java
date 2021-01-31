package valencia.java;

public class LoopArt {
    public static void main(String[] args) {
        String end = "<>";
        String header = "#================#";
        System.out.println(header);
        for(int j = 0; j<8; j++) {
            int i = j;

            if(j>3) {
                i = 7-j;
            }

            String spaceString = "";
            String dotString = "";

            for(int q = 0; q < 4*i; q++) {
                dotString += ".";
            }

            for(int k = 0; k < (16-(4+4*i))/2; k++) {
                spaceString += " ";
            }
            /*
            NOTE: For my first drafts I used the following String.repeat() method to repeat a string multiple times.
            It was much more efficient and much simpler but I thought you would prefer it if I wrote my program
            without using any special methods.

            String spaceString = " ".repeat(numSpaces);
            String dotString = ".".repeat(4*i);
             */
            System.out.println("|" + spaceString + "<>" + dotString + "<>" + spaceString + "|");
        }
        System.out.println(header);
    }
}
