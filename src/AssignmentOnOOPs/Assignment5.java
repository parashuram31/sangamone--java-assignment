package AssignmentOnOOPs;

public class Assignment5 {
private String make;
private String model;
private int year;
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public static void main(String[] args) {
	Assignment5 mycar=new Assignment5();
	mycar.setMake("Mahindra");
	mycar.setModel("Scorpio");
	mycar.setYear(2022);
	
	System.out.println("Make-"+mycar.getMake());
	System.out.println("Model-"+mycar.getModel());
	System.out.println("Year-"+mycar.getYear());
}
}
