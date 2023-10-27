package Bill.service;

import Bill.entities.Bill;
import Bill.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class BillService {
    public Bill InputBill(Scanner scanner, ArrayList<Customer>customers){
        System.out.println("Nhap chi so cu:");
        long oldNumber = Long.parseLong(scanner.nextLine());
        System.out.println("Nhap chi so moi:");
        long newNumber = Long.parseLong(scanner.nextLine());
        Bill bill = new Bill(oldNumber,newNumber);
        System.out.println("So tien phai tra la:"+bill.Price());
        return bill;
    }
}
