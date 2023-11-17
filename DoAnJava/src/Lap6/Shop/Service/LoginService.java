package Lap6.Shop.Service;

import Lap6.Shop.Account.User;
import Lap6.Shop.entities.Customer;
import Lap6.Utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginService {
    Utils utils = new Utils();


    // Phan dang nhap
    public void login(Scanner scanner,OrderService orderService, ManagerAccountService managerAccountService , RegisterService registerService, CustomerService customerService, StaffAccountService staffAccountService, ArrayList<User>users, Customer customer) {
        System.out.println("-----Dang nhap-----");
        System.out.println("Nhap usename :");
        String username = utils.inputString(scanner);
        System.out.println("Nhap password :");
        String password = utils.inputString(scanner);


        registerService.managerAccount(); // Chuyền tài khoản manager vào
        User user = registerService.findUserByUsername(username);

        if (user == null) {
            System.out.println("Kiem tra lai username");
        } else if (!user.getPassword().equals(password)) {
            int choice;
            do {
                System.out.println("Nhap sai password");
                System.out.println("Chon 1 tuy chon:");
                System.out.println("1. Dang nhap lai");
                System.out.println("2. Quen mat khau");
                System.out.println("---------- Enter your choice -----------");
                choice = utils.inputInt(scanner);
                switch (choice) {
                    case 1:
                        login(scanner,orderService,managerAccountService, registerService,customerService,staffAccountService,users,customer);
                        return;
                    case 2:
                        registerService.forgotPassword(scanner);
                        return;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;
                }
            } while (true);
        } else {
            // Phương thức kiểm tra role ////
            registerService.currentUser = user;
            System.out.println("Chao mung " + user.getUsername() + ", ban co the thuc hien cong viec sau:");
            switch (registerService.currentUser.getRole()) {
                case 1:
                    // Menu quan ly
                    managerAccountService.menuManager(scanner,registerService, staffAccountService);
                    break;
                case 2:
                    // Menu staff
                    staffAccountService.menuStaff(scanner,orderService,managerAccountService,registerService,customerService,staffAccountService,users);
                    break;
                case 3:
                    //Menu user
                    customerService.menuCustomer(scanner,orderService,managerAccountService,registerService,customer);
                    break;
            }
        }
    }
}
