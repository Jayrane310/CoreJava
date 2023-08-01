package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet h=new HashSet();
     h.add(10);
     h.add(null);
     h.add('c');
     h.add("hi");
     h.add(10);
     h.add(null);
     h.add("hi");
     h.add(15.9);
     System.out.println("HashSet:"+h);
     
     System.out.println("==============");
     
     LinkedHashSet l=new LinkedHashSet();
     l.add(10);
     l.add(null);
     l.add('c');
     l.add("hi");
     l.add(10);
     l.add(null);
     l.add("hi");
     l.add(15.9);
     System.out.println("HashSet:"+l);
     
     System.out.println("==============");
     
     TreeSet t=new TreeSet();
     t.add(-5);
     t.add(0);
   //t.add("hi");//classCastException
   //t.add(null);//NullPointerException
     t.add(100);
     t.add(-250);
     t.add(10);
     t.add(-420);
     System.out.println("TreeSet ASC:"+t);
     System.out.println("TreeSet DESC:"+t.descendingSet());
     
     
     
	}

}
