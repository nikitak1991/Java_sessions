package javasession;

public class ConditionalOperators {

	public static void main(String[] args) {
		  
		if(true) {
			System.out.println("hello");
			
		}else {
            System.out.println("bye");//dead code
	}
		
    boolean flag = true;
    if(flag) {
	     System.out.println("hi");	
    }else {
    	
    	System.out.println("bye");
    }
    
    //nested if
    int marks = 80;
    if(marks<=100 ) {
        if(marks>=90) {
    	   System.out.println("grade A");
        }
        if (marks<=80) {
    	   System.out.println("grade B");
    	        if(marks<=50) {
    	        	System.out.println("Grade C");
    	        }
        }
        else {
        	System.out.println("Good Bye");
        }
    }
    else {
    	System.out.println("enter correct marks");
    }
    
    //nested if else
     int number = 35;
     if(number<=100 && number>75) {
    	 System.out.println("you are passed with honour:"+number);
     } else {
    	  if(number<=75 && number>60) {
    		  System.out.println("you are passed with grade A");
    	  }else {
    		  if(number<=60 && number >= 45) {
    			  System.out.println("you are pass with grade B");
    		  }else {
    			  System.out.println("fail");
    		  }
    	  }
     }
    
     
     //bigest number in 4
     int x= 1000;
     int y= 950;
     int z= 600;
     int p= 900;
     
     if(x>y && x>z && x>p) {
    	 System.out.println("x is greatest");
     }else if (y>z && y>p) {
    	 System.out.println("y is greatest");
     }else if (z>p) {
    	 System.out.println("z is greatest");
     }else
    	 System.out.println("p is greatest");
}
}