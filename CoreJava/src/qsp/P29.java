/*create a class consist of employee id,employee name and salary 
  (i)create no argument constructor
  (ii)create one formal argument constructor to initialize employee id
  (iii)create two formal argument constructor to initialize employee id and employee name
  (iv)create three formal argument constructor to initialize employee id,name as well as salary
  (v)create employee objects for each constructor
  (vi)achieve constructor overloading then print employee details for every objects*/
package qsp;

public class P29 {
    int id;
    String name;
    double sal;
    //1//
    P29(){
    	System.out.println("No Argument");
    }
    //2//
    P29(int id){
    	this.id=id;
    	System.out.println("1FA");
    }
    //3//
    P29(int id,String name){
    	this.id=id;
    	this.name=name;
    	System.out.println("2FA");
    }
    //4//
    P29(int id,String name,double sal){
    	this.id=id;
    	this.name=name;
    	this.sal=sal;
    	System.out.println("3FA");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       P29 e1=new P29();
       System.out.println("id:"+e1.id);
       System.out.println("name:"+e1.name);
       System.out.println("sal:"+e1.sal);
       
       System.out.println("===========");
       
       P29 e2=new P29(10);
       System.out.println("id:"+e2.id);
       System.out.println("name:"+e2.name);
       System.out.println("sal:"+e2.sal);
       
       System.out.println("===========");
       
       P29 e3=new P29(25,"sheela");
       System.out.println("id:"+e3.id);
       System.out.println("name:"+e3.name);
       System.out.println("sal:"+e3.sal);
       
       System.out.println("===========");
       
       P29 e4=new P29(30,"leela",25000);
       System.out.println("id:"+e4.id);
       System.out.println("name:"+e4.name);
       System.out.println("sal:"+e4.sal);
	}

}
