package Lap6.FPTShop.Service;

import Lap6.FPTShop.Account.User;
import Lap6.FPTShop.LogInOutService.UserAccountService;
import Lap6.FPTShop.entities.Product;
import Lap6.Utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GuestService {
    Utils utils = new Utils();
    ProductService productService = new ProductService();
    Map<Integer, Product> productMap = new HashMap<>();
    UserAccountService userAccountService = new UserAccountService();
    ArrayList<User> Users = new ArrayList<>();

    public void menuGuest(Scanner scanner){
        int choice;
        do {
            System.out.println("1. Xem tất cả sản phẩm ");
            System.out.println("2. Đăng nhâp/Đăng ký tài khoản");

            choice = utils.inputInt(scanner);
            switch (choice){
                case 1:
                    productService.viewProduct(productMap);
                    break;
                case 2:
                    userAccountService.inputMenu(scanner,Users);
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai:");
                    break;
            }
        }while (true);
    }
}
