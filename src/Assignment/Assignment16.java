package Assignment;

import java.util.Scanner;

public class Assignment16 {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	int fact=1;
	for (int i=a;i>=1;i--) {
		fact=fact*i;
	}
	System.out.println(fact);
}
}
