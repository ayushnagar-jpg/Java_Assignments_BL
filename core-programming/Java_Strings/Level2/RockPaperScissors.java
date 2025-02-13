import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper")))
            return "User Wins";
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Rock, Paper, or Scissors: ");
        String userChoice = scanner.nextLine();

        String computerChoice = getComputerChoice();
        String result = determineWinner(userChoice, computerChoice);

        System.out.println("\nUser: " + userChoice);
        System.out.println("Computer: " + computerChoice);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
