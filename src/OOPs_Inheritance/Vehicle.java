package OOPs_Inheritance;

public class Vehicle extends Automobile {
   
	
	
	public void engine() {
		System.out.println("vehicle---engine");
	}
	
	@Override
	public void aerodynamic() {
		System.out.println("Vechilee---aerodynamics");
	}
	
	public void motorParts() {
		System.out.println("Vehicle---motor parts");
	}
}
