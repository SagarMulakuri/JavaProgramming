package ConditionalStatements;
 import java.util.Scanner;
public class Radixnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String num;
		System.out.println("Enter the number");
		num= sc.nextLine();
		
		if(num.matches("[01]+")) {
			System.out.println("Binary Radix=2");
		}
		else if (num.matches("[0-7]+")) {
			System.out.println("Octal Radix=8");
		} else if(num.matches("[0-9A-F]+")){
			System.out.println("Hexa Radix=16");
		}
		else if(num.matches("[0-9]+")) {
			System.out.println("Decimal number Radix=10");
		}
		else {
			System.out.println("not a number");
		}
	}

}
