

import java.util.Scanner;

public class PalinDrome {
    public static void main(String... args){

                int num , reversedInteger = 0, remainder, originalInteger;
                Scanner input = new Scanner(System.in);

                System.out.println("enter your digit");
                num = input.nextInt();

                originalInteger = num;


                while( num != 0 )
                {
                    remainder = num % 10;

                    reversedInteger = reversedInteger * 10 + remainder;
                    num  /= 10;
                }


                if (originalInteger == reversedInteger)

                    System.out.println(originalInteger + " is a palindrome.");
                else
                    System.out.println(originalInteger + " is not a palindrome.");

    }
}
