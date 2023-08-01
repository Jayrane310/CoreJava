package Exceptions;

public class E1 {
     //try catch block
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Begins");
	      System.out.println(30);
	      try {
	    	  System.out.println(15/0);
			
		} catch (Exception ref) { //upcasting //Exception ref= new ArithmeticException();
			// TODO: handle exception
			System.out.println("Handled");
		}
	      System.out.println(90);
	      System.out.println("End");
	}

}
