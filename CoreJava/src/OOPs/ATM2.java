package OOPs;

public class ATM2 {//1//
     private double money=85000; //states
     //permission---->getter method---->to get private data
     public double getMoney() {
    	 return money;
     }
     //permission---->setter method---->to set private data
     public void setMoney(double money) {
		this.money=money;
	}
     public void withdraw() {//behaviour
    	 System.out.println("u can withdraw money");
     }
}
