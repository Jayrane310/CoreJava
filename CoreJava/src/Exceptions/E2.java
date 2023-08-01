package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E2 {//try multiple catch block
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter Value");
    	  int a=sc.nextInt();
    	  System.out.println(a);
    	  System.out.println(67/0);
		
	} catch (ArithmeticException ref) {
		// TODO: handle exception
		System.out.println("Arithmetic Handled");
		
	}catch (InputMismatchException ref) {
		// TODO: handle exception
		System.out.println("Mismatch Handled");
	}
      
 }

}
