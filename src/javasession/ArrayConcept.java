package javasession;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int[] i = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3]= 40;
		System.out.println(Arrays.toString(i));
		System.out.println(i.length);
		int Hindex = i.length-1;
		int Lindex = 0;
		System.out.println(Hindex);
		
		//for loop
		for(int k=0;k<=i.length-1;k++) {
			System.out.println(i[k]);
			
		}
 
		
		//literals
		int[] l = {10,20,30,40,50};
		System.out.println(Arrays.toString(l));
		System.out.println(l.length);
		int Hindex1 =l.length-1;
		int Lindex1 = 0;
		System.out.println(Hindex1);
		
		
		String[] s = {"nikita","mayank","myra","shalu","summi","sahil"};
		System.out.println(Arrays.toString(s));
		System.out.println(s.length);
		int Hindex2 =s.length-1;
		int Linde2 = 0;
		System.out.println(Hindex2);
		
		
	}
}
