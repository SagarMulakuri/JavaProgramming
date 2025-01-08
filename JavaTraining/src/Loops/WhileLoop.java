package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, n=100;
		while(i<n) {
			System.out.println(i);
			i= i*2;
		}
		int j=2, m=50;
		do {
			System.out.println(j);
			j= j*2;
		}while(j<m);
		
//		Infinite loop
//		while(true) {
//			System.out.println(i);
//		}
//		System.out.println("stop"); Unable to reach

	}

}
