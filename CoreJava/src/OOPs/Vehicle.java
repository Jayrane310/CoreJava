/*create a vehicle class consist of colour,brand and price with start,stop and drive behaviours
  (i)achieve inheritance between car and behaviour (vehicle) class
  (ii)create atleast two car's  */
package OOPs;

public class Vehicle {//superclass
    String colour;
    String brand;
    String price;
    
    public void start() {
		System.out.println("start:"+"ignition is awesome");
	}
    
    public void stop() {
		System.out.println("stop:"+"breaking performance is awesome");
	}
    
    public void drive() {
		System.out.println("drive:"+"car handling is awesome");
	}
}
