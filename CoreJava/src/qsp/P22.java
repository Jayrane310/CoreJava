package qsp;

public class P22 {
    int t=10;
    public void test() {
    	int t=5;
    	System.out.println("test begins");
    	System.out.println(this.t);
    	System.out.println("test ends");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("main begins");
       P22 ref=new P22();
       ref.test();
       System.out.println(ref.t);
       System.out.println("main ends");
	}

}
