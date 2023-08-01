package InbuiltClasses;

public class driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mobile m1=new Mobile("i-phone",79999.9);
       System.out.println(m1);
       
       Mobile m2=new Mobile("mi",17999.9);
       System.out.println(m2);
       
       System.out.println(m1=m2); //false
       System.out.println(m1.equals(m2)); //false
	}

}
