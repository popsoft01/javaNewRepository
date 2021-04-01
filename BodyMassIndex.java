

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String... args){
        double weight;
        double height;
        double BMI;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight in kilogram : ");
        weight = input.nextDouble();

        System.out.println("Enter the height in meter : ");
        height = input.nextDouble();

        BMI = (weight)/(height * height);

        System.out.println("BMI is : " + BMI);
        if (BMI < 18.5)
            System.out.println("Underweight");

        if (BMI >= 18.5 && BMI <= 24.9)
            System.out.println("Normal");

        if (BMI >= 25 && BMI <= 29.9)
            System.out.println("Overweight");

        if (BMI  >= 30)
            System.out.println("Obese");



    }
}
