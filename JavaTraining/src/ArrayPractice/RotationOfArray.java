package ArrayPractice;

import java.util.Scanner;

public class RotationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		int temp=A[0];
		for(int x:A) 
			System.out.print(x+",");
			System.out.println("");
		for (int i=1; i< A.length; i++) {
			A[i-1]=A[i];
		}
		A[A.length-1]= temp;
		for(int x:A)   
			System.out.print(x+",");
			System.out.println("");
//			1,2,3,4,5,6,7,8,9,10,
//			2,3,4,5,6,7,8,9,10,1,
	}

}