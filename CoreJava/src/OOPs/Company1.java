package OOPs;

public class Company1 { //driverclass

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Emp1 ref=new Emp1(10,"suraj",50000);
	      System.out.println("ID:"+ref.ID);
	      System.out.println("Name:"+ref.Name);
	      ref.setSal(80000);
	      System.out.println("Sal:"+ref.getSal());
	      
	      System.out.println("=================");
	      
	      Emp1 ref1=new Emp1(20,"sanket",40000);
	      System.out.println("ID:"+ref1.ID);
	      System.out.println("Name:"+ref1.Name);
	      ref1.setSal(70000);
	      System.out.println("Sal:"+ref1.getSal());
	      
		
	}

}
