package LogIn_LogOut.service;

import LogIn_LogOut.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogInOutService {
    private static List<User> userList = new ArrayList<>();
    private static User currentUser;


    // Phan menu
    public static void inputMenu(Scanner scanner, ArrayList<User> users){
        int choose;
        do {
            System.out.println("Chon mot tuy chon:");
            System.out.println("1. Dang nhap");
            System.out.println("2. Dang ky");
            System.out.println("Enter your choice:");

            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    login(scanner, users);
                    break;
                case 2:
                    register(scanner, users);
                    break;
                default:
                    System.out.println("Lua chon khong hop len , vui long nhap lai");
                    break;
            }
        }while (true);
    }


// Log In Start ------------------------------------------------------------------------------------------------
    // Phan dang nhap
    public static void login(Scanner scanner, ArrayList<User> users){
        System.out.println("Dang nhap");
        System.out.println("Nhap usename :");
        String username = scanner.nextLine();
        System.out.println("Nhap password :");
        String password = scanner.nextLine();

        User user = findUserByUsername(username);
        if (user == null) {
            System.out.println("Kiem tra lai username");
        }else if (!user.getPassword().equals(password)){
            int choice;
            do{
            System.out.println("Nhap sai password");
            System.out.println("Chon 1 tuy chon:");
            System.out.println("1. Dang nhap lai");
            System.out.println("2. Quen mat khau");
             choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    login(scanner,users);
                    return;
                case 2:
                    forgotPassword(scanner,users);
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
            }while (true);
        }else {
            currentUser =user;
            System.out.println("Chao mung " + user.getUsername() + ", ban co the thuc hien cong viec sau:");
            int choice;
            do {
            System.out.println("1. Thay doi username");
            System.out.println("2. Thay doi email");
            System.out.println("3. Thay doi mat khau");
            System.out.println("4. Dang xuat");
            System.out.println("0. Thoat chuong trinh ");
             choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    changeUsername(scanner,users);
                    break;
                case 2:
                    changeEmail(scanner, users);
                    break;
                case 3:
                    changePassword(scanner, users);
                    break;
                case 4:
                    inputMenu(scanner, users);
                    return;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai:");
                    break;
                }
            }while (true);
        }
    }

    // phan quen mk
    private static void forgotPassword(Scanner scanner, ArrayList<User>users){
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

    private static void changeUsername(Scanner scanner,ArrayList<User> users){
        System.out.println("Nhap username moi:");
        String newUsername = scanner.nextLine();
        if (findUserByUsername(newUsername) != null){
            System.out.println("Username da ton tai , vui long nhap lai:");
            changeUsername(scanner,users);
        }else{
            currentUser.setUsername(newUsername);
            System.out.println("Thay doi thanh cong");

        }
    }

    private static void changePassword(Scanner scanner,ArrayList<User> users){
        System.out.println("Nhap password moi:");
        String newPassword = scanner.nextLine();
        if (!isValidPassword(newPassword)){
            System.out.println("Mat khau khong hop le , vui long nhap lai:");
            changePassword(scanner,users);
        }else{
            currentUser.setPassword(newPassword);
            System.out.println("Thay doi thanh cong");
        }
    }

    private static void changeEmail(Scanner scanner,ArrayList<User> users){
        System.out.println("Nhap email moi:");
        String newEmail = scanner.nextLine();
        if (!isValidEmail(newEmail)){
            System.out.println("Mat khau khong hop le , vui long nhap lai:");
            changeEmail(scanner, users);
        }else if (findUserByEmail(newEmail) != null){
            System.out.println("Email da ton tai, vui long nhap lai:");
            changeEmail(scanner,users);
        }
        else{
            currentUser.setEmail(newEmail);
            System.out.println("Thay doi thanh cong");
        }
    }
// Log In End ------------------------------------------------------------------------------------------------------

        public static void register(Scanner scanner, ArrayList<User>users){
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
            User newUser = new User(username,email,password);
            userList.add(newUser);
            users.add(newUser);
            System.out.println("Tao tai khoan thanh cong ");
            inputMenu(scanner, users);
        }
    }





// Register Starts --------------------------------------------------------------------------------------------------










// Register End -----------------------------------------------------------------------------------------------------

    private static User findUserByUsername(String username){
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    private static User findUserByEmail(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
    private static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[.,-_;])(?=.{7,15}$).*$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
