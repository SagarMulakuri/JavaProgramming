package ConditionalStatements;

import java.util.Scanner;

public class Typeofthewebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String websitename;
		System.out.println("Enter the number");
		websitename= sc.nextLine();
		
		String protocol = websitename.substring(0, websitename.indexOf(":"));
		System.out.println(protocol);
		
		// http://www.google.com
		if(protocol.equals("http")) {
			System.out.println("Hypertext Transfer Protocol");
		}
		else if(protocol.equals("ftp")) {
			System.out.println("File Transfer Protocol");
		}
		String ext = websitename.substring(websitename.lastIndexOf(".")+1);
		System.out.println(ext);
		if(ext.equals("com")) {
			System.out.println("Commercial");
		}
		else if(ext.equals("Org")) {
			System.out.println("Organization");
		}
		else if(ext.equals("net")) {
			System.out.println("network");
		}
	}
}
