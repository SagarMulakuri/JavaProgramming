package ConditionalStatements;

import java.util.Scanner;

public class DisplayNameForAdayBasedonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the day number");
		num= sc.nextInt();
		
		if(num==1) {
			System.out.println("Mon");
		}
		else if(num==2) {
			System.out.println("Tue");
		}
		else if(num==2) {
			System.out.println("Wed");
		}
		else if(num==2) {
			System.out.println("Thu");
		}
		else if(num==2) {
			System.out.println("Fri");
		}
		else if(num==2) {
			System.out.println("Sat");
		}
		else if(num==2) {
			System.out.println("Sun");
		}
		else {
			System.out.println("Not a valid number");
		}
	}
}
