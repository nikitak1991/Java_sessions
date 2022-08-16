package javasession;

public class Customer {
	
	//no input no return
	//void : can not return anything
	//
	public void test(){ // 0 parameter
		System.out.println("hi");
	}
	
	public void printMyName() {
		System.out.println("My Name is Nikita");
		String name = "Nikita";
		System.out.println(name);
	}
	
	//no input and some return
	public int getBillAmount() {
		int num1 = 100;
		int num2 = 600;
		return(num1+num2);
	}
	
	//some input some return
	public int add(int a, int b) {
		return(a+b);
				
	}
	
	public int getStudenMarks(String stname) {
		int marks ;
		if(stname.equalsIgnoreCase("Nikita")) {
			marks = 95;
		}else if(stname.equalsIgnoreCase("Myra")){
			marks = 80;
		} else if(stname.equalsIgnoreCase("Mayank")) {
			marks = 70;
		} else {
			marks = -1;
			System.out.println("student not found: "+stname);
		}
		return marks;
	}

	public static void main(String[] args) {
		
		Customer obj = new Customer ();
		obj.test();
		obj.printMyName();
		int Number = obj.getBillAmount()+50;
		System.out.println(Number);
		
		System.out.println(obj.add(25,30));
		
		System.out.println(obj.add(10, 20)/2 );
		
		
		//obj.getStudenMarks("nikita");
		System.out.println("pass with marks:" +obj.getStudenMarks("myra"));
		int marks = obj.getStudenMarks("nidhi");
		System.out.println(marks);

	}

}
