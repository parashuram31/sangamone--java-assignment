package Assignment;

import java.util.Scanner;

public class Number {
public static void main(String[] args) {
	System.out.println("Enter a number");
	
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	if(n>0) {
		System.out.println("The number is positive");
	}
	else if(n<0) {
		System.out.println("The Number is negative");
	}
	else {
		System.out.println("The number is zero");
	}
		
}
}
