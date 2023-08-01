package OOPs;

public class Driver6 { //driverclass

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Fruit1 f=new Fruit1(); //super class
      System.out.println("i:"+f.i);
      
      Mango1 m=(Mango1) f;  //downcasting
      System.out.println("j:"+m.j); //ClassCastException
	}

}
