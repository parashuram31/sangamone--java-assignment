package Assignment;

import java.util.Scanner;

public class MaxNumber {
public static void main(String[] args) {
	System.out.println("Enter A value");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	
	System.out.println("Enter B value");
	int b=scanner.nextInt();
	
	System.out.println("Enter C value");
	int c=scanner.nextInt();
	
	int max=maximum(a,b,c);
	System.out.println("Maximum value is " + max);
}

public static int maximum(int a,int b,int c) {
	int max = a;
	
	if (a>b && a>c) {
		max=a;
	}
	if(b>a && b>c) {
		max=b;
	}
	if(c>a && c>b) {
		max=c;
	}
	return max;
}
}
