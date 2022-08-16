package javasession;

public class Browser {
	
	//waf : launch the browser with given name
	public Boolean launchBrowser(String brname) {
		boolean flag = true;
		switch(brname.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launching chrome browser");
			break;
		case "fire fox":
			System.out.println("launching fore fox browser");
			break;
		case "internet explorer":
			System.out.println("launching IE browser");
			break;
		case "edge":
			System.out.println("lauching edge browsr");
			break;
	   default:
				System.out.println("please enter correct browser");
			    flag = false;
		}
		return flag;
	}
		


	public static void main(String[] args) {
		
            Browser br = new Browser();
           Boolean flag = br.launchBrowser("opera  ");
           if(flag== true) {
        	   System.out.println("launch browser");
           }
            
	}

}
