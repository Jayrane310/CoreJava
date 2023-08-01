package InbuiltClasses;

public class Mobile1 {
	  String brand;
      double price;
     Mobile1(String brand,double price) {
		// TODO Auto-generated constructor stub
    	 super();
    	 this.brand=brand;
    	 this.price=price;
    	 
	}
     //override
     public boolean equals(Object obj) {
    	 Mobile1 m=(Mobile1) obj; //downcasting
    	 return this.brand ==m.brand &&
    	 this.price ==m.price;
     }
}
