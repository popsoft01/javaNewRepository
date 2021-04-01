import java.util.Scanner;
public class NewGrade{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
double score;
System.out.println("enter the score");

score = input.nextInt();

if (score >= 90){
System.out.println("A");
}else
if (score < 90 && score >= 80){
System.out.println("B");}
else
if (score < 80 && score >= 70){
System.out.println("C");}
else
if (score < 70 ){
System.out.println("f");}





}
}