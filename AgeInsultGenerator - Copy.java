import java.util.Scanner;

public class AgeInsultGenerator
{
    public static void main(String[] args) {

        int age;
        String job;
        String result = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to my age insult generator.");
        System.out.print("Please enter your age >>>> ");
        age = input.nextInt();

        if (age <= 12) {
            result = "You are not a teenager, and probably needs to learn how to use deodorant. ";
        }
        else if (age <= 12 && age < 20){
            result = "You might be a teenager. ";
        }
        else if (age >= 21 && age < 30) {
            result = "I hope you went to college and got a job!";
            System.out.print("Did you get a job >>>> ");
            job = input.next();
            if (job == "Yes") {
                result = "Yes, i have a job";
            } else
                result = "No, I am a dead beat";
        }
        else if (age >= 31 && age < 40){
            result = "Your old man.";
        }
        displayResult(result);
    }
    public static void displayResult(String result){
        System.out.println(result);
    }
}
