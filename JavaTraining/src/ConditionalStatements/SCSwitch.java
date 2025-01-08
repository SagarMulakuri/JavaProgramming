package ConditionalStatements;

import java.util.Scanner;

public class SCSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("Enter the day number");
		day= sc.nextInt();
		
		switch (day) {
		case 1: System.out.println("Mon");
		break;
		case 2: System.out.println("Tue");
		break;
		case 3: System.out.println("Wed");
		break;
		case 4: System.out.println("Thu");
		break;
		case 5: System.out.println("Fry");
		break;
		case 6: System.out.println("sat");
		break;
		case 7: System.out.println("sun");
		break;
		default: System.out.println("Not a valid number");
		break;
		}
	}

}
