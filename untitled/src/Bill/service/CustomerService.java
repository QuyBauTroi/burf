package Bill.service;

import Bill.entities.Bill;
import Bill.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    public Customer InputCustomer(Scanner scanner , ArrayList<Customer>customers){
        System.out.println("Moi ban nhap Ho ten chu nha:");
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap so ma cong to dien:");
        String meterCode = scanner.nextLine();


        BillService billService = new BillService();
        billService.InputBill(scanner, customers);
        return new Customer(name,address,meterCode,billService);
    }
}
