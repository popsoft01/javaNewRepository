

import java.util.Scanner;

public class mp3Repeat {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat){
            System.out.println("playing current song");
            System.out.println("would you like to take this song of repeat? if so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("playing next song");
    }
}
