package OOPs_Inheritance;

public class BMW extends Car{
	int speed = 100;
	@Override
	public void start() {
		System.out.println("BMW---start");
			}
	
	public void autoParking() {
		System.out.println("BMW---autoparking");
	}
	
	@Override
	public void engine() {
		System.out.println("bmw---engine");
	}
    
	 
	public  static void run() {
		System.out.println("bmw---run");
	}
	
	@Override
	public void aerodynamic() {
		System.out.println("BMW---aerodynamics");
	}
}
