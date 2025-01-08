package StringsTraining;

public class RegularExpression {
	public static void main(String[] args) {
//		Rezx == .
		String str ="q";
		System.out.println(str.matches("."));//True
		String str2 ="8";
		System.out.println(str2.matches("."));//True
		String str3 ="86";
		System.out.println(str3.matches("."));//false
		String str4 ="$";
		System.out.println(str4.matches("."));//True
		String str5 ="@#";
		System.out.println(str5.matches("."));//false
		
		String str6 ="a";
		System.out.println(str6.matches("[abc]"));//True
		String str7 ="abc";
		System.out.println(str7.matches("[abc]"));//false
		String str8 ="p";
		System.out.println(str8.matches("[abc]"));//false
		String str9 ="p";
		System.out.println(str9.matches("[^abc]"));//True
		
		String str10 ="p";
		System.out.println(str10.matches("[^abc]"));//True It should not be abc(Not off)
		
		String str11 ="p";
		System.out.println(str11.matches("[a-z0-9]"));//True
		
		String str12 ="9";
		System.out.println(str12.matches("[a-z0-9]"));//True
		
		String str13 ="a7";
		System.out.println(str13.matches("[a-z][0-9]"));//True
		
		String str14 ="a$";
		System.out.println(str14.matches("[a-z][0-9]"));//false
		
		String str15 ="a$";
		System.out.println(str15.matches("a|b"));//false
		
		String str16 ="a";
		System.out.println(str16.matches("\\w"));//true
		
		String str17 ="5";
		System.out.println(str17.matches("\\w"));//true
		
		
		String str18 ="$";
		System.out.println(str18.matches("\\w"));//false
		
		String str19 ="$";
		System.out.println(str19.matches("\\D"));//True
		
		String str20 ="asc jdd";
		System.out.println(str20.matches(".*"));//True
		
		String str21 ="asc6jdd";
		System.out.println(str21.matches("[a-z]*"));//false 6 is present
		
		String str22 ="abcabacbaabcacb";
		System.out.println(str22.matches("[abc]*"));//True
		
		String str23 ="abc";
		System.out.println(str23.matches("[abc]{3}"));//True
		
		String str24 ="ab";
		System.out.println(str24.matches("[abc]{3}"));//false must be 3 letteres
		
		String str25 ="john@gmail.com";
		System.out.println(str25.matches(".*@gmail.*"));//true
		System.out.println(str25.matches("\\w*@gmail(.*)"));//true

		System.out.println(str25.matches("\\w*gmail(.*)"));//false
		
		int b= 1011001;
//		String str= b+"";
		String str26= String.valueOf(b);
		System.out.println("The value is in the form of binary "+str26.matches("[01]*"));
		
//		Hexa Desimal
//		int hexa=12365478;
		String str27= "264A";
//		String str2= String.valueOf(hexa);
		System.out.println("The value is in the form of Hexa desimal "+str27.matches("[0-9A-F]+"));
		
//		Date in rezx date
		
		String d= "01/12/2024";
		System.out.println("The value is in the form of Date "+d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
		
	}
}
