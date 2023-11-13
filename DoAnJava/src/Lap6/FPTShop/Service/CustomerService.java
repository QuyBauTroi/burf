package Lap6.FPTShop.Service;

import Lap6.FPTShop.entities.Customer;
import Lap6.Utils.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerService {

    Utils utils = new Utils();
    Map<Integer, Customer> customerMap = new HashMap<>();


    public void inputCustomerAccount(Scanner scanner){
        System.out.println("Moi ban xac thuc thong tin cho tai khoan:");
        System.out.println("Nhap ho va ten :");
        String name = utils.inputString(scanner);
        System.out.println("Nhap so dien thoai :");
        String phoneNumber = utils.inputString(scanner);
        System.out.println("Nhap dia chi nha :");
        String address = utils.inputString(scanner);
        Customer customer = new Customer(name,phoneNumber,address);
        System.out.println("Ban co muon nap tien vào tai khoan khong ? (Y/N)");
        String choice = utils.inputString(scanner);
        if (choice.equalsIgnoreCase("y")){
            System.out.println("Moi ban nhap so tien muon nap vao:");
            double amount = utils.inputDouble(scanner);
            customer.addBalance(amount);
            System.out.println("Nap tien thanh cong");
        }
        customerMap.put(customer.getId(),customer);
        System.out.println("Chao mung"+ customer.getName() + ", ban co the thuc hien cong viec sau:");

    }

    public void menuCustomer(Scanner scanner){
        int choose;
        do {
            System.out.println("1. Xem thong tin tat ca san pham");
            System.out.println("2. Xem thong tin don hang cua ban than");
            System.out.println("3. Order san pham");
            System.out.println("4. Xem thong tin ca nhan");
            System.out.println("5. Chinh sua thong tin ca nhan");
            System.out.println("6. Thay doi mat khau");
            System.out.println("7. Thay doi email");
            System.out.println("8. Dang xuat");
            choose = utils.inputInt(scanner);
            switch (choose){
                case 1:

                    break;
                case 2:
                case 3:

                    break;
                case 6:

                    break;
            }
        }while (true);
    }

}