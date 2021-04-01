
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner calculator = new Scanner(System.in);
        int firstnumber;
        int secondNumber;
        int addittion;
        int division;
        int difference;
        int product;

        System.out.print("Enter the first number: ");
        firstnumber = calculator.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = calculator.nextInt();

        System.out.println("Calculation start here");

        addittion = firstnumber + secondNumber;

        division = firstnumber / secondNumber;

        difference = firstnumber - secondNumber;

        product = firstnumber * secondNumber;

        System.out.println("The result for addition is : " + addittion);

        System.out.println("The result for division is : " + division);

        System.out.println("The result for difference is : " + difference);

        System.out.println("The result for product is : " + product);


    }
}
