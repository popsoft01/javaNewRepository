import java.util.Scanner;
public class GradeNew{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
double score;
System.out.println("enter the score");

score = input.nextDouble();
if (score >= 0 && score <= 100){
if (score >= 90){
System.out.println("A");
}else
	if (score  >= 80 ){
	System.out.println("B");}
	else
		if (score  >= 70 ){
		System.out.println("C");}
		else
			System.out.println("f");

}
else{
System.out.println("invalid statement");}



}
}