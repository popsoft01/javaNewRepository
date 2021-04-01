package ChapterFour;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the yearly interest rate");
        double annualInterest = input.nextDouble();

        double monthlyInterstRate = annualInterest/12.0;

        System.out.println("Enter the number of years : ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter the loan amount : ");
        double loanAmount = input.nextDouble();

        double monthlyRepayment = loanAmount * monthlyInterstRate/(1-1)/Math.pow(1 + monthlyInterstRate, numberOfYears * 12);
        double totalpayment = monthlyRepayment *  numberOfYears * 12;
        System.out.println("monthly payment is : "+ (monthlyRepayment * 100)/100);
    }
}
