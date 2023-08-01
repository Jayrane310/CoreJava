package Exceptions;

public class E {//try catch block
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Begins");
      System.out.println(30);
      try {
    	  System.out.println(15/0);
		
	} catch (ArithmeticException ref) {
		// TODO: handle exception
		System.out.println("Handled");
	}
      System.out.println(90);
      System.out.println("End");
	}

}
