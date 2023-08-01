package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap h=new HashMap();
      h.put(1,"sheela");
      h.put(2,"leela");
      h.put(3,"sheela");
      h.put("hi",5);
      h.put('c',false);
      h.put(null,10);
      h.put(10.9,null);
    //h.put(1,"sunny"); //old value replaced by new value
      System.out.println("HashMap:"+h);
      
      System.out.println("============");
     
      LinkedHashMap l=new LinkedHashMap();
      l.put(1,"sheela");
      l.put(2,"leela");
      l.put(3,"sheela");
      l.put("hi",5);
      l.put('c',false);
      l.put(null,10);
      l.put(10.9,null);
    //l.put(1,"sunny");//old value replaced by new value
      System.out.println("LinkedHashMap:"+l);
      
      System.out.println("============");
      
      TreeMap t=new TreeMap();
      t.put(1,"sheela");
      t.put(-2,false);
    //t.put("hi",10);//classCastException
    //t.put(null,"hi");//NullPointerException
      t.put(0,'c');
      t.put(55,10.9);
    //t.put(1,"sunny");//old value replaced by new value
      t.put(3,null);
      System.out.println("TreeMap ASC:"+t);
      System.out.println("TreeMap DESC:"+t.descendingMap());
           
	}

}
