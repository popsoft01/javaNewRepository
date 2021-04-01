package ChapterFour;

import java.util.Scanner;

public class AverageTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double average;
       int userCollect = 0;
       int totalCollect = 0;
       int score = 0;

        while (userCollect < 3){
            System.out.println("Enter the score");
             score = input.nextInt();
             if(score >= 0 && score <= 100){
            totalCollect = totalCollect + score;
            userCollect+=1;}

        }
        average = totalCollect/userCollect;
        System.out.println("the average is :" + average);

    }
}
