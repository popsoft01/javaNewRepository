package Tdd;

public class RandomCharacter {
    public static char getRandomNumber(char xterOne, char xterTwo) {
        return (char) (xterOne + Math.random() * (xterTwo -xterOne + 1));
    }

    public static char getRandomLowerCaseAlphabet(char a, char z) {
        return getRandomNumber('a','z');
    }

    public static char getRandomUpperCaseAlphabet() {
        return getRandomNumber('A','Z');
    }

    public static char getRandomSpecialCharAlphabet() {
        return getRandomNumber('u', '\uffff');
    }

    public char getRandomNumericValue() {
        return getRandomNumber('0','9');
    }
}
