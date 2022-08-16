package OOP_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
         Employee emp = new Employee();
         emp.setAge(32);
         emp.setActive(true);
         emp.setGender("Female");
         emp.setName("Nikita");
         emp.setSalary(80000);
         
         System.out.println(emp.getEmployeeInfo());
         
	}

}
