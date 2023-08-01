package Collections;

import java.util.LinkedList;

public class C6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList l=new LinkedList();
      l.offer(10);
      l.offer(null);
      l.offer(10);
      l.offer('c');
      l.offer("hi");
    //l.add('c');
    //l.add("hi");
      System.out.println("LinkedList:"+l);
	}

}
