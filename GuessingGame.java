
import java.util.Scanner;

public class Guessgame {
    public static void  main(String[] args){
        int guessNumber;
        int number = 15;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number");

        guessNumber = input.nextInt();

        if (number == guessNumber){
            System.out.println("congratulation you won!!");}

        if (number < guessNumber){
            System.out.println("sorry the number is less than");}


        if (number > guessNumber){
            System.out.println("sorry the number is greater than");}

    
    }
}
