package StringsTraining;


/*
 Find the number is binary or not 
 find is number is hexa-desimal
 find the data in date format (dd/mm/yyyy)
 */
public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b= 1011001;
//		String str= b+"";
		String str= String.valueOf(b);
		System.out.println("The value is in the form of binary "+str.matches("[01]*"));
		
//		Hexa Desimal
//		int hexa=12365478;
		String str2= "264A";
//		String str2= String.valueOf(hexa);
		System.out.println("The value is in the form of Hexa desimal "+str2.matches("[0-9A-F]+"));
		
//		Date in rezx date
		
		String d= "01/12/2024";
		System.out.println("The value is in the form of Date "+d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
		
//		Replace the Special charectors
		String string= "a@3E%*m42?";
		System.out.println("The value After removing special charectors "+string.replaceAll("[^a-zA-Z0-9]",""));
		
//      Replace the  extra spaces
		String string2= "abc  yj   jnd  jnkc kk";
		System.out.println("The value After removing special charectors "+string2.replaceAll("\\s+"," "));
		
//      Replace the  extra spaces
		String string3= "   abc  yj   jnd  jnkc kk  ";
		System.out.println("The value After removing special charectors "+string3.replaceAll("\\s+"," ").trim());
		
		
//      Number of word counts
		String string4= "   abc  def  ijk lmn opa ";
		
		string4= string4.replaceAll("\\s+", " ");
		String words[]=string4.split("\\s");
		System.out.println(words.length);
		System.out.println(words[3]);
	}

}
