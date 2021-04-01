import java.util.Scanner;

public class InputPassed{
	public static void main(String... args){

	double score;

	Scanner input = new Scanner(System.in);

	System.out.println("Enter your Score : ");
	score = input.nextDouble();

	if (score > 40)
	System.out.println("passed");

	if (score <= 40)
	System.out.println("failed");
}		
}