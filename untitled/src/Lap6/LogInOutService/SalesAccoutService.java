package Lap6.LogInOutService;

import Lap6.Account.SalesUser;
import Lap6.ServiceFPTShop.FPTShopService;
import Lap6.Utils.Utils;
import Lap6.entitiesFTPShop.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SalesAccoutService extends FPTShopService{
    private List<SalesUser> salesUserList = new ArrayList<>();
    private SalesUser currentSalesUser;
    Utils utils = new Utils();

    // Phan menu
    public  void inputMenu(Scanner scanner,ArrayList<SalesUser> salesUsers,Map<Integer, Staff>staffMap){
        int choose;
        do {
            System.out.println("Chon mot tuy chon:");
            System.out.println("1. Dang nhap");
            System.out.println("2. Dang ky");
            System.out.println("Enter your choice:");

            choose = utils.inputInt(scanner);
            switch (choose) {
                case 1:
                    login(scanner, salesUsers,staffMap);
                    break;
                case 2:
                    register(scanner, salesUsers,staffMap);
                    break;
                default:
                    System.out.println("Lua chon khong hop len , vui long nhap lai");
                    break;
            }
        }while (true);
    }


    // Log In Start ------------------------------------------------------------------------------------------------
    // Phan dang nhap
    public void login(Scanner scanner, ArrayList<SalesUser> salesUsers, Map<Integer, Staff> staffMap){
        System.out.println("Dang nhap");
        System.out.println("Nhap usename :");
        String username = scanner.nextLine();
        System.out.println("Nhap password :");
        String password = scanner.nextLine();

        SalesUser salesUser = findUserByUsername(username);
        if (salesUser == null) {
            System.out.println("Kiem tra lai username");
        }else if (!salesUser.getPassword().equals(password)){
            int choice;
            do{
                System.out.println("Nhap sai password");
                System.out.println("Chon 1 tuy chon:");
                System.out.println("1. Dang nhap lai");
                System.out.println("2. Quen mat khau");
                choice= Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        login(scanner, salesUsers,staffMap);
                        return;
                    case 2:
                        forgotPassword(scanner);
                        return;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;
                }
            }while (true);
        }else {
            currentSalesUser = salesUser;
            System.out.println("Chao mung " + salesUser.getUsername() + ", ban co the thuc hien cong viec sau:");
            int choice;
            do {
                System.out.println("1. Thay doi username");
                System.out.println("2. Thay doi email");
                System.out.println("3. Thay doi mat khau");
                System.out.println("4. Dang xuat");
                System.out.println("0. Vao trang chu ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        changeUsername(scanner);
                        break;
                    case 2:
                        changeEmail(scanner);
                        break;
                    case 3:
                        changePassword(scanner);
                        break;
                    case 4:
                        inputMenu(scanner, salesUsers,staffMap);
                        return;
                    case 0:
                        inputStaffAccout(scanner,staffMap);
                    default:
                        System.out.println("Lua chon khong hop le, vui long chon lai:");
                        break;
                }
            }while (true);
        }
    }



    // phan quen mk
    private  void forgotPassword(Scanner scanner){
        System.out.println("Quen mat khau");
        System.out.println("Moi ban nhap email :");
        String email = scanner.nextLine();
        if (findUserByEmail(email) == null){
            System.out.println("Email khong ton tai ");
        }else {
            System.out.println("Nhap mat khau moi:");
            String newPassword = scanner.nextLine();
            findUserByEmail(email).setPassword(newPassword);
            System.out.println("Doi mat khau thanh cong");
        }
    }

    private void changeUsername(Scanner scanner){
        System.out.println("Nhap username moi:");
        String newUsername = scanner.nextLine();
        if (findUserByUsername(newUsername) != null){
            System.out.println("Username da ton tai , vui long nhap lai:");
            changeUsername(scanner);
        }else{
            currentSalesUser.setUsername(newUsername);
            System.out.println("Thay doi thanh cong");

        }
    }

    private void changePassword(Scanner scanner){
        System.out.println("Nhap password moi:");
        String newPassword = scanner.nextLine();
        if (!isValidPassword(newPassword)){
            System.out.println("Mat khau khong hop le , vui long nhap lai:");
            changePassword(scanner);
        }else{
            currentSalesUser.setPassword(newPassword);
            System.out.println("Thay doi thanh cong");
        }
    }

    private void changeEmail(Scanner scanner){
        System.out.println("Nhap email moi:");
        String newEmail = scanner.nextLine();
        if (!isValidEmail(newEmail)){
            System.out.println("Mat khau khong hop le , vui long nhap lai:");
            changeEmail(scanner);
        }else if (findUserByEmail(newEmail) != null){
            System.out.println("Email da ton tai, vui long nhap lai:");
            changeEmail(scanner);
        }
        else{
            currentSalesUser.setEmail(newEmail);
            System.out.println("Thay doi thanh cong");
        }
    }
// Log In End ------------------------------------------------------------------------------------------------------







// Register Starts --------------------------------------------------------------------------------------------------

    public void register(Scanner scanner, ArrayList<SalesUser> salesUsers,Map<Integer, Staff>staffMap){
        System.out.println("Tao tai khoan moi");
        System.out.println("Nhap username moi:");
        String username = scanner.nextLine();
        System.out.println("Nhap email :");
        String email= scanner.nextLine();
        System.out.println("Nhap mat khau :");
        String password = scanner.nextLine();
        if (findUserByUsername(username) != null){
            System.out.println("Username da ton tai, vui long nhap lai:");
        }else if (findUserByEmail(email) != null){
            System.out.println("Email da ton tai, vui long nhap lai:");
        }else if (!isValidEmail(email)){
            System.out.println("Email khong hop le, vui long nhap lai:");
        }else if (!isValidPassword(password)){
            System.out.println("Mat khau khong hop le, vui long nhap lai :");
        }else {
            SalesUser newSalesUser = new SalesUser(username,email,password);
            salesUserList.add(newSalesUser);
            salesUsers.add(newSalesUser);
            System.out.println("Tao tai khoan thanh cong ");
            inputMenu(scanner, salesUsers,staffMap);
        }
    }








// Register End -----------------------------------------------------------------------------------------------------

    private SalesUser findUserByUsername(String username){
        for (SalesUser salesUser : salesUserList) {
            if (salesUser.getUsername().equals(username)) {
                return salesUser;
            }
        }
        return null;
    }

    private SalesUser findUserByEmail(String email) {
        for (SalesUser salesUser : salesUserList) {
            if (salesUser.getEmail().equals(email)) {
                return salesUser;
            }
        }
        return null;
    }
    private  boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[.,-_;])(?=.{7,15}$).*$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    private  boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
