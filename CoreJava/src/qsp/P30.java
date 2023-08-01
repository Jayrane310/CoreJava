package qsp;

public class P30 {
	int id;
	String name;
	double sal;
	//1//
	P30(){
		System.out.println("No Argument");
	}
	//2//
	P30(int id){
		this();
		this.id=id;
		System.out.println("1FA");
	}
	//3//
	P30(int id,String name){
		this(id);
		this.name=name;
		System.out.println("2FA");
	}
	//4//
	P30(int id,String name,double sal){
		this(id,name);
		this.sal=sal;
		System.out.println("3FA");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       P30 e4=new P30(30,"leela",25000);
       System.out.println("id:"+e4.id);
       System.out.println("name:"+e4.name);
       System.out.println("sal:"+e4.sal);
	}

}
