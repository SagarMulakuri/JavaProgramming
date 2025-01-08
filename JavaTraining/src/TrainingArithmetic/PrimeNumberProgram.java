package TrainingArithmetic;

import java.util.Scanner;

public class PrimeNumberProgram {
	
	static boolean isPrime(int number) {
		for (int i=2; i<=number/2;i++) {
			if(number%i==0) {
				System.out.println("is not Prime Number");
				return true;
			}
		}
		System.out.println("is Prime Number");
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check ");
		int val= sc.nextInt();
	    isPrime(val);
	}

}
