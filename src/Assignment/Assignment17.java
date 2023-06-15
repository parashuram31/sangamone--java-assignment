package Assignment;


import java.util.Arrays;
import java.util.Scanner;

public class Assignment17 {
public static void main(String[] args) {
	System.out.println("Enter a string");
	Scanner scanner=new Scanner(System.in);
	String str1= scanner.next();
	System.out.println("Enter another String");
	Scanner scanner2=new Scanner(System.in);
	String str2=scanner2.next();
	
	if (str1.length()==str2.length()) {
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean res=Arrays.equals(c1, c2);
		
		if(res==true) {
			System.out.println("Anagrom");
		}else {
			System.out.println("not an anagram");
		}
	}
	else {
		System.out.println("Not an Anagram");
	}
}
}
