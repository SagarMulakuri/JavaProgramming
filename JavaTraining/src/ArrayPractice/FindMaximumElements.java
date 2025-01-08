package ArrayPractice;

import java.util.Scanner;

public class FindMaximumElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4,5,6,7,8};
		System.out.println("Enter the Key to Search");
		int max = A[0];
		for (int i=0; i< A.length; i++) {
			if (A[i]>max) {
				max=A[i];
			}
		}
		System.out.println("Max Number is "+max);
	}

}
