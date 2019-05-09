import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        int userGuess;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.\n");
        System.out.println("Pick an number 1 to 10\n");
        System.out.println("Guess correctly win a prize.\n");
        System.out.print("Pick a number >>>>>>>");
        userGuess = input.nextInt();
        int random = (int) (Math.random() * 10 + 1);

        if(userGuess == random) {
            System.out.println("Guess Correctly!!! Connor has your prize out back");
        }
        else if(userGuess > random) {
            System.out.println("Wrong number it was to high");
        }
        else if(userGuess < random) {
            System.out.println("Wrong number it was to low");
        }
        else {
            System.out.println("The number was outside the range of 1 - 10");
        }

    }

}