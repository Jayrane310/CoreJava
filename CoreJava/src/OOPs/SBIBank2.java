package OOPs;

public class SBIBank2 {//diverclass

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ATM2 ref=new ATM2();
     //System.out.println("Total amt in ATM:"+ref.money); //CTE
     //ref.money=95000; //CTE
     ref.setMoney(95000);
     System.out.println("Total amt in ATM:"+ref.getMoney());
     ref.withdraw();
	}

}
