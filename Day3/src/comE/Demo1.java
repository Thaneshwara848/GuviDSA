package comE;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		String str="Java is a programing lang";
//		aaiaoaia
//		vowels  : aeiou 
//		consonents : rest all are consonents
		int vowel = 0 ;
		int consonants =0 ;
		for(char ch : str.toCharArray()) {
			if("aeiou".contains(String.valueOf(ch))) {
				vowel++;
			}
			else {
				consonants++;
			}
		}
		System.out.println("VOWELS COUNT : "+ vowel);
		System.out.println("COnsonents :"+ consonants);
		
		
//		String str="Java is a programing lang";
//		String words[]=str.split("\\s");
//		String longest="";
//		for(String word :words) {
//			if(word.length() > longest.length()) {
//				longest=word;
//			}
//		}
//		System.out.println("Longest word in Given Senatnce is :"+ longest);
		
//		String str="Java is a programing lang";
//		String words[]=str.split("\\s");
//		for(String word :words) {
//			System.out.println(new StringBuffer(word).reverse().toString());
//		}
//		String reversed=new StringBuffer(str).reverse().toString();
	//	System.out.println(reversed);
		
		
		
		
		// count the no of words in given santance ...!
//		String str="Java is a programing lang";
//		String words[]=str.split("\\s");
//		System.out.println(words.length); 
//		
		
//		Palindrom ... .!
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter text ...!");
//		String str= sc.next();
//		String reversed=new StringBuffer(str).reverse().toString();
//		System.out.println(reversed);
//
//		if(str.equalsIgnoreCase(reversed)) {
//			System.out.println("Palindrom...!");
//			
//		}
//		else {
//			System.out.println("Not a Palindrom...!");
//		}
	}

}
