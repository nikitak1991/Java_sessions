package OOPs_Inheritance;

public class Car extends Vehicle{
     
	public void start() {
		System.out.println("car-- start");
	}
	
	public void refuel() {
		System.out.println("car---refuel");
	}
	public void stop() {
		System.out.println("car-- stop");
	}
	
	public  static void run() {
		System.out.println("car---run");
	}
	
	@Override
	public void aerodynamic() {
		System.out.println("Car---aerodynamics");
	}
}
