package Assignment;

import java.util.Scanner;

public class Assignment20 {
	public static void main(String[] args) {
		System.out.println("Enter First Number");
		Scanner scanner=new Scanner(System.in);
		double num1=scanner.nextInt();
		
		System.out.println("Enter Second Number");
		double num2=scanner.nextInt();
		
		System.out.println("Plese select the Operation");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Addition");
		
		System.out.println("Enter your choice(1-4)");
		
		int choice=scanner.nextInt();
		double result=0;
		
		switch (choice) {
		case 1: result=num1+num2;
				System.out.println(result);
				break;
				
		case 2: result=num1-num2;
				System.out.println(result);
				break;
				
		case 3: result=num1*num2;
				System.out.println(result);
				break;
				
		case 4: result=num1/num2;
		System.out.println(result);
				break;
				
		default : System.out.println("Invalid Input");
		     	  break;
		}
		}

}
