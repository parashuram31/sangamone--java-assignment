package Assignment;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {
	System.out.println("Enter a String");
	
	Scanner scanner=new Scanner(System.in);
	String str=scanner.next();

	String rev="";
	for (int i=str.length()-1;i>=0;i--)
	rev=rev+str.charAt(i);
	
	if(str.equals(rev)) {
		System.out.println("Palindrome");
	}else
	{
		System.out.println("Not a Pallindrome");
	}
	
}

}
