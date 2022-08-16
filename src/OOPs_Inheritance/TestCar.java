package OOPs_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW bmw = new BMW();
		
		bmw.start(); //overridden
		bmw.stop(); //inherited method
		bmw.autoParking();//individual
		bmw.refuel(); //inherited
		bmw.engine();
		BMW.run();
		bmw.aerodynamic();
		System.out.println("speed is :"+bmw.speed);
		System.out.println("----------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.run();
		c.aerodynamic();
		
		
		 System.out.println("-----------");
		 
		 Audi a = new Audi();
		 a.start(); //overridden
		 a.theftSafty();//inividual
		 a.stop();
		 
        System.out.println("-----------");
		 
		 Vehicle v = new Vehicle();
		v.aerodynamic();
		 
       System.out.println("-----------");
		 
		 Automobile au = new Automobile();
		au.aerodynamic();
		
		//Top casting
		 System.out.println("-----------");
		Car c1 = new BMW();//child class object can be referred by parent class reference variable
        c1.start();
        c1.stop();
		c1.engine();
		//c1.autoParking();
		
		System.out.println("-----------");
		   Vehicle c2  = new BMW();///child class object can be referred by grand parent class reference variable
		   c2.aerodynamic();
		   c2.engine();
		   c2.motorParts();
		
		
		

	}

}
