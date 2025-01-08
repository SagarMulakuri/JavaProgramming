package TrainingArithmetic;

import java.util.Scanner;

public class CountTheNumbeOFdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		int count=0;
		while(n>0) {;
			n=n/10;
//			System.out.println(n);
			count++;
		}
		System.out.println(count);
	}

}
