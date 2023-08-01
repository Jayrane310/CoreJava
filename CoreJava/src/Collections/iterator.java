package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList a=new ArrayList();
       a.add(10);
       a.add(null);
       a.add("c");
       a.add("Hi");
       System.out.println(a);
       
       System.out.println("====get Index====");
       
       for (int i = 0; i < a.size(); i++) {
		System.out.println(a.get(i));
	}
       System.out.println("====for each loop====");
       
       for (Object obj : a) {
		System.out.println(obj);
	}
       System.out.println("====iterator()====");
       
      Iterator i=a.iterator();
      while (i.hasNext()) {
		System.out.println(i.next());
		
	}
      System.out.println("====ListIterator()====forward====");
      
      ListIterator j=a.listIterator();
      while (j.hasNext()) {
		System.out.println(j.next());
		
	}
      System.out.println("====ListIterator()====backward====");
      
      while (j.hasPrevious()) {
		System.out.println(j.previous());
      }
   }
}
