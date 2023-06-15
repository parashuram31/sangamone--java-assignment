package Assignment;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	
	while (no!=0) {
		int rem=no%10;
		int fact=1;
		no=rem;
		for (int i=1;i<=no;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
		no=no/10;
	}
	
}
}
