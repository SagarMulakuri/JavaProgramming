package ConditionalStatements;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("====");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		
		System.out.println("Enter two numbers ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.nextLine();// To avoid the Not entering the value
		System.out.println("Enter Option of two words ");
		String options = sc.nextLine();
		options= options.toUpperCase();
		switch(options) {
		case "ADD": System.out.println("Sum is "+ (x+y));
		break;
		case "SUB": System.out.println("Sub is "+ (x-y));
		break;
		case "MUL": System.out.println("Mul is "+ (x*y));
		break;
		case "Div": System.out.println("Div is "+ (x/y));
		break;
		default:   System.out.println("Invalid Option");
		break;	
		}
	}

}
