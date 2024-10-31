package task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer [] customers = new Customer[10];
        Customer customer1 = new Customer(1L,"Test","test@gmail.com","23456789", LocalDate.of(2000,8,8));
        Customer customer2 = new Customer(2L,"Fatima","test@gmail.com","23456789", LocalDate.of(2000,8,8));
        Customer updateCustomer = new Customer(2L,"Azmar","azmar@gmail.com","23456789", LocalDate.of(2000,8,8));

//        // create
        customers = customer.createCustomer(customers,customer1);
        customers = customer.createCustomer(customers,customer2);
        // getAll
        System.out.println(Arrays.toString(customer.getAllCustomers(customers)));

        // get by id

        System.out.println("Get by id Customer:  " + customer.getById(1L, customers));

//        update Customer
        System.out.println(Arrays.toString(customer.updateCustomer(2L, customers, updateCustomer)));
        System.out.println(Arrays.toString(customer.deleteCustomer(2L, customers)));

        System.out.println("test");

    }
}
