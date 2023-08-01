package qsp;

public class P16 {
    static String a; //static variable
    static boolean b; //static variable
    
    public static void java() {
	System.out.println("Java B");
	System.out.println(a);
	System.out.println(b);
	
	a="sheela";
	b=true;
	
	System.out.println("Java E");
	}
    static {
    	System.out.println("SIB-1");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Main Begins");
        java();
        System.out.println(a);
        System.out.println(b);
        System.out.println("Main Ends");
	}
	static {
		System.out.println("SIB-2");
	}

}
