package Lap6.FPTShop.LogInOutService;

import Lap6.FPTShop.Account.SalesUser;
import Lap6.FPTShop.Service.FPTShopService;
import Lap6.FPTShop.entities.Staff;
import Lap6.Role.RoleFPTShopService;
import Lap6.Utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaffAccountService {
    private SalesUser currentSalesUser;
    Utils utils = new Utils();
    Map<Integer, Staff>staffMap = new HashMap<>();
    FPTShopService shopService = new FPTShopService();


    // Phan menu
    public  void inputLoginStaff(Scanner scanner,ArrayList<SalesUser>salesUsers){
        int choose;
        do {
            System.out.println("Đăng nhập tài khoản nhân viên:");
            System.out.println("1. Dang nhap");
            System.out.println("2. Thoat");
            System.out.println("Enter your choice:");

            choose = utils.inputInt(scanner);
            switch (choose) {
                case 1:
                    loginStaff(scanner,salesUsers);
                    break;
                case 2:
                    RoleFPTShopService roleFPTShopService = new RoleFPTShopService();
                    roleFPTShopService.roleAccount(scanner);
                    break;
                default:
                    System.out.println("Lua chon khong hop len , vui long nhap lai");
                    break;
            }
        }while (true);
    }


    // Log In Start ------------------------------------------------------------------------------------------------
    // Phan dang nhap
    public void loginStaff(Scanner scanner,ArrayList<SalesUser>salesUsers){
        System.out.println("Nhap usename :");
        String username = utils.inputString(scanner);
        System.out.println("Nhap password :");
        String password = utils.inputString(scanner);

        SalesUser salesUser = findUserByUsername(username,salesUsers);
        if (salesUser == null) {
            System.out.println("Kiem tra lai username");
            loginStaff(scanner, salesUsers);
        }else if (!salesUser.getPassword().equals(password)){
            System.out.println("Kiem tra lai password");
        }else {
            currentSalesUser = salesUser;
            System.out.println("Chao mung " + salesUser.getUsername() + ", ban co the thuc hien cong viec sau:");
            menuStaff(scanner, salesUsers);
        }
    }

    public void menuStaff(Scanner scanner, ArrayList<SalesUser> salesUsers){
        int choice;
        do {
            System.out.println("1. Vao trang chu ");
            System.out.println("2. Thay doi mat khau");
            System.out.println("3. Dang xuat");

            choice = utils.inputInt(scanner);
            switch (choice){
                case 1:
                    shopService.inputStaffAccount(scanner, staffMap);
                case 2:
                    changePassword(scanner);
                    break;
                case 3:
                    inputLoginStaff(scanner, salesUsers);
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai:");
                    break;
            }
        }while (true);
    }

    /// Tạo tài khoản nhân viên
    public void registerStaffAccount(Scanner scanner, ArrayList<SalesUser> salesUsers){
        System.out.println("Nhap username nhan vien moi:");
        String username = utils.inputString(scanner);
        System.out.println("Nhap mat khau :");
        String password = utils.inputString(scanner);
        if (findUserByUsername(username,salesUsers) != null){
            System.out.println("Username da ton tai, vui long nhap lai:");
        }else if (!isValidPassword(password)){
            System.out.println("Mat khau khong hop le, vui long nhap lai :");
        }else {
            SalesUser salesUser = new SalesUser(username,password);
            salesUsers.add(salesUser);
            System.out.println("Tao tai khoan thanh cong ");
        }
    }




    private void changePassword(Scanner scanner){
        System.out.println("Nhap password moi:");
        String newPassword = utils.inputString(scanner);
        if (!isValidPassword(newPassword)){
            System.out.println("Mat khau khong hop le , vui long nhap lai:");
            changePassword(scanner);
        }else{
            currentSalesUser.setPassword(newPassword);
            System.out.println("Thay doi thanh cong");
        }
    }


    private SalesUser findUserByUsername(String username, ArrayList<SalesUser> salesUsers){
        for (SalesUser salesUser : salesUsers) {
            if (salesUser.getUsername().equals(username)) {
                return salesUser;
            }
        }
        return null;
    }


    boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[.,-_;])(?=.{7,15}$).*$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }


}
