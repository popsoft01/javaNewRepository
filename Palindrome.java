package Tdd;

import java.util.Scanner;

public class Palindrome {
 static boolean isPalindrome(String letter){

     
     char[] strCharArray = letter.toCharArray();
     String reversedWord ="";

     for(var character: strCharArray){
         System.out.println(character);

     }
     for (int array = strCharArray.length; array > 0; array--)
         reversedWord = reversedWord + strCharArray[array-1];
     System.out.println(reversedWord);

     if(reversedWord.equals(letter)) {
         return true;
     }
         else{ return false;}

 }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word to check");
        String userInput = input.nextLine();

        if (isPalindrome(userInput.toLowerCase()))
            System.out.println("Yes!!! Word is palindrome");
        else
            System.out.println("no!! word is not palindrome");

    }
}
