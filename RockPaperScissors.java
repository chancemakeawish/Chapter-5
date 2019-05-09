import java.util.Scanner;


public class RockPaperScissors {

    public static void main(String[] args) {

        int user;
        String result = null;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number >>>>");
        System.out.print("1) for rock");
        System.out.print("2) for paper");
        System.out.print("3) for scissor");
        user = input.nextInt();

        int random = (int)(Math.random() * 3 + 1);

        if (user == 1) {
            if(random == 1)
                result = "Tie";
            else if(random == 2)
                result = "Lose";
            else
                result = "Win";
        }
        System.out.println(result);
    }
}

