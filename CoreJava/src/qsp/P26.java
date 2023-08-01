package qsp;

public class P26 {
	//1//
	 P26(){
	        System.out.println("No Formal Argument Constructor");	
	}
	 //2//
	 P26(int a){
		    System.out.println("One Formal Argument Constructor");	
	}
	 //3//
	 P26(int a,int b){
		    System.out.println("Two Formal Argument Constructor");	
	}
	 //4//
	 P26(int a,int b,int c){
		    System.out.println("Three Formal Argument Constructor");	
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      P26 ref1=new P26();
      P26 ref2=new P26(10);
      P26 ref3=new P26(10,20);
      P26 ref4=new P26(10,20,30);
      
	}

}
