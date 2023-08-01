package qsp;

public class P27 {
    int a; //non-static variable/global variable
    P27(int a){
    	this.a=a;
    	System.out.println("One Formal Argument Constructor");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      P27 ref=new P27(50);
      System.out.println(ref.a);
	}

}
