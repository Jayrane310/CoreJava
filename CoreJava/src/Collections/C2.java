package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList a=new ArrayList();
      a.add(10);
      a.add(-5);
      //a.add("hi"); //ClassCastException
      //a.add(null); //nullPointerException
      a.add(0);
      a.add(10);
      a.add(100);
      a.add(-500);
      
      System.out.println("before sorting:"+a);
      
      Collections.sort(a);
      
      System.out.println("after sorting ASC:"+a);
      
      Collections.reverse(a);
      
      System.out.println("after sorting DSC:"+a);
	}

}
