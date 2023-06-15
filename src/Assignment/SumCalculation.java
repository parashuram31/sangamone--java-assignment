package Assignment;

import java.util.Scanner;

public class SumCalculation {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The first number");
	int num1=s.nextInt();
	
	System.out.println("Enter second number");
	int num2=s.nextInt();
	
	int sum=num1+num2;
	System.out.println(sum);
}
}
