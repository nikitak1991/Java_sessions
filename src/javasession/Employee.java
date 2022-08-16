 package javasession;

public class Employee {

	//data members: vars, methods
	 String name;
	 int age;
	 double salary;
	  
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Nikita";
		emp1.age = 30;
		emp1.salary = 40.2;
		System.out.println(emp1.name+" "+emp1.salary);
		
		Employee emp2 = new Employee();
		System.out.println(emp2.name+" "+emp2.salary);
		
		Employee emp3 = new Employee();
		emp3.name = "Myra";
		System.out.println(emp3.name+" "+emp3.salary);
		
		
		//null refernce object
		Employee emp4 = new Employee();
		emp4 = null;
	    emp4.name ="Naina"; //Null pointer Exception
		System.out.println(emp4.name);
		
		System.gc();
	}
	
}

		
		
		