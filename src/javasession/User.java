package javasession;

public class User {

	int age;
	String name;
	String city;
	
	public static void main(String[] args) {
		 User u1 = new User();
		 u1.name = "nikita";
		 u1.city = "Delhi";
		 u1.age = 30;
		 
		 User u2 = new User();
		 u2.age = 19;
		 u2.city = "agra";
		 u2.name = "Sahil";
		 
		 User u3 = new User();
		 u3.age = 37;
		 u3.city = "Mumbai";
		 u3.name = "Mayank";
		 
		 User u4 = new User();
		 u4.age = 3;
		 u4.city = "Denver";
		 u4.name = "Myra";
		 
		 System.out.println(u1.name+" "+u1.city+" "+u1.age );
		 System.out.println(u2.name+" "+u2.city+" "+u2.age );
		 System.out.println(u3.name+" "+u3.city+" "+u3.age );
		 System.out.println(u4.name+" "+u4.city+" "+u4.age );
		 
		 System.out.println("-------------------");
		 u1 = u2;
		 System.out.println(u1.name+" "+u1.city+" "+u1.age );//sahil
		 System.out.println(u2.name+" "+u2.city+" "+u2.age );//sahil
		 System.out.println(u3.name+" "+u3.city+" "+u3.age );//mayank
		 System.out.println(u4.name+" "+u4.city+" "+u4.age );//myra

		 System.out.println("-------------------");
		 u2 = u3;
		 System.out.println(u1.name+" "+u1.city+" "+u1.age );//sahil
		 System.out.println(u2.name+" "+u2.city+" "+u2.age );//mayank
		 System.out.println(u3.name+" "+u3.city+" "+u3.age );//mayank
		 System.out.println(u4.name+" "+u4.city+" "+u4.age );//myra

		 System.out.println("-------------------");
		 u3 = u4;
		 System.out.println(u1.name+" "+u1.city+" "+u1.age );//sahil
		 System.out.println(u2.name+" "+u2.city+" "+u2.age );//mayank
		 System.out.println(u3.name+" "+u3.city+" "+u3.age );//myra
		 System.out.println(u4.name+" "+u4.city+" "+u4.age );//myra
		 
		 System.out.println("-------------------");
		 u4 = u1;
		 System.out.println(u1.name+" "+u1.city+" "+u1.age );//sahil
		 System.out.println(u2.name+" "+u2.city+" "+u2.age );//mayank
		 System.out.println(u3.name+" "+u3.city+" "+u3.age );//myra
		 System.out.println(u4.name+" "+u4.city+" "+u4.age );//sahil
	}

}
