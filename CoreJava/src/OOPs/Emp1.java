package OOPs;

public class Emp1 {//1//
	  int ID;
      String Name;
      private double Sal;
      
     //permission---->getter method---->to get private data
      public double getSal() {
    	  return Sal;
      }
      //permission---->setter method---->to set/modify private data
      public void setSal(double Sal) {
    	this.Sal=Sal;  
      }
      Emp1(int ID,String Name,double Sal) {
		// TODO Auto-generated constructor stub
   	   this.ID=ID;
   	   this.Name=Name;
   	   this.Sal=Sal;
	}
}
