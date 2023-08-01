package OOPs;

public class Driver8 {//driver class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          p ref=new p(); //super class
          System.out.println("i:"+ref.i);
          
          p1 ref1=new p1(); //sub class
          System.out.println("i:"+ref1.i);
          
          p ref2=new p1();  //upcasting
          System.out.println("i:"+ref2.i);
	}

}
