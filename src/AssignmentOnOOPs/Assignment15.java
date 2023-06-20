package AssignmentOnOOPs;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String accountNumber;

    public Customer(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class Bank {
    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomerByAccountNumber(String accountNumber) {
        for (Customer customer : customers) {
            if (customer.getAccountNumber().equals(accountNumber)) {
                return customer;
            }
        }
        return null; // Customer not found
    }
}

public class Assignment15 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Adding customers
        Customer customer1 = new Customer("Prajwal", "123456");
        Customer customer2 = new Customer("Parashuram", "987654");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Retrieving customer information
        String accountNumber = "123456";
        Customer retrievedCustomer = bank.getCustomerByAccountNumber(accountNumber);

        if (retrievedCustomer != null) {
            System.out.println("Customer Name: " + retrievedCustomer.getName());
            System.out.println("Account Number: " + retrievedCustomer.getAccountNumber());
        } else {
            System.out.println("Customer not found");
        }
    }
}
