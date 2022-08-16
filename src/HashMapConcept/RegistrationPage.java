package HashMapConcept;

import java.util.Arrays;
import java.util.HashMap;

public class RegistrationPage {

	
	public static void doRegistration(String fstname,String lastname,String city,String email,String country) {
		//System.out.println("User " +fstname+ " Registration information is :" +Arrays.toString(reginfo));
		System.out.println("Registration info is : "+fstname+"/"+lastname+"/"+city+"/"+email+"/"+country);
	}
	
	public static String getRegistrationForm(String role)
	{
		HashMap<String,String> reg = new HashMap<String, String>();
		reg.put("admin","Nikita;kapoor;Denver;nikitakapoor@gmail.com;USA");
		reg.put("customer","mayank;kapoor;johnstown;;USA");
		 return reg.get(role);
		
		
	}
	public static void main(String[] args) {
		String info = getRegistrationForm("customer");
		String reginfo[] = info.split(";");
		String firstname = reginfo[0];
		String lastname =  reginfo[1];
		String city = reginfo[2];
		String email = reginfo[3];
		String country = reginfo[4];
		//doRegistration(firstname,reginfo);
		doRegistration (firstname,lastname,city,email,country);
		System.out.println("User registration form details are :");
		for(int i=0; i<reginfo.length;i++) {
			System.out.println(reginfo[i]);
		}

	}

}
