package valencia.java;

public class coinGame {

    private int startingCoins;
    private int maxRounds;

    public int getPlayer2Move(int round) {

        int result = 0;
        if (round % 3 == 0) {


            result = 3;


        } else if (round % 2 == 0) {


            result = 2;


        } else {


            result = 1;


        }
        return result;


    }

    public void playGame() {


        int coins1 = startingCoins;
        int coins2 = startingCoins;
        int round = 1;


        while (round <= maxRounds && coins1 >= 3 && coins2 >= 3) {

            int player1Move = getPlayer1Move();
            int player2Move = getPlayer2Move(round);
            coins1 -= player1Move;
            coins2 -= player2Move;

            if (player1Move == player2Move) {

                coins2 += 1;

            } else if (Math.abs(player1Move - player2Move) == 1) {

                coins2 += 1;

            } else {

                coins1 += 2;

            }
            round++;


        }
        if (coins1 == coins2) {

            System.out.println("tie game");

        } else if (coins1 > coins2) {

            System.out.println("player 1 wins");

        } else {

            System.out.println("player 2 wins");

        }


    }

    private int getPlayer1Move() {
        return 0;
    }
}
