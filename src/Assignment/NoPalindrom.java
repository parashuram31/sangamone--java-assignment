package Assignment;

import java.util.Scanner;

public class NoPalindrom{
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner scanner=new Scanner(System.in);
	int no=scanner.nextInt();
	int copy=no;
	int rev=0;
	while (no!=0) {
		int rem=no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	System.out.println(rev);
	if(copy==rev) {
		System.out.println("Pallindrome");
	}
	else {
		System.out.println("Not a pallindrome");
	}
} 
}
