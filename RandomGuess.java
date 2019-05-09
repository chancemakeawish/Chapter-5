import java.util.Scanner;

public class RandomGuess
{

    public static void main(String[] args) {

        int user;
        String result = null;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number >>>>");
        System.out.print("1) for Higher");
        System.out.print("2) for Lower");
        user = input.nextInt();

        int random = (int)(Math.random() * 3 + 1);

        if (user == 1) {
            if(random == 1)
                result = "Higher";
            else if(random == 2)
                result = "Lower";
            else
                result = "Win";
        }
        System.out.println(result);
    }
}
