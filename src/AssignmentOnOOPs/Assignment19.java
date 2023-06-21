package AssignmentOnOOPs;

interface Taxable {
    double calculateTax();
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee implements Taxable {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateTax() {
        
        double taxRate = 0.2; 
        return getSalary() * taxRate;
    }
}

class Engineer extends Employee implements Taxable {
    public Engineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateTax() {
        
        double taxRate = 0.15; 
        return getSalary() * taxRate;
    }
}

public class Assignment19 {
    public static void main(String[] args) {
        Employee manager = new Manager("Prajwal", 5000.0);
        double managerTax = ((Taxable) manager).calculateTax();
        System.out.println("Manager Tax: " + managerTax);

        Employee engineer = new Engineer("Parashuram", 4000.0);
        double engineerTax = ((Taxable) engineer).calculateTax();
        System.out.println("Engineer Tax: " + engineerTax);
    }
}

