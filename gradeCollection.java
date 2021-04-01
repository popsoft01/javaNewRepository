package ChapterFour;

import java.util.Scanner;

public class gradeCollection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = 0;
        int gradeCount = 0;
        while (gradeCount <= 3){
            System.out.println("Enter the Score : ");
            int score = input.nextInt();
            grade = grade + score;
            gradeCount++;
        }
        System.out.println(grade);
        double average = grade/(gradeCount*1.0);
        System.out.println(average);
    }
}
