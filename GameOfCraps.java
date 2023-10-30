import java.util.Random;

public class GameOfCraps {
    public static void main(String[] args) {
        int score = getDice();
// check and see if the score is 2,3, or 12 and if it is you lose
        if (score == 2 || score == 3 || score == 12) {
            System.out.println("You lose");
//if score is 7 or 12 you win
        } else if (score == 7 || score == 11) {
            System.out.println("You win");
        } else {
//otherwise keep playing the game
            System.out.println(score + " score is " + score);
            System.out.println("\n");
            int roll;
            do {
                roll = getDice();
            //if the new roll is not 7 or the same as the last score, keep rolling the die
            } while (roll != 7 && roll != score);
            if (roll == 7) {
                System.out.println("You lose");
            } else {
                System.out.println("You win");
            }
        }
    }
    public static int getDice() {
// get two random die numbers
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
// show what the user rolled for the 2 die
        System.out.println("You rolled:");
        System.out.println("\n");
        displayDice(die1);
        System.out.println("\n");
        displayDice(die2);
        System.out.println("\n");
// calculate the score of the roll and show it to the user
        int score = die1 + die2;
        System.out.println(die1 + " + " + die2 + " = " + score);
        return score;
    }
//show the die display
    public static void displayDice(int die) {
        switch (die) {
            case 1:
                System.out.println("|         |");
                System.out.println("|    *    |");
                System.out.println("|         |");
                break;
            case 2:
                System.out.println("| *       |");
                System.out.println("|         |");
                System.out.println("|       * |");
                break;
            case 3:
                System.out.println("| *       |");
                System.out.println("|    *    |");
                System.out.println("|       * |");
                break;
            case 4:
                System.out.println("| *      * |");
                System.out.println("|          |");
                System.out.println("| *      * |");
                break;
            case 5:
                System.out.println("| *     * |");
                System.out.println("|    *    |");
                System.out.println("| *     * |");
                break;
            case 6:
                System.out.println("| *     * |");
                System.out.println("| *     * |");
                System.out.println("| *     * |");
                break;
        }
    }
}
