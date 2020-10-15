package guessingGame;

public class GuessMachine {

    private int number;
    private int numGuesses;
    private int guess;
    private String hint;


    public GuessMachine() {
        numGuesses = 0;
        guess = 0;
        number = (int) (Math.random() * 99 + 1);
    }

        String giveHint() {
            if (guess > number) {
               hint = "You guessed too high guess lower.";
            } else if (guess < number) {
                hint = "You guessed too low guess higher.";
            } else {
                hint = "You got it!";
            }
            return hint;
        }

        boolean setGuess(int number) {
            if (guess >= 1 && guess <= 100) {
                numGuesses += 1;
                return true;
            } else {
                return false;
            }
        }

        int getnumGuesses() {
            return numGuesses;
        }
}
