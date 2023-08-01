package OOPs;

public class Company {//driver class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Emp ref=new Emp(10,"suraj",50000);
      System.out.println("ID:"+ref.ID);
      System.out.println("Name:"+ref.Name);
      System.out.println("Sal:"+ref.Sal);
      
      System.out.println("=================");
      
      Emp ref1=new Emp(20,"sanket",40000);
      System.out.println("ID:"+ref1.ID);
      System.out.println("Name:"+ref1.Name);
      System.out.println("Sal:"+ref1.Sal);
      
	}

}
