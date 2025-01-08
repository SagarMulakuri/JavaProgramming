package ArrayPractice;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= new int[10];
		int B[]= {1,2,3,4,5};
		int C[];
		C= new int[10];
		int []D=new int [5];
		B[2]=15;
		for(int i=0;i<A.length;i++) {
		System.out.print(A[i]);
		}
		for(int x:B) {
			System.out.println(x);
		}
		for(int x:B) {
			System.out.println(x++);//Does not change
		}
		System.out.println(B);//[I@378fd1ac I means Int
		
		System.out.println(B.length);
	}

}
