package Lap6.View;

import Lap6.FPTShop.LogInOutService.AccountService;
import Lap6.FPTShop.LogInOutService.RegisterService;
import Lap6.FPTShop.Service.ProductService;
import Lap6.Utils.Utils;

import java.util.Scanner;

public class Menu {
    Utils utils = new Utils();
    AccountService accountService = new AccountService();

    public void optionMenu(Scanner scanner, ProductService productService, RegisterService registerService){
        int choice;
        do {
            System.out.println("Moi ban lua chon:");
            System.out.println("1. Xem tất cả sản phẩm ");
            System.out.println("2. Đăng nhập tài khoản");
            System.out.println("3. Đăng ký tài khoản");
            System.out.print("Enter your choice:");
            choice = utils.inputInt(scanner);
            switch (choice){
                case 1:
                    productService.viewProduct();
                    break;
                case 2:
                    accountService.login(scanner,registerService);
                    break;
                case 3:
                    registerService.register(scanner);
                    break;
            }
        }while (true);
    }
}

