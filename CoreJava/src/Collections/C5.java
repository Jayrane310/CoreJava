package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class C5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList a=new ArrayList();
     a.add(10);
     a.add("hi");
     a.add(null);
     a.add(10);
     a.add("hi");
     System.out.println("List:"+a);
     
     //converted List into Set
     HashSet h=new HashSet(a);
     System.out.println("set:"+h);
     
     //converted set into list
     ArrayList l=new ArrayList(h);
     System.out.println("list:"+l);
     
     //Map into list
     /*1.convert Map into set---->entryset();
      *2.set into list*/
     
     //ArrayList into Array
     Object[] i = a.toArray();
          
	}

}
