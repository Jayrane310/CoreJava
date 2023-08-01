/*create a class consist of four methods to perform addition of four numbers,
substraction of six numbers,multiplication of five numbers,division of two numbers*/

package qsp;

public class P6 {
    public static void add() {
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=a+b+c+d;
		System.out.println(e);
	}
    public static void sub() {
    	int a=150;
		int b=20;
		int c=30;
		int d=40;
		int e=20;
		int f=10;
		int g=a-b-c-d-e-f;
		System.out.println(g);
    }
    public static void multi() {
    	int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=(a*b*c*d*e);
		System.out.println(f);
    }
    public static void div() {
    	int a=100;
		int b=10;
		int c=(a/b);
		System.out.println(c);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       add();
       sub();
       multi();
       div();
	}

}
