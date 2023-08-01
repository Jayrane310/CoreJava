package InbuiltClasses;

public class emp {
      int id;
      String name;
      emp(int id,String name) {
		// TODO Auto-generated constructor stub
    	super();
    	this.id=id;
    	this.name=name;
    	
	}
      @Override
      public String toString() {
    	  System.out.println("id:"+id);
    	  System.out.println("name:"+name);
    	  return " ";
      }
}
