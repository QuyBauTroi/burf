package Lap6.FPTShop.LogInOutService;

import Lap6.FPTShop.Account.User;
import Lap6.FPTShop.Service.CustomerService;
import Lap6.FPTShop.Service.ManagerAccountService;
import Lap6.FPTShop.Service.ProductService;
import Lap6.Utils.Utils;
import java.util.Scanner;

public class AccountService {
    Utils utils = new Utils();
    ProductService productService = new ProductService();


    // Phan dang nhap
    public void login(Scanner scanner, RegisterService registerService) {
        System.out.println("Dang nhap");
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
                choice = utils.inputInt(scanner);
                switch (choice) {
                    case 1:
                        login(scanner, registerService);
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
                    ManagerAccountService managerAccountService = new ManagerAccountService();
                    managerAccountService.menuManager(scanner,registerService,productService);
                    break;
                case 2:
                    // Menu staff
                    break;
                case 3:
                    //Menu user
                    CustomerService customerService = new CustomerService();
                    customerService.menuCustomer(scanner);
                    break;
            }
        }
    }
}
