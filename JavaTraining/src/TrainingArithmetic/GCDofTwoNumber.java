package TrainingArithmetic;

import java.util.Scanner;

public class GCDofTwoNumber {
	
	static int gcd(int m,int n) {
		while(m!=n) {
			if (m>n) {
				m = m-n;
			}
			else  {
				n = n-m;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check ");
		int m= sc.nextInt();
		int n= sc.nextInt();
		int result = gcd(m,n);
		System.out.println("Gcd of 2 number is "+result);
	}

}
