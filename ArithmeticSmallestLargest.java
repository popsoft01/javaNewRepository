
import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String... args){
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = input.nextInt();

        System.out.print("Enter the third number: ");
        thirdNumber = input.nextInt();

        System.out.println("Let the calculation begin");

        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("the sum of the number is : " + sum);

        int average = sum/3;
        System.out.println("The average of the number is:" + average);

        int product = firstNumber * secondNumber * thirdNumber;
        System.out.println("The product of the number is : " + product);

        int com = firstNumber < secondNumber? firstNumber:secondNumber;
        int result = thirdNumber < com ? thirdNumber:com;
        System.out.println("Smallest number is: " + result);

        int big = firstNumber > secondNumber? firstNumber:secondNumber;
        int resultBig = thirdNumber > big ? thirdNumber:big;
        System.out.println("biggest number is: " + resultBig);
    }
}
