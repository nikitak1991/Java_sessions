package javasession;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser =" Chrome";
		String env = "Dev";
		
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
		case "safari":
			System.out.println("launch safari");
		    
		default:
			System.out.println("please enter right brower");
			break;
		}

		switch (env.toUpperCase()) {
		case "QA":
			System.out.println("this is qa envionment");
			break;
			
		case "DEV":
			System.out.println("this is dev enviornment");
            break;
		default:
			System.out.println("please pass right enviornment");
			break;
		}
	}

}
