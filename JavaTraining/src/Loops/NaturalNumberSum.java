package Loops;

import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n numbers to find the sum ");	
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum = sum+i;
		}
		System.out.println("The sum of natural "+ n +" Number is "+sum);
	}

}
