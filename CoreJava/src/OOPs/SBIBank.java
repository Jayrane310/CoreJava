package OOPs;

public class SBIBank {//driverclass

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ATM ref=new ATM();
     System.out.println("Total amt in ATM:"+ref.money);
     ref.withdraw();
	}

}
