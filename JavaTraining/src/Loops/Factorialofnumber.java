package Loops;

import java.util.Scanner;

public class Factorialofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number to find the factorial ");	
		int n=sc.nextInt();
		long fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("The Fctorial of "+ n +" is "+fact);
	}

}
