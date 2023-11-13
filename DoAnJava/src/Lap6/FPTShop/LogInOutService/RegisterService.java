package Lap6.FPTShop.LogInOutService;

import Lap6.FPTShop.Account.User;
import Lap6.Utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterService {
    Utils utils = new Utils();
    ArrayList<User> users = new ArrayList<>();
    public User currentUser;


    // Tạo ra tài khoản quản lý mặc định
    public void managerAccount(){
        User managerAccount = new User("admin","admin123",1);
        users.add(managerAccount);
    }



    // Phần đăng ký tài khoản người dùng ( chỉ người dùng được đăng ký )
    public void register(Scanner scanner){
        System.out.println("Tao tai khoan moi");
        System.out.println("Nhap username moi:");
        String username = utils.inputString(scanner);
        System.out.println("Nhap email :");
        String email= utils.inputString(scanner);
        System.out.println("Nhap mat khau :");
        String password = utils.inputString(scanner);
        if (findUserByUsername(username) != null){
            System.out.println("Username da ton tai, vui long nhap lai:");
        }else if (findUserByEmail(email) != null){
            System.out.println("Email da ton tai, vui long nhap lai:");
        }else if (!isValidEmail(email)){
            System.out.println("Email khong hop le, vui long nhap lai:");
        }else if (!isValidPassword(password)){
            System.out.println("Mat khau khong hop le, vui long nhap lai :");
        }else {
            int role = 3;
            User newUser = new User(username,email,password,role);
            users.add(newUser);
            System.out.println("Tao tai khoan thanh cong ");

        }
    }







    // Phần đăng ký tài khoản nhân viên mới ( chỉ dược tạo bởi Quản lý)
    public void registerStaff(Scanner scanner){
        System.out.println("Tao tai khoan moi");
        System.out.println("Nhap username moi:");
        String username = utils.inputString(scanner);
        System.out.println("Nhap email :");
        String email= utils.inputString(scanner);
        System.out.println("Nhap mat khau :");
        String password = utils.inputString(scanner);
        if (findUserByUsername(username) != null){
            System.out.println("Username da ton tai, vui long nhap lai:");
        }else if (findUserByEmail(email) != null){
            System.out.println("Email da ton tai, vui long nhap lai:");
        }else if (!isValidEmail(email)){
            System.out.println("Email khong hop le, vui long nhap lai:");
        }else if (!isValidPassword(password)){
            System.out.println("Mat khau khong hop le, vui long nhap lai :");
        }else {
            int role = 2;
            User newStaff = new User(username,email,password,role);
            users.add(newStaff);
            System.out.println("Tao tai khoan thanh cong ");
        }
    }





    // Phương thức kiểm tra Username và Email////////
    User findUserByUsername(String username){
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
     User findUserByEmail(String email) {
        for (User User : users) {
            if (User.getEmail().equals(email)) {
                return User;
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
    private  boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[.,-_;])(?=.{7,15}$).*$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }








    // Phương thức lấy lại mật khẩu và đổi mật khẩu , username , emal
    void forgotPassword(Scanner scanner){
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
    private void changeUsername(Scanner scanner){
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
    private void changePassword(Scanner scanner){
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
    private void changeEmail(Scanner scanner){
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
