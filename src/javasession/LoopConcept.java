package javasession;

public class LoopConcept {

	public static void main(String[] args) {
		
		int i=1;
		int k;
		
		while(i<=10) {
			System.out.println(i);
			i=i+1;
		}
System.out.println("------------------------");

		for(i=0;i<=10;i++) {
			System.out.println(i);
		}
System.out.println("-------------------");		
		
      /* for(;;) {//by default it will assume condition is true
    	   System.out.println("bye");
       }*/
     
       
 System.out.println("----a to z---------");
 
      for(char c ='a'; c<='z'; c++) {
    	  System.out.println("ascii vale of "+c+":"+(int)c);
      }
 
 
	}

}
