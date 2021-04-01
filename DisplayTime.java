package ChapterFour;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the time in seconds");
        int seconds = userInput.nextInt();

        int minutes = seconds/60;

        int remain = seconds % 60;

        System.out.println(seconds + " seconds is "+ minutes + " minutes and " + remain + " seconds");

    }
}
