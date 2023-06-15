package Assignment;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter a Number");
	boolean flag=true;
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	for(int i=2;i<no;i++) {
		if(no%i==0) {
			flag=false;
		}
	}
	if (flag==true) {
		System.out.println("Prime number");
	}
	else {
		System.out.println("Not a Prime number");
	}
}
}
