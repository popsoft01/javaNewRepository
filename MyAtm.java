package Tdd;

public class MyAtm {
    private  double balance;
    private int pin;

    public double setDeposit(double amount) {
        if(amount < 0){
            System.out.println("invalid Transaction");
        }else
            balance = balance + amount;
        return balance;
    }

    public double getWithdraw(double balance, double amount) {
        if (amount < 0 ||  amount > balance){
            System.out.println("Invalid Transaction");
        }else
            balance = balance - amount;
        return balance;
    }

    public double getTransfer(double balance, double amount) {
        if(amount<0 || amount>balance){
            System.out.println("insufficient fund");
        }else
        balance = balance - amount;
        return balance;
    }

    public void setPin(int i) {
        this.pin = i;
    }

    public int getPin() {
        return this.pin;
    }
}
