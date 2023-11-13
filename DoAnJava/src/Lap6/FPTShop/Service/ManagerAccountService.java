package Lap6.FPTShop.Service;


import Lap6.FPTShop.LogInOutService.RegisterService;
import Lap6.Utils.Utils;
import Lap6.View.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManagerAccountService {
    Utils utils = new Utils();
    Menu menu = new Menu();

    public void menuManager(Scanner scanner, RegisterService registerService,ProductService productService) {
        System.out.println("1 - Tạo tài khoản cho nhân viên");
        System.out.println("2 - Đăng bài bán sản phẩm");
        System.out.println("3. Xem tất cả sản phẩm");
        System.out.println("4. Xoá sản phẩm");
        System.out.println("5. Khoá tài khoản người dùng");
        System.out.println("6. Khoá tài khoản nhân viên");
        System.out.println("7. Thống kê");
        System.out.println("8. Đăng xuất");
        int choice;
        do {
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerService.registerStaff(scanner);
                    break;
                case 2:
                    productService.addProduct(scanner);
                    break;
                case 3:
                    productService.viewProduct();
                    break;
                case 4:
                    productService.deleteProduct(scanner);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    menu.optionMenu(scanner, productService, registerService);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }






}