import java.util.Scanner;

public class DiameterCircumferenceArea {
    public static void main(String... args){
        int radius;
        float diameter;
        float cicumference;
        float area;
        double pi = Math.PI;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = input.nextInt();

        System.out.printf("the diameter is: %s%n",  2 * radius);
        System.out.printf("the cicumference = %s%n", 2 *pi *radius);
        System.out.printf("the area = %s%n", pi * radius * radius);

    }
}
