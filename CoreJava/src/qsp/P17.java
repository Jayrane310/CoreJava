package qsp;

public class P17 {
    static long a; //static variable
    static double b;
    
    public static void qspider() {
	System.out.println("qsp B");
	System.out.println(a);
	System.out.println(b);
	a=16;
	b=12.5;
	java();
	System.out.println("qsp E");
	}
    public static void java() {
    System.out.println("Java B");
    System.out.println(a);
    System.out.println(b);
    a=24;
    b=42.2;
    System.out.println("Java E");
    }
    static {
    	System.out.println("SIB-1");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Main B");
     qspider();
     char a='c';
     System.out.println(a);
     System.out.println(b);
     System.out.println("Main E");
	}
	static {
		java();
	}

}
