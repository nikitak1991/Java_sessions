package javasession;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//Array

		//create object for arraylist
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		ar.add(300);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		
		System.out.println("-------------------");
	    ArrayList<Object> ar1 =new ArrayList<Object>();
	    ar1.add("nikki");
	    ar1.add(30);
	    ar1.add(true);
	    ar1.add(22.1);
	     System.out.println(ar1);
	     
	     System.out.println("-------------------");//for  loop
	     for(int m=0;m<ar1.size();m++) {
	    	 if(ar1.get(m).equals(true)) {
	    		 System.out.println("hello");
	    		 break;
	    	 }
	    	 System.out.println(ar1.get(m));
	     }
	     
	     System.out.println("-------------------");//for each or enhanced loop
	     for(Object e: ar1){
	    	System.out.println(e);
	     }
		
	}

}
