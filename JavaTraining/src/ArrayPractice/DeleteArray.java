package ArrayPractice;

import java.util.Scanner;

public class DeleteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to Delete");
		int x = sc.nextInt();
		System.out.println("Enter index of the value to Deleting");
		int index = sc.nextInt();
		int A[]= new int[10];
		A[0] = 5;
		A[1] = 10;
		A[2] = 15;
		A[3] = 20;
		A[4] = 25;
		A[5] = 30;
		A[6] = 35;
		int n =7;
		for(int i=0;i<n;i++) 
			System.out.print(A[i]+",");
			System.out.println("");
		for (int i=index; i<n ; i++) {
				A[i]=A[i+1];
		}
		for(int i=0;i<n-1;i++) 
			System.out.print(A[i]+",");
			System.out.println("");
	}
//	Enter the value to Delete
//	10
//	Enter index of the value to Deleting
//	1
//	5,10,15,20,25,30,35,
//	5,15,20,25,30,35,
}
