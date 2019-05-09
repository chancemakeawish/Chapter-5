import java.util.Scanner;

public class Triangle{

    public static void main(String[] args) {

        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("What type of triangle are you solving for?");
        System.out.println("1. Right Triangle");
        System.out.println("2. Iscoceles");
        System.out.println("3. Equalateral");

        choice = input.nextInt();

        if(choice == 1)
            rightTrinagle();
        else if(choice == 2)
            isocelesTriangle();
        else if(choice == 3)
            eqaulateralTriangle();
        else
            triangleDoesNotExist();

    }
    public static void  isocelesTriangle(){
        //triangle with two equal sides always try to find the base amd area
        Scanner input = new Scanner(System.in);
        double sideB;
        double sideC;
        String sideChoice;

        System.out.println("What side of the triangle are you trying to solve for? B, or C");
        sideChoice = input.next();

        if (sideChoice.equals("A")) {
            System.out.println("What is side B? >>> ");
            sideB = input.nextDouble();
            System.out.println("What is side C? >>>");
            sideC = input.nextDouble();
            calculateSideA(sideB, sideC, sideChoice);
        }
        else if (sideChoice.equals("B")) {

        }
        else if (sideChoice.equals("c")){

        }
        else
            System.out.print("That side does not exist on a triangle dummy!!!!!");

    }
    public static void   eqaulateralTriangle(){
        //all sides are equal find the parimeter and height
    }
    public static void rightTrinagle(){
        Scanner input = new Scanner(System.in);
        double sideA;
        double sideB;
        double sideC;
        String sideChoice;

        System.out.println("What side of the triangle are you trying to solve for? A, B, or C");
        sideChoice = input.next();

        if (sideChoice.equals("A")) {
            System.out.println("What is side B? >>> ");
            sideB = input.nextDouble();
            System.out.println("What is side C? >>>");
            sideC = input.nextDouble();
            calculateSideA(sideB, sideC, sideChoice);
        }
        else if (sideChoice.equals("B")) {

        }
        else if (sideChoice.equals("c")){

        }
        else
            System.out.print("That side does not exist on a triangle dummy!!!!!");

    }
    public static void calculateSideA(double b, double c, String choice){
        double a;

        a = Math.sqrt(c * c - b * b);
        System.out.println("The side " + choice);
    }
    public static void triangleDoesNotExist(){
        System.out.print("That side does not exist on a triangle dummy!!!!!");
    }
}

