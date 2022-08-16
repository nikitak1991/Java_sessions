package javasession;

public class IncrementalDecrementalOperator {

	public static void main(String[] args) 
	
	{
		int i = 1;
		int j = i++;
		System.out.println(i+"and"+j);//2
		System.out.println(j);//1
		
		int h =1;
		int g = ++h;
		System.out.println(h);//2
		System.out.println(g);//2
		
		int u = 1;
		System.out.println(u++);//1
		System.out.println(u);//2
		System.out.println(++u);//3
		
		

	}

}
