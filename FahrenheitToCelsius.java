package ChapterFour;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("enter the degree of temperature");
        double fahrenheit = temp.nextDouble();

        double celsius = (5.0/9)*(fahrenheit - 32);
        System.out.println("fahreheit is " + fahrenheit + " is "+ celsius +" in celsius");
    }
}
