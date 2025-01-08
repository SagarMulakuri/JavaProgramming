package ArrayPractice;

import java.util.Scanner;

public class SerchingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {1,2,3,4,5,6,7,8};
		System.out.println("Enter the Key to Search");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		for (int i=0; i< A.length; i++) {
			if (A[i]==key) {
			System.out.println("Key is Present At the index "+i);
			System.exit(0);//stopping the code
			}
		}
		System.out.println("Key not Found");
	}

}
