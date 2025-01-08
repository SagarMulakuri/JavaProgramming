package recursion;

public class Recursion {
	
	static void fun(int n) {
		if(n>0){
			fun(n-1);
			System.out.println(n);
		}
	}
	static void funReverse(int n) {
		if(n>0){
			System.out.println(n);
			fun(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(3);
		funReverse(3);	
	}

}
