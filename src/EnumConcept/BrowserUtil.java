package EnumConcept;

public class BrowserUtil {

	public static void main(String[] args) {
		Browser broser = Browser.SAFARI;
        System.out.println(broser.getBrowserID());
        
        if(broser.getBrowserID()==1) {
        	System.out.println("Launch Chrome");
        }
        else
        {System.out.println("Hi");
	}

	}}
