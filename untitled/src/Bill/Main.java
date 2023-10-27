package Bill;

import Bill.entities.Customer;
import Bill.service.BillService;
import Bill.service.CustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so n ho dan:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            CustomerService customerService = new CustomerService();
            ArrayList<Customer> customers = new ArrayList<>();
            System.out.println(customerService.InputCustomer(scanner,customers));
        }
    }
}
