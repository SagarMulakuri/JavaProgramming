package Loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=0; i<=10; i++) {
//			System.out.println(i);
//		}
		//Initialization condition and updations are optional
//		int i =0;
//		for(System.out.println("Hii"); i<=10; i++) {
//			System.out.println(i);
//		}
//		for(; i<=10; i++) {
//			System.out.println(i);
//		}
////		infiniteloop
//		for(;;) {
//			System.out.println(i);
//		}
		
		for(int i=0,j=1;i<10;i++,j=j*2) {
			System.out.println(i+" "+j);
		}

	}

}
