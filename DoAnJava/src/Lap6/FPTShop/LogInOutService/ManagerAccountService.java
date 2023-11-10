package Lap6.FPTShop.LogInOutService;

import Lap6.FPTShop.Account.Manager;
import Lap6.FPTShop.Account.SalesUser;
import Lap6.FPTShop.Service.ProductService;
import Lap6.FPTShop.entities.Product;
import Lap6.Role.RoleFPTShopService;
import Lap6.Utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManagerAccountService {
    StaffAccountService salesAccountService = new StaffAccountService();
    ProductService productService = new ProductService();
    Map<Integer, Product> productMap = new HashMap<>();
    ArrayList<SalesUser> salesUsers = new ArrayList<>();
    Utils utils = new Utils();
    private String currentManager;
    private Map<String, String> userCredentials = new HashMap<>();


    private void initializeUserCredentials() {
        userCredentials.put("admin", "admin123"); // Khởi tạo các tài khoản người quản lý
    }


    public void inputLogin(Scanner scanner, Map<String, Manager> managerMap) {
        int choose;
        do {
            System.out.println("Chon mot tuy chon:");
            System.out.println("1. Dang nhap");
            System.out.println("2. Thoat ");
            System.out.println("Enter your choice:");

            choose = utils.inputInt(scanner);
            switch (choose) {
                case 1:
                    login(scanner, managerMap);
                    break;
                case 2:
                    RoleFPTShopService roleFPTShopService = new RoleFPTShopService();
                    roleFPTShopService.roleAccount(scanner);
                    break;
                default:
                    System.out.println("Lua chon khong hop len , vui long nhap lai");
                    break;
            }
        } while (true);
    }

    public void login(Scanner scanner, Map<String, Manager> managerMap) {
        System.out.println("Đăng nhập");
        System.out.print("Nhập username: ");
        String username = scanner.nextLine();
        System.out.print("Nhập password: ");
        String password = scanner.nextLine();
        if (managerMap.containsKey(username) && managerMap.get(username).equals(password)) {
            currentManager = username;
            System.out.println("Chào mừng " + username + ", bạn có thể thực hiện các công việc sau:");
            menuManager(scanner);
        } else {
            System.out.println("Đăng nhập không thành công. Kiểm tra lại username và password.");
            login(scanner, managerMap);
        }


    }

    public void menuManager(Scanner scanner) {
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
                    salesAccountService.registerStaffAccount(scanner,salesUsers);
                    break;
                case 2:
                    productService.addProduct(scanner, productMap);
                    break;
                case 3:
                    productService.viewProduct(productMap);
                    menuManager(scanner);
                    break;
                case 4:
                    productService.deleteProduct(scanner, productMap);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }




    private void lockStaffAccount(Scanner scanner,Map<String,SalesUser>salesUserMap) {
        System.out.print("Username nhân viên cần khóa: ");
        String username = scanner.nextLine();

        if (salesUserMap.containsKey(username)) {
            salesUserMap.remove(username);
            System.out.println("Tài khoản nhân viên đã được khóa thành công.");
            menuManager(scanner);
        } else {
            System.out.println("Không tìm thấy tài khoản nhân viên với username đã nhập.");
        }
    }

}