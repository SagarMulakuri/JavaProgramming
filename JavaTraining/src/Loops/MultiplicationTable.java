package Loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value which we need to find the table ");	
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}

}
