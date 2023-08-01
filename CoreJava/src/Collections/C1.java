package Collections;

import java.util.ArrayList;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList s=new ArrayList();
       s.add("dosa");
       s.add("idli");
       s.add("vada");
       s.add("uthappa");
       System.out.println("South:"+s);
       
       System.out.println("=============");
       
       ArrayList m=new ArrayList();
       m.add("vadapav");
       m.add("puran poli");
       m.add("zumka bhakar");
       m.add("popati");
       System.out.println("Maharashtra:"+m);
       
       System.out.println("=============");
       
       //s.add("Biryani"); //Biryani will get added in south/(S)
       s.add("Biryani");
       System.out.println("South:"+s);
       
       System.out.println("=============");
       
       //m.addAll(s); //All south item will get added in Maharashtra/(m)
       m.addAll(s);
       System.out.println("Maharashtra:"+m);
       
       System.out.println("=============");
       
       //m.remove("popati");// using object //popati removed using object name
       m.remove(3);//using index //popati removed using index no
       
       System.out.println("Maharashtra:"+m);
       System.out.println("search:"+m.contains("idli")); //true
       System.out.println("search:"+s.contains("misal pav")); //false
       System.out.println("search:"+m.containsAll(s)); //true
       
       System.out.println("=============");
       
       m.clear();//cleared all items from maharashtra /(m)
       System.out.println("Maharashtra:"+m);
       
	}

}
