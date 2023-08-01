/*create a class consist of add method to perform addition of :-
   (i)Two Numbers
   (ii)Three Numbers
   (iii)Four Numbers
   (iv)Five Numbers
   (v)return data from each method 
   (vi)store the data which is return then print */
package qsp;

public class P10 {
    public static int Two(int a,int b) {
    	int c=a+b;
    	return c;
    }
    public static int Three(int a,int b,int c) {
    	int d=a+b+c;
    	return d;
    }
    public static int Four(int a,int b,int c,int d) {
    	int e=a+b+c+d;
    	return e;
    }
    public static int Five(int a,int b,int c,int d,int e) {
    	int f=a+b+c+d+e;
    	return f;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int Two=Two(10,20);
        int Three=Three(10,20,30);
        int Four=Four(10,20,30,40);
        int Five=Five(10,20,30,40,50);
        System.out.println(Two);
        System.out.println(Three);
        System.out.println(Four);
        System.out.println(Five);
        int repeat=Two(10,20);
        System.out.println(repeat);
	}

}
