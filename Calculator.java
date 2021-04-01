package Tdd;

public class Calculator {

  public int add(int firstNumber, int secondNumber){
      int sum = firstNumber + secondNumber;
      return sum;
  }

  public int multiply(int firstNumber, int secondNumber){
      return firstNumber * secondNumber;
  }


    public double division(int firstNumber, int secondNumber) {
      if (secondNumber == 0){
          return 0;
      }return  firstNumber/(secondNumber*1.0);

    }

    public int subtract(int firstNumber, int secondNumber) {
      if(firstNumber>secondNumber){
          return firstNumber-secondNumber;
      }return secondNumber-firstNumber;
    }
}
