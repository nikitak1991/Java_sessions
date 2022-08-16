package javasession;

public class StringConcat {

	public static void main(String[] args)
	{
		
            String s = "Hello World";
            System.out.println(s);
            byte a=100;
            int b= 200;
            
            String x= "Hello";
            String y="Selenium";
             
             System.out.println(a+b);
             System.out.println(x+y);
             System.out.println(a+b+x+y);
             System.out.println(x+y+a+b);
             System.out.println("The sume is:"+a+b);
             System.out.println("The sum is :"+(a+b));
             System.out.println("The sum is :"+(a+x));
             System.out.println("The sum is :"+x+(a+b));
             System.out.println("The sum is :"+x+a+b);
             
         char ch1 = 'a';  
         char ch2 ='b';
          
            System.out.println(ch1);
            System.out.println(ch1+ch2);
            System.out.println((int)ch1);
            System.out.println(ch1+","+ch2);
            System.out.println(ch1+"");
            System.out.println(x+y+ch1+ch2);
            System.out.println(ch1+ch2+x+y);
	}

}
