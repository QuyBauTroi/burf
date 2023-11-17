package Lap6.Shop.Service;

import Lap6.Shop.Account.User;
import Lap6.Shop.entities.Customer;
import Lap6.Shop.entities.Staff;
import Lap6.Utils.Utils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterService {
    Utils utils = new Utils();
    ArrayList<User> users = new ArrayList<>();
    Map<Integer,Customer> customerMap = new HashMap<>();
    public User currentUser;
    Map<Integer,Staff> staffMap = new HashMap<>();

    // Tạo ra tài khoản quản lý mặc định
    public void managerAccount(){
        User managerAccount = new User("admin","admin123",1);
        users.add(managerAccount);
    }



    // Phần đăng ký tài khoản người dùng ( chỉ người dùng được đăng ký )
    public void register(Scanner scanner){
        System.out.println("Tao tai khoan moi");
        System.out.print("Nhap username moi:");
        String username = utils.inputString(scanner);
        System.out.println("Nhap email :");
        String email= utils.inputString(scanner);
        System.out.println("Nhap mat khau :");
        String password = utils.inputString(scanner);
        if (findUserByUsername(username) != null){
            System.out.println("Username da ton tai, vui long nhap lai:");
        }else if (null != findUserByEmail(email)) System.out.println("Email da ton tai, vui long nhap lai:");
        else if (!isValidEmail(email)) System.out.println("Email khong hop le, vui long nhap lai:");
        else if (!isValidPassword(password)){
            System.out.println("Mat khau khong hop le, vui long nhap lai :");
        }else {
            int role = 3;
            User newUser = new User(username,email,password,role);
            users.add(newUser);
            System.out.println("Tài khoản đã được tạo thành công");
        }
    }


    public void viewCustomer(){
        System.out.println(customerMap);// Hiển thị tất cả thông tin của tất cả người dùng
    }






    //  - Phần đăng ký tài khoản nhân viên mới ( chỉ dược tạo bởi Quản lý)
    public void registerStaff(Scanner scanner){
        System.out.println("Tao tai khoan nhan vien moi");
        System.out.print("Nhap username moi:");
        String username = utils.inputString(scanner);
        System.out.print("Nhap mat khau :");
        String password = utils.inputString(scanner);
        if (findUserByUsername(username) != null){
            System.out.println("Username da ton tai, vui long nhap lai:");
        }else if (!isValidPassword(password)){
            System.out.println("Mat khau khong hop le, vui long nhap lai :");
        }else {
            System.out.println("Moi ban xac thuc thong tin cho tai khoan:");
            int role = 2;
            User newStaff = new User(username,password,role);
            users.add(newStaff);
            System.out.println("Nhap ho va ten :");
            String name = utils.inputString(scanner);
            System.out.println("Nhap so dien thoai :");
            String phoneNumber = utils.inputString(scanner);
            System.out.println("Nhap email:");
            String email = utils.inputString(scanner);
            System.out.println("Nhap dia chi nha :");
            String address = utils.inputString(scanner);
            Staff staff = new Staff(username,email,password,role,name,phoneNumber,address);
            staffMap.put(staff.getId(),staff);
            System.out.println("Tài khoản đã được tạo thành công");
        }
    }
    public void viewStaff(){
        System.out.println(staffMap);// Hiển thị tất cả thông tin của tất cả nhân viên
    }









    // Phương thức kiểm tra Username và Email////////
    public User findUserByUsername(String username){
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
     public User findUserByEmail(String email) {
        for (User User : users) {
            if (Objects.equals(User.getEmail(), email)) {
                return User;
            } else {
                continue;
            }
        }
        return null;
    }






    // Phương thức kiểm tra tiêu chuẩn của email và password///////
    private  boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[.,-_;])(?=.{7,15}$).*$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }








    // Phương thức lấy lại mật khẩu và đổi mật khẩu , username , emal
    public void forgotPassword(Scanner scanner){
        System.out.println("Quen mat khau");
        System.out.println("Moi ban nhap email :");
        String email = utils.inputString(scanner);
        if (findUserByEmail(email) == null){
            System.out.println("Email khong ton tai ");
        }else {
            System.out.println("Nhap mat khau moi:");
            String newPassword = utils.inputString(scanner);
            findUserByEmail(email).setPassword(newPassword);
            System.out.println("Doi mat khau thanh cong");
        }
    }
    public void changeUsername(Scanner scanner){
        System.out.println("Nhap username moi:");
        String newUsername = utils.inputString(scanner);
        if (findUserByUsername(newUsername) != null){
            System.out.println("Username da ton tai , vui long nhap lai:");
            changeUsername(scanner);
        }else{
            currentUser.setUsername(newUsername);
            System.out.println("Thay doi thanh cong");

        }
    }
    public void changePassword(Scanner scanner){
        System.out.println("Nhap password moi:");
        String newPassword = utils.inputString(scanner);
        if (!isValidPassword(newPassword)){
            System.out.println("Mat khau khong hop le , vui long nhap lai:");
            changePassword(scanner);
        }else{
            currentUser.setPassword(newPassword);
            System.out.println("Thay doi thanh cong");
        }
    }
    public void changeEmail(Scanner scanner){
        System.out.println("Nhap email moi:");
        String newEmail = utils.inputString(scanner);
        if (!isValidEmail(newEmail)){
            System.out.println("Mat khau khong hop le , vui long nhap lai:");
            changeEmail(scanner);
        }else if (findUserByEmail(newEmail) != null){
            System.out.println("Email da ton tai, vui long nhap lai:");
            changeEmail(scanner);
        }
        else{
            currentUser.setEmail(newEmail);
            System.out.println("Thay doi thanh cong");
        }
    }
}
