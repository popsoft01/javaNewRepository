package com.company;

import java.util.Scanner;

public class OddOrEven1 {
    public static void main(String[] args){
                int number;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a number: ");
                number = input.nextInt();
                if (number % 2 == 0)
                    System.out.println(number + " The number is even number");
                if (number % 2 != 0)
                    System.out.println(number + " The number you enter is Odd");

    }
}
