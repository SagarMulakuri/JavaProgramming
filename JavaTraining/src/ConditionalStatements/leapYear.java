package ConditionalStatements;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter the Year");
		year= sc.nextInt();
		
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					System.out.println(year+" is a leap year");
				}
				else {
					System.out.println(year+" is not a leap year");
				}
			}
			else {
				System.out.println(year+" is a leap year");
			}
			
		}
		else {
			System.out.println(year + "isnot a leap year");
		}
	}

}
