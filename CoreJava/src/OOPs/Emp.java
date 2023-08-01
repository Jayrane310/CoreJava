/*create a employee class consist of employee ID,employee Name,employee Sal:-
  (i)create driver class for employee
  (ii)create atleast two employee by passing all the data 
  (ii)achieve data hiding for employee salary*/
package OOPs;

public class Emp {//1//
       int ID;
       String Name;
       private double Sal;
      
       public Emp(int ID,String Name,double Sal) {
		// TODO Auto-generated constructor stub
    	   this.ID=ID;
    	   this.Name=Name;
    	   this.Sal=Sal;
	}
}
