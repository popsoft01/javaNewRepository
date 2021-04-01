
import java.util.Scanner;

public class CompareInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondName;

        System.out.println("Enter the first number");
        firstNumber = input.nextInt();

        System.out.println("Enter the second number");
        secondName = input.nextInt();

        if( firstNumber < secondName)
            System.out.println(secondName + " is larger");
        if (firstNumber > secondName)
            System.out.println(firstNumber + " is lager");
    }
}
