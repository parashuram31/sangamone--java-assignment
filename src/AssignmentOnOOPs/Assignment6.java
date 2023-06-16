package AssignmentOnOOPs;

import Assignment.Assignment16;

public class Assignment6 {
private String name;
private double salary;
private  String designation;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}

public Assignment6(String name, double salary, String designation) {
	super();
	this.name = name;
	this.salary = salary;
	this.designation = designation;
}
public double calculate() {
	double bonus=0.05;
	double bonusammount=bonus*salary;
	return bonusammount;
}
public static void main(String[] args) {
	Assignment6 employee=new Assignment6("Parashuram", 25000.00,"Manager");
	
	
	System.out.println("Name = "+employee.getName());
	System.out.println("Salary = "+employee.getSalary());
	System.out.println("Designation = "+employee.getDesignation());
	
	double bonus=employee.calculate();
	System.out.println("Bonus = "+bonus);
}
}
