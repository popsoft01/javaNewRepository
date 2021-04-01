
import java.util.Scanner;

public class Multiples {
    public static void main(String... args){
        int firstName;
        int secondName;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        firstName = input.nextInt();

        System.out.println("Enter the second number");
        secondName = input.nextInt();

        boolean modulo = firstName % secondName == 0;
            System.out.println(modulo);

        boolean secondModulo = secondName % firstName == 0;
        System.out.println(secondModulo);
    }
}
