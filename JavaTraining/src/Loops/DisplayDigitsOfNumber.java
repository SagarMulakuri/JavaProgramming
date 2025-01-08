package Loops;

import java.util.Scanner;

public class DisplayDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		
//		for (int i=0;i<=n;i++) {
//			int remainder = n%10;
//			System.out.print(remainder+" ");
//			n=n/10;
//		}
		
		while(n>0) {
			int remainder = n%10;
			System.out.print(remainder+" ");
			n=n/10;
		}
		
	}

}
