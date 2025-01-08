package ConditionalStatements;

import java.util.Scanner;

public class SCSwitch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String websitename;
		System.out.println("Enter the Domain name");//http://ww.google.com
		websitename= sc.nextLine();
		
		String ext = websitename.substring(websitename.lastIndexOf(".")+1);
		System.out.println(ext);
		switch(ext) {
		case "com": System.out.println("Commercial");
		break;
		case "org": System.out.println("Organisation");
		break;
		case "gov": System.out.println("Government");
		break;
		case "net": System.out.println("Network");
		break;
		}

	}

}
