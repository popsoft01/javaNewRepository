package Tdd;

public class NewFactorNumber {


    public double setDivisor(int userNumber) {
        int divisor =1;
        for (; divisor <= userNumber; divisor++){
           if (userNumber % divisor == 0)
                System.out.println(divisor);
        }

        return userNumber;
    }

}
