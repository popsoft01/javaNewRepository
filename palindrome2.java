

import java.util.Scanner;

public class palindrome2 {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter your first number");
        int firstNumber = input.nextInt();

        System.out.println("enter your second number");
        int secondNumber = input.nextInt();

        System.out.println("enter your third number");
        int thirdNumber = input.nextInt();

        System.out.println("the number is : "+ firstNumber + secondNumber + thirdNumber);
        if (firstNumber == thirdNumber)
            System.out.println(firstNumber + secondNumber+ thirdNumber+ " your input is palindrome");
        else System.out.println("your input is not palindrome");


    }
}
