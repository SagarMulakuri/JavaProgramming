package TrainingArithmetic;

import java.util.Scanner;

public class AirthmaticProgressionPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to genarate the ap series");
		System.out.println("Enter a,d and n");
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int term=a;
		for (int i=0; i<=n; i++) {
			System.out.print(term+",");
			term= term+d;
		}
	}

}
   