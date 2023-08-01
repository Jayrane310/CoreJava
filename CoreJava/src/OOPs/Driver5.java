package OOPs;

public class Driver5 {//driverclass

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Fruit1 f=new Mango1(); //upcasting
          System.out.println("i:"+f.i);
          
        //System.out.println("j:"+f.j); //CTE
          
          Mango1 m=(Mango1)f; //downcasting
          System.out.println("j:"+m.j);
	}

}
