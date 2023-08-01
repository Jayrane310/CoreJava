package Wrapper;

public class W1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer i=Integer.valueOf(30);
      int a=i; //auto boxing
      System.out.println(a);
      Integer i1=Integer.valueOf(50);
      int a1=i1.intValue(); //explicit boxing
      System.out.println(a1);
      float f=i1.floatValue(); //explicit unboxing
      System.out.println(f);
	}

}
