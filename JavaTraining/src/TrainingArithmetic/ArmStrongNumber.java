package TrainingArithmetic;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		int remainder;
		int temp=n;
		int sum=0;
		while(n>0) {
			remainder= n%10;
			n=n/10;
			
			sum +=remainder*remainder*remainder;
			}
		if (sum==temp) {
			System.out.println("Number is Armstrong number");
			System.out.println(sum);
		}
		else {
			System.out.println("Number is not Armstrong number");
			System.out.println(sum);
		}
		
	}

}
