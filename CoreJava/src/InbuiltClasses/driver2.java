package InbuiltClasses;

public class driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mobile1 m1=new Mobile1("iphone",79999.9);
        System.out.println(m1);
        
        Mobile1 m2=new Mobile1("iphone",79999.9);
        System.out.println(m2);
        
        System.out.println(m1==m2); //false
        System.out.println(m1.equals(m2)); //true
	}

}
