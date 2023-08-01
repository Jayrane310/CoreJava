package OOPs;

public class FourWheelerDrive {//driverclass

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car ref=new Car("red","bugatti","1000000");
      Car ref1=new Car("yellow","ferrari","2000000");
      
      System.out.println("colour:"+ref.colour);
      System.out.println("brand:"+ref.brand);
      System.out.println("price:"+ref.price);
      
      System.out.println("===================");
      
      System.out.println("colour:"+ref1.colour);
      System.out.println("brand:"+ref1.brand);
      System.out.println("price:"+ref1.price);
      
      System.out.println("===================");
      
      ref.start();
      ref.stop();
      ref.drive();
      
      System.out.println("===================");
      
	}

}
