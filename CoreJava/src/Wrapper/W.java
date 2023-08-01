package Wrapper;

public class W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10;
      System.out.println("a"+a);
      Integer i=a; //auto boxing
      System.out.println("i"+i);
      System.out.println(i.toString());
      Integer i1=Integer.valueOf(50); //explicit boxing
      System.out.println(i1);
      System.out.println(i1.toString());
	}

}
