package qsp;

public class P14 {
    static int i=25; //static variable/global variable
	public static void main(String[] args) {//static context
		// TODO Auto-generated method stub
        int i=15; //local variable
        System.out.println(i);   //15
        //classname.variablename
        System.out.println(P14.i);  //25
	}

}
