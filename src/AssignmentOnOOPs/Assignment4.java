package AssignmentOnOOPs;

import java.util.Scanner;

public class Assignment4 {
private String accountnumber;
private double balance;
public String getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(String accountnumber) {
	this.accountnumber = accountnumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public void diposite(double amount) {
	if (amount > 0) {
		balance+=amount;
		System.out.println("Diposited - "+amount);
		System.out.println("Curent balance is - "+balance);
	}
	else {
		System.out.println("Incalid Entered amount");
	}
}

public void withdraw(double amount) {
	if (amount > 0) {
		if (balance >=amount) {
			balance-=amount;
			System.out.println("Amount withdraw successfull - "+amount);
			System.out.println("Curent balance is - "+balance);
		}
		else {
			System.out.println("Insuficient fund");
		}
	}
	else {
		System.out.println("Invalid fund");
	}
}

public static void main(String[] args) {
	Assignment4 assignment4=new Assignment4();
	assignment4.setAccountnumber("8743998940049");
	assignment4.setBalance(5000.65);
	
	System.out.println("Account No;- "+assignment4.getAccountnumber());
	System.out.println("Initial Account bal:- "+assignment4.getBalance());
	assignment4.diposite(5000.00);
	assignment4.withdraw(4000.00);
}
}
