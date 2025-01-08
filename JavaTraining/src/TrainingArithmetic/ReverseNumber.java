package TrainingArithmetic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		int remainder;
		int rev=0;
		while(n>0) {
			remainder= n%10;
			n=n/10;
			rev =rev*10+remainder;
			}
		System.out.println("Reversed number  "+rev);
	}

}
