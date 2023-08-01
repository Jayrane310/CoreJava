package Exceptions;

public class AgeValidator {
    //custom exception
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int age=17; //int age=21;
       if (age <18) {
		throw new InvalidAgeException();
	} else {
       System.out.println("Welcome to the Voting");
	}
  }

}
