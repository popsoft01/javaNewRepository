public class Account5{
	private String name;
	private double balance;

	public Account5(String name, double balance){
		this.name = name;
		if(balance > 0.0)
		this.balance = balance;
	}
	public void deposit(double depositAmount){
		balance = balance + depositAmount;
	}
	public double getBalance(){
		return balance;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

}