package Tdd;

public class RandomCharMain {
    public static void main(String[] args) {
        final int NUMBER_OF_CHAR =200;
        final int XTER_PER_LINE =10;

        for (int XterNumber = 0; XterNumber < NUMBER_OF_CHAR; XterNumber++){
            char xter = RandomCharacter.getRandomNumber('a','z');
            if ((xter + 1) % XTER_PER_LINE == 0)
                System.out.println(xter);
            else
                System.out.print(xter);
        }

    }
}
