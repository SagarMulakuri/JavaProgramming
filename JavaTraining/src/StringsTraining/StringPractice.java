package StringsTraining;

public class StringPractice {
	public static void main(String[] args) {
		String str2 = new String("Java");
		char  c[]= {'H','e','l','l','o'};
		byte b[]= {65,66,67,68};
		String str4 =new String(b); //String class is present in lang package
		System.out.println(str4);//Output ABCD
		System.out.println(c);//Output Hello
		String str3 =new String(b,1,2);
		System.out.println(str3);//Output BC 
	}

}
