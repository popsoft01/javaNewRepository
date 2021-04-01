
public class comparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int firstName;
        int secondName;

        System.out.println("Enter the first number");
        firstName = input.nextInt();

        System.out.println("Enter the second number");
        secondName = input.nextInt();

        if (firstName == secondName)
            System.out.printf("%d == %d%n", firstName, secondName);

        if (firstName != secondName)
            System.out.printf("%d != %d%n", firstName, secondName);

        if (firstName < secondName)
            System.out.printf("%d < %d%n", firstName, secondName);

        if (firstName > secondName)
            System.out.printf("%d > %d%n", firstName, secondName);

        if (firstName <= secondName)
            System.out.printf("%d <= %d%n", firstName, secondName);

        if (firstName >= secondName)
            System.out.printf("%d >= %d%n", firstName, secondName);
    }
}