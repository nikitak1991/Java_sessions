package OOP_Encapsulation;

import java.util.Arrays;

public class Browser_Test {

	public static void main(String[] args) {
		
		String plg[] = {"plugin","plugin1","plugin2"}; 
		
		
		Browser_Constrotor brws = new Browser_Constrotor("Myra", 1.2,plg);
		
		String plugin = Arrays.toString(brws.getPlugin());
		
		System.out.println(brws.getName()+","+brws.getVersion()+"--"+plugin);
		
		
		//update
		brws.setName("Mayank");
		System.out.println(brws.getName()+","+brws.getVersion()+"--"+Arrays.toString(brws.getPlugin()));
		
	}
}
