import java.util.Scanner;
public class Addition{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int number1;
	int number2;
	int sum;
	
 System.out.print("Enter first integer: "); // prompt
number1 = input.nextInt();

 System.out.print("Enter second integer: "); // prompt
number2 = input.nextInt();

sum = number1 * number2;

System.out.println("sum is " + sum);




	} 
 } 