package FunWithProgramming;

import java.util.Scanner;

public class MathTableUserInput {

	public static void main(String[] args) {
		System.out.println("Enter Starting Value");
		Scanner scanner=new Scanner(System.in);
		int strt=scanner.nextInt();
		
		System.out.println("Enter End Value");
		Scanner scanner2=new Scanner(System.in);
		int end=scanner2.nextInt();
		
	
		
		for (int i=strt;i<=end;i++) {
			for (int j=1;j<=10;j++) {
				int res=i*j;
				
				System.out.println(i+"*"+j+"= "+res);
			}
			System.out.println();
		}
	}
}
