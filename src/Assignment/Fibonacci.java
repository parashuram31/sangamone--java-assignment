package Assignment;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner scanner=new Scanner(System.in);
	int no=scanner.nextInt();
	
	int f1=0;
	int f2=1;
	int f3=0;
	
	for (int i=1;i<=no-2;i++) {
		f3=f1+f2;
		f1=f2;
		f2=f3;
	}
	System.out.println("The fibonacci no is "+f3);
}
}
