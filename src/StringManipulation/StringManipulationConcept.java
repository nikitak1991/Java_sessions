package StringManipulation;

public class StringManipulationConcept {
	
	public static void main(String[] args) {
		
		String string = "This is my "
				+ "`````java code and i am so happy to learn";
		System.out.println(string.length());
		
		int length = string.length();
		int hi = length-1;
		
		
		System.out.println(string.charAt(1));
		System.out.println("High index is :"+hi);
		
		System.out.println(string.indexOf('i'));//  1 ocuurence
		System.out.println(string.indexOf('i', string.indexOf('i')+1  ));
		System.out.println(string.indexOf('i', string.indexOf('i', string.indexOf('i')+1  )+1));
	}

}