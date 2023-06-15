package Assignment;

import java.util.Scanner;

public class Assignment14 {
public static void main(String[] args) {
	int arr[]=new int [5];
	int max;
	System.out.println("Enter the number");
	Scanner scanner=new Scanner(System.in);
	for (int i=0;i<5;i++) {
		 arr[i]=scanner.nextInt();
	}
	max=arr[0];
	for(int i=1;i<5;i++) {
		if (arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("Largest number is "+max);
}
}
