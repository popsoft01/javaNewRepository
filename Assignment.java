
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args){
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int result;

        Scanner ass = new Scanner(System.in);

        System.out.print("Enter the first number");
        firstNumber = ass.nextInt();

        System.out.print("Enter the Second number");
        secondNumber = ass.nextInt();

        System.out.print("Enter the third number");
        thirdNumber = ass.nextInt();

        result = firstNumber * secondNumber * thirdNumber;

        System.out.print("The result of the product of the three number is: " + result);
    }
}
