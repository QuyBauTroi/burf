package Lap6.View;

import Lap6.Shop.Account.User;
import Lap6.Shop.Service.*;
import Lap6.Shop.entities.Customer;
import Lap6.Utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Utils utils = new Utils();
    LoginService loginService = new LoginService();

    public void optionMenu(Scanner scanner, OrderService orderService, ManagerAccountService managerAccountService, RegisterService registerService, CustomerService customerService, StaffAccountService staffAccountService, ArrayList<User>users, Customer customer){
        int choice;
        do {
            System.out.println("Moi ban lua chon:");
            System.out.println("1. Xem tất cả sản phẩm ");
            System.out.println("2. Đăng nhập tài khoản");
            System.out.println("3. Đăng ký tài khoản");
            System.out.println("---------- Enter your choice -----------");
            choice = utils.inputInt(scanner);
            switch (choice){
                case 1:
                    managerAccountService.viewProduct();
                    break;
                case 2:
                    loginService.login(scanner,orderService,managerAccountService,registerService,customerService,staffAccountService,users,customer);
                    break;
                case 3:
                    registerService.register(scanner);
                    break;
            }
        }while (true);
    }
}

