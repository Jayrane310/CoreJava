package Collections;

import java.util.Stack;

public class C7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack s=new Stack();
      s.push(10);
      s.push(null);
      s.push(10);
      s.push('c');
      s.push("hi");
    //s.add('c');
    //s.add("hi");
      
      System.out.println("stack:"+s);
      System.out.println("remove:"+s.pop());
	}

}
