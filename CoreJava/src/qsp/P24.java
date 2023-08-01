package qsp;

public class P24 {
	int a=0;
    float f;
    {
      System.out.println("IIB-1");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Main Begins");
      P24 ref=new P24();
      System.out.println(ref.a);
      System.out.println(ref.f);
      System.out.println("Main Ends");
	}
	public void demo() {
		float f=3.5f;
		System.out.println("Demo Begins");
		System.out.println(f);
		this.f=6.8f;
		System.out.println(a);
		System.out.println("Demo Ends");
	}
	{
		System.out.println("IIB-2");
		demo();
	}
}
