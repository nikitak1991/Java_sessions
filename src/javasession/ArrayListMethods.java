package javasession;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> emplist = new ArrayList<String>();
		emplist.add("Nidhi");
		emplist.add("nikki");
		emplist.add("Myra");
		emplist.add("shipra");
		emplist.add("ankita"); 
		
		//Collections.reverse(emplist);
		System.out.println(emplist);
		
		Collections.swap(emplist, 0, 1);
		System.out.println(emplist);
		
		System.out.println(emplist.contains("nikki"));
		System.out.println(emplist.contains("Nikki"));
		
		
		ArrayList<String> userlist = new ArrayList<String>();
		userlist.add("123");
		userlist.add("Mayank");
		userlist.add("sahil");
		
		userlist.addAll(emplist);
		System.out.println(userlist);
		
		emplist.addAll(userlist);
		System.out.println(emplist);
		System.out.println(userlist);

	}

}
