package Assignment;

import java.util.Scanner;

public class Assignment12 {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner scanner=new Scanner(System.in);
	String str=scanner.next();
	
	for (int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		
		if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.print(ch+" ");
		}
	}
}
}
