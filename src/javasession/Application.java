package javasession;

import java.util.ArrayList;

public class Application {
    //waf :that will return links on the page
	//param : page name
	//return :lsit of links
	
	public ArrayList<String> getPageLinks(String pageName) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Page name is: "+pageName);
		
		if(pageName.equalsIgnoreCase("login")) {
			list.add("product");
			list.add("catogory");
		}else if(pageName.equalsIgnoreCase("home")) {
			list.add("product");
			list.add("category");
			list.add("price");
		}else System.out.println("Enter correct page name");
		
		return list;
		
		
	}
	public static void main(String[] args) {
		Application app = new Application();
		ArrayList<String> listLinks = app.getPageLinks("cartpage");
		System.out.println(listLinks);

	}

}
