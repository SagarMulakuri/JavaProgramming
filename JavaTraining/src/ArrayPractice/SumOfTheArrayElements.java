package ArrayPractice;

public class SumOfTheArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,2,3,4,5,6,7,8};
		int sum =0;
		for (int i=0; i< A.length; i++) {
			sum = sum+A[i];
		}
		System.out.println("Sum is "+sum);
		for (int x:A) {
			sum = sum+x;
		}
		System.out.println("Sum is from for each "+sum);
	}

}
