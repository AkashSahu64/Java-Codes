import java.util.Random;
import javax.swing.JOptionPane;

public class GuessTheNumber {
    public static void main(String[] args) {
        int lowerRange = 1;
        int upperRange = 100;
        int maxAttempts = 5;
        int score = 0;
        int rounds = 0;

        Random random = new Random();
        int randomNumber = random.nextInt(upperRange - lowerRange + 1) + lowerRange;

        boolean gameOver = false;
        while (!gameOver) {
            int attempts = 0;
            rounds++;
            boolean foundNumber = false;

            JOptionPane.showMessageDialog(null, "Round " + rounds + ": Guess the number between " + lowerRange + " and " + upperRange);

            while (!foundNumber && attempts < maxAttempts) {
                String input = JOptionPane.showInputDialog("Enter your guess:");
                int guess = Integer.parseInt(input);
                attempts++;

                if (guess == randomNumber) {
                    score += maxAttempts - attempts + 1;
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts.");
                    foundNumber = true;
                } else if (guess < randomNumber) {
                    JOptionPane.showMessageDialog(null, "Too low! Guess a higher number.");
                } else {
                    JOptionPane.showMessageDialog(null, "Too high! Guess a lower number.");
                }
            }

            if (!foundNumber) {
                JOptionPane.showMessageDialog(null, "Game over! The number was " + randomNumber);
            }

            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.NO_OPTION) {
                gameOver = true;
            } else {
                randomNumber = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
            }
        }

        JOptionPane.showMessageDialog(null, "Game over! Your final score is " + score);
    }
}

