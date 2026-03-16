package Level_2;

import java.util.Scanner;

public class RockPaperScissors {
    public static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "Rock";
        if (r == 1) return "Paper";
        return "Scissors";
    }
    public static String findWinner(String user, String comp) {
        if (user.equals(comp))
            return "Draw";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
                (user.equals("Scissors") && comp.equals("Paper")) ||
                (user.equals("Paper") && comp.equals("Rock")))
            return "User";
        return "Computer";
    }
    public static String[][] stats(int userWins, int compWins, int games) {

        String[][] data = new String[2][3];
        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;
        data[0][0] = "User";
        data[0][1] = String.valueOf(userWins);
        data[0][2] = String.valueOf(userPercent);

        data[1][0] = "Computer";
        data[1][1] = String.valueOf(compWins);
        data[1][2] = String.valueOf(compPercent);
        return data;
    }
    public static void displayStats(String[][] data) {
        System.out.println("\nPlayer\tWins\tWin %");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2]);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = input.nextInt();
        input.nextLine();

        int userWins = 0;
        int compWins = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("\nEnter Rock / Paper / Scissors: ");
            String user = input.nextLine();
            String comp = computerChoice();
            System.out.println("Computer: " + comp);
            String winner = findWinner(user, comp);

            if (winner.equals("User")) {
                userWins++;
                System.out.println("User Wins!");
            }
            else if (winner.equals("Computer")) {
                compWins++;
                System.out.println("Computer Wins!");
            }
            else {
                System.out.println("Draw!");
            }
        }

        String[][] result = stats(userWins, compWins, games);

        displayStats(result);
    }
}