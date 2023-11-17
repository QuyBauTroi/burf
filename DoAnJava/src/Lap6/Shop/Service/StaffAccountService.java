package Lap6.Shop.Service;


import Lap6.Shop.Account.User;
import Lap6.Utils.Utils;
import Lap6.View.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffAccountService {
    Utils utils = new Utils();
    Menu menu = new Menu();



    public void menuStaff(Scanner scanner,OrderService orderService ,ManagerAccountService managerAccountService, RegisterService registerService, CustomerService customerService , StaffAccountService staffAccountService, ArrayList<User> users){

        int choice;
        do {
            System.out.println("1. Xem thong tin tat ca san pham");
            System.out.println("2. Xem thong tin tat ca don hang");
            System.out.println("3. Xem thong tin Khach hang");
            System.out.println("4. Xem thong tin ca nhan");
            System.out.println("5. Thay doi password");
            System.out.println("6. Dang xuat");
            System.out.println("---------- Enter your choice -----------");
            choice = utils.inputInt(scanner);
            switch (choice){
                case 1:
                    managerAccountService.viewProduct();
                    break;
                case 2:
                    orderService.viewOrders();
                    break;
                case 3:
                    registerService.viewCustomer();
                    break;
                case 4:
                    break;
                case 5:
                    registerService.changePassword(scanner);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai:");
                    break;
            }
        }while (true);
    }

}
