package ArrayPractice;

import java.util.Scanner;

public class SecondLargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4,5,6,7,8};
		Scanner sc = new Scanner(System.in);
		int max1=A[0], max2 = A[0];
		for (int i=0; i< A.length; i++) {
			if (A[i]>max1) {
				max2=max1;
				max1=A[i];
			}
			else if(A[i]>max2) {
				max2= A[i];
			}
		}
		System.out.println("Second Max Number is "+max2);
	}

}
