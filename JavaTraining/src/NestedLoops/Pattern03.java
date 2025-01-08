package NestedLoops;

public class Pattern03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(j+i+" ");				
			}
			System.out.println(" ");		
		}
	}
//output
//	2 3 4 5 6  
//	3 4 5 6 7  
//	4 5 6 7 8  
//	5 6 7 8 9  
//	6 7 8 9 10 
	
	
}
