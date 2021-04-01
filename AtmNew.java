package Tdd;

public class AtmNew {

    private String pin;
    private double balance;


    public void setPin(String pin) {
        if (pin.length() == 4 ) {
            if(!pin.equals("0000"))
            this.pin = pin;
        }else{
            System.out.println("Invalid pin Selection");
        }
    }


    public String getPin() {
        return pin;
    }

    public void setBalance(int amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setDeposit(double amount) {
        if(amount > 1){
        balance = balance + amount;}
        else System.out.println("wrong transaction");
    }

//    public double withdraw() {
//      return   balance = balance - amount;
//    }

    public void setWithdraw(double amount, String pin) {
        if(amount > 0 && pin.equals(this.pin)){
        balance = balance - amount;
    }else System.out.println("invalid Transaction");
    }
}
