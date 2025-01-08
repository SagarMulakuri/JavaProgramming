package ArrayPractice;

import java.util.Scanner;

public class InsertingAnElementToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to insert");
		int x = sc.nextInt();
		System.out.println("Enter index of the value to insert");
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
		for (int i=n; i>index ; i--) {
				A[i]=A[i-1];
		}					
		A[index]= x;
		for(int i=0;i<n;i++) 
			System.out.print(A[i]+",");
			System.out.println("");
	}
//	Enter the value to insert
//	24
//	Enter index of the value to insert
//	2
//	5,10,15,20,25,30,35,
//	5,10,24,15,20,25,30,

}
