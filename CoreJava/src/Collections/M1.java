package Collections;

import java.util.HashMap;
import java.util.Set;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashMap h=new HashMap();
	      h.put(1,"sheela");
	      h.put("hi",5);
	      h.put('c',false);
	      h.put(null,10);
	      h.put(10.9,null);
	      System.out.println("Map:"+h);
	      
	    //Convert Map into collection set
	      System.out.println("set:"+h.entrySet());
	      
	      System.out.println("Search Key:"+h.containsKey(1));
	      System.out.println("search value:"+h.containsValue("leela"));
	      
	      System.out.println("keys:"+h.keySet());
	      System.out.println("values:"+h.values());
	      
	     //how to access map
	      Set s=h.entrySet();
	      for (Object obj : s) {
	    	  System.out.println(obj);			
		}
	}

}
