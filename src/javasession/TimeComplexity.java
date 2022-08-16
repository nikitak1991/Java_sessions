package javasession;

public class TimeComplexity {

	public static void main(String[] args) {
		
		//Big (O)
		
		//1 to 10 print
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		//time complexity
		//1+n+n+n -> 1+3n(linera) ->3n ->n 
		
		//nested loop
		for(int j=0 ; j<=9; j++) {
			for(int k=0; k<=9; k++) {
				System.out.print(j+""+k+" ");
			}
			System.out.println();
		}
		//(1+n+n+n)(1+n+n+n) -> (1+3n)(1+3n) -> 1+3n+3n+9n^2 ->9n^2+6n+1 (quadtric quation) -> 6n+9n^2->3n(2+3n)->3n(3n)->9 n^2->n2
	}

}
