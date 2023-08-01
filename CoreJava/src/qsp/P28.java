/*create a class consist of student id and student name.create two formal argument method to initialize id and name
during object creation create atleast two student objectthen print each student details */
package qsp;

public class P28 {
    int id;
    String name;
    
    P28(int id,String name){
    	this.id=id;
    	this.name=name;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       P28 s1=new P28(10,"sheela");
       System.out.println("id:"+s1.id);
       System.out.println("name:"+s1.name);
       
       System.out.println("==============");
       
       P28 s2=new P28(20,"leela");
       System.out.println("id:"+s2.id);
       System.out.println("name:"+s2.name);
	}

}
